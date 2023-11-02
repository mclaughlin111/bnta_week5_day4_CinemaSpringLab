package com.example.spring_cinema.models;

import jakarta.persistence.*;
import jakarta.persistence.Entity;
import jakarta.persistence.Table;

@Entity
@Table(name = "movies")
public class Movie {
    //Id

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;
    //title
    @Column(name = "Title")
    private String title;

    //rating
    @Column(name = "Rating")
    private int rating;

    //duration
    @Column(name = "Duration")
    private double duration;

    public Movie(String title, int rating, double duration){
        this.title = title;
        this.rating = rating;
        this.duration = duration;
    }

    public Movie(){}

    //ID METHODS
    public long getId() {
        return id;
    }
    public void setId(long id) {
        this.id = id;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public int getRating() {
        return rating;
    }

    public void setRating(int rating) {
        this.rating = rating;
    }

    public double getDuration() {
        return duration;
    }

    public void setDuration(double duration) {
        this.duration = duration;
    }
}
