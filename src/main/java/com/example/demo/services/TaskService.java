package com.example.demo.services;

import com.example.demo.entities.Task;
import com.example.demo.entities.TaskList;
import com.example.demo.repositories.TaskRepository;
import org.springframework.stereotype.Service;

import java.time.LocalDate;
import java.util.List;
import java.util.stream.Collectors;

import static java.lang.Integer.parseInt;

@Service
public class TaskService {
    Task tarea1;
    Task tarea2;
    TaskList propositos;

    public TaskService(TaskRepository taskRepository) {
        this.tarea1 = new Task(1,"Aprender Java", false, LocalDate.of(2022,12,31) );
        this.tarea2 = new Task(2,"Aprender HTML", false, LocalDate.of(2022,12,31) );

        this.propositos = new TaskList("Propositos fin de año");

        this.propositos.addTask(tarea1);
        this.propositos.addTask(tarea2);
    }

    public TaskList getTaskList(){
        return this.propositos;
    }

    public Task getTask(String id){
        return this.propositos.getTaskList().stream().filter(el -> el.getId() == parseInt(id)).toList().get(0);
    }

}
