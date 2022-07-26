package com.example.demo.entities;

import net.bytebuddy.implementation.bind.annotation.Default;
import org.springframework.boot.context.properties.bind.DefaultValue;

import javax.persistence.*;
import java.time.LocalDate;

@Entity
@Table(name="task")
public class Task {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    public long id;
    @Column(name="description")
    private String description;
    @Column(name="done", columnDefinition = "boolean default false")
    private Boolean done;
    @Column(name="dueDate")
    private LocalDate dueDate;

    public Task() {
    }

    public Task(String description, LocalDate dueDate){
        this.description = description;
        this.dueDate = dueDate;
        this.done=false;
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
