package com.ironhack.movieservice.controller.interfaces;

import com.ironhack.movieservice.model.Movie;

import java.util.List;

public interface MovieController {
    List<Movie> getAllMovies();
    Movie addMovie(Movie movie);
    Movie getMovie(String id);
    void deleteMovie( String id);




}
