package com.ironhack.profileservice.model;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Document(collection = "profile")
public class Profile {
    @Id
    private String username;
    private String password;
    private String email;
    private String image;
    private String biography;

    public Profile() {
    }

    public Profile(String username, String password, String email, String image, String biography) {
        this.username = username;
        this.password = password;
        this.email = email;
        this.image = image;
        this.biography = biography;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getImage() {
        return image;
    }

    public void setImage(String image) {
        this.image = image;
    }

    public String getBiography() {
        return biography;
    }

    public void setBiography(String biography) {
        this.biography = biography;
    }
}
