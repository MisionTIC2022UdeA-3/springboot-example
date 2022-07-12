package com.example.demo.entities;

import java.time.LocalDate;

public class Task {
    private int id;
    private String description;
    private Boolean done;
    private LocalDate dueDate;

    public Task(int id, String description, Boolean done, LocalDate dueDate){
        this.id = id;
        this.description = description;
        this.done = done;
        this.dueDate = dueDate;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
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
