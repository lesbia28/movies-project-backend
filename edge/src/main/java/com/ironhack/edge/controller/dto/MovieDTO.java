package com.ironhack.edge.controller.dto;

public class MovieDTO {
    private String id;
    private String title;
    private int year;
    private String image;
    private String director;
    private String actors;

    public MovieDTO() {
    }

    public MovieDTO(String id, String title, int year, String image, String director, String actors) {
        this.id = id;
        this.title = title;
        this.year = year;
        this.image = image;
        this.director = director;
        this.actors = actors;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public String getImage() {
        return image;
    }

    public void setImage(String image) {
        this.image = image;
    }

    public String getDirector() {
        return director;
    }

    public void setDirector(String director) {
        this.director = director;
    }

    public String getActors() {
        return actors;
    }

    public void setActors(String actors) {
        this.actors = actors;
    }
}


