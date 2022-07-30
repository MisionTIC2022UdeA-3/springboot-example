package com.example.demo.entities;

import javax.persistence.*;

@Entity
@Table(name="users")
public class User {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    public long id;

    @Column(name="email", unique = true)
    private String email;

    @Column(name="auth0Id", unique = true)
    private String auth0Id;

    @Column(name="image")
    private String image;

    public User() {
    }

    public User(String email, String auth0Id, String image){
        this.email = email;
        this. auth0Id = auth0Id;
        this.image = image;

    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getAuth0Id() {
        return auth0Id;
    }

    public void setAuth0Id(String auth0Id) {
        this.auth0Id = auth0Id;
    }

    public String getImage() {
        return image;
    }

    public void setImage(String image) {
        this.image = image;
    }
}
