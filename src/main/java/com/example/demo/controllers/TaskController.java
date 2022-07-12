package com.example.demo.controllers;

import com.example.demo.entities.Task;
import com.example.demo.entities.TaskList;
import com.example.demo.services.TaskService;
import org.springframework.web.bind.annotation.*;

import java.time.LocalDate;

@RestController
public class TaskController {
    private final TaskService taskService;

    public TaskController(TaskService taskService) {
        this.taskService = taskService;
    }

    @GetMapping("/tasks")
    public TaskList test() {
        return taskService.getTaskList();
    }
    @GetMapping("/tasks/{id}")
    public Task getTask(@PathVariable String id){
        return taskService.getTask(id);
    }


//    @PostMapping("/tasks/add")
//    public void addTask(@RequestBody Task task){
//        taskService.addTask(task);
//    }
}
