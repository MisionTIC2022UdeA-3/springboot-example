package com.example.demo.controllers;

import com.example.demo.entities.Task;
import com.example.demo.services.TaskService;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import java.util.List;

@Controller
public class FrontControllers {

    TaskService service;
    public FrontControllers(TaskService service){
        this.service = service;
    }

    @GetMapping("/")
    public String index(){
        return "index";
    }

    @GetMapping("/tasks")
    public String tasks(Model model){
        List<Task> tasks = this.service.getTaskList();
        model.addAttribute("tasks", tasks);
        return "tasks";
    }

    @GetMapping("/tasks/new")
    public String newTask(Model model){
        model.addAttribute("task", new Task());
        return "new-task";
    }
}
