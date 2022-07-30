package com.example.demo.controllers;

import com.example.demo.entities.Task;
import com.example.demo.entities.User;
import com.example.demo.services.TaskService;
import com.example.demo.services.UserService;
import org.springframework.security.core.annotation.AuthenticationPrincipal;
import org.springframework.security.oauth2.core.oidc.user.OidcUser;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import java.util.List;
import java.util.Map;

@Controller
public class FrontControllers {

    TaskService taskService;
    UserService userService;
    public FrontControllers(TaskService taskService, UserService userService){
        this.taskService = taskService;
        this.userService = userService;
    }

    @GetMapping("/")
    public String index(Model model, @AuthenticationPrincipal OidcUser principal){

        if (principal != null) {
            Map<String, Object> userData = principal.getClaims();
            System.out.println(userData);
            String email = (String) userData.get("email");
            User user = this.userService.getUser(email);

            if(user == null){
                String auth0Id = (String) userData.get("sub");
                String image = (String) userData.get("picture");
                User newUser = new User(email=email, auth0Id=auth0Id, image=image);
                user = this.userService.createUser(newUser);
            }

            System.out.println(user);

        }
        return "index";
    }

    @GetMapping("/tasks")
    public String tasks(Model model){
        List<Task> tasks = this.taskService.getTaskList();
        model.addAttribute("tasks", tasks);
        return "tasks";
    }

    @GetMapping("/tasks/new")
    public String newTask(Model model){
        model.addAttribute("task", new Task());
        return "new-task";
    }
}
