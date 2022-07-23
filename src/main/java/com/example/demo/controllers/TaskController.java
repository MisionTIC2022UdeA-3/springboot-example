package com.example.demo.controllers;

import com.example.demo.entities.Task;
import com.example.demo.entities.TaskList;
import com.example.demo.services.TaskService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.time.LocalDate;
import java.util.List;

@RestController
public class TaskController {
    TaskService service;

    public TaskController(TaskService service){
        this.service = service;
    }

    @GetMapping("/tasks")
    public List<Task> TaskList(){
        return this.service.getTaskList();
    }
}
