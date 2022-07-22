package com.example.demo.controllers;

import com.example.demo.entities.TaskList;
import com.example.demo.services.TaskService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.time.LocalDate;

@RestController
public class TaskController {
    TaskService service;

    public TaskController(){
        this.service = new TaskService();
    }

    @GetMapping("/tasks")
    public TaskList TaskList(){
        return this.service.getTaskList();
    }
}
