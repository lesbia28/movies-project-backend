package com.ironhack.movieservice.service.interfaces;

import com.ironhack.movieservice.model.Movie;

import java.util.List;

public interface MovieService {
    List<Movie> getAllMovies();
    Movie addMovie(Movie movie);

    Movie getMovie(String id);

    void deleteMovie(String id);
}
