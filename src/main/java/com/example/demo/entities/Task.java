package com.example.demo.entities;

import java.time.LocalDate;

public class Task {
    private String description;
    private Boolean done;
    private LocalDate dueDate;


    public Task(String description, Boolean done, LocalDate dueDate){
        this.description = description;
        this.done = done;
        this.dueDate = dueDate;
    }

    public String getDescription(){
        return this.description;
    }

    public void setDescription(String description){
        this.description = description;
    }

    public Boolean getDone() {
        return done;
    }

    public void setDone(Boolean done) {
        this.done = done;
    }

    public LocalDate getDueDate() {
        return dueDate;
    }

    public void setDueDate(LocalDate dueDate) {
        this.dueDate = dueDate;
    }
}
