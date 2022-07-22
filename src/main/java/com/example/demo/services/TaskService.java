package com.example.demo.services;

import com.example.demo.entities.Task;
import com.example.demo.entities.TaskList;

import java.time.LocalDate;

public class TaskService {
    Task tarea1;
    Task tarea2;
    TaskList propositos;

    public TaskService(){
        this.tarea1 = new Task("Aprender Java", false, LocalDate.of(2022,12,31) );
        this.tarea2 = new Task("Aprender HTML", false, LocalDate.of(2022,12,31) );
        this.propositos = new TaskList("Propositos fin de año");
        propositos.addTask(tarea1);
        propositos.addTask(tarea2);
    }

    public TaskList getTaskList(){
        return this.propositos;
    }

}
