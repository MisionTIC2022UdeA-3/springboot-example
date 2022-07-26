package com.example.demo.services;

import com.example.demo.entities.Task;
import com.example.demo.entities.TaskList;
import com.example.demo.repositories.TaskRepository;
import org.springframework.stereotype.Service;

import java.time.LocalDate;
import java.util.List;
import java.util.Optional;

@Service
public class TaskService {
    private TaskRepository repository;

    public TaskService(TaskRepository repository){
        this.repository = repository;
    }

    public List<Task> getTaskList(){
        return this.repository.findAll();
    }

    public Task createTask(Task newTask){
        return this.repository.save(newTask);
    }

    public Optional<Task> markTaskAsFinished(Long id){
        Optional<Task> t = this.repository.findById(id);
        if(t.isPresent()){
            t.get().setDone(true);
            this.repository.save(t.get());
            return t;
        }

        return Optional.empty();
    }

    public Boolean deleteTask(Long id){
        this.repository.deleteById(id);
        return true;
    }

}
