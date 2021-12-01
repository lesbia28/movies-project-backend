package com.ironhack.movieservice.controller.impl;

import com.ironhack.movieservice.controller.interfaces.MovieController;
import com.ironhack.movieservice.model.Movie;
import com.ironhack.movieservice.service.interfaces.MovieService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class MovieControllerImpl implements MovieController {

    @Autowired
    MovieService movieService;


    @GetMapping("/movies")
    @ResponseStatus(HttpStatus.OK)
    public List<Movie> getAllMovies() {
        return movieService.getAllMovies();
    }

    @PostMapping("/movies")
    @ResponseStatus(HttpStatus.CREATED)
    public Movie addMovie(@RequestBody Movie movie) {
        return movieService.addMovie(movie);
    }

    @GetMapping("/movies/{id}")
    @ResponseStatus(HttpStatus.OK)
    public Movie getMovie(@PathVariable String id) {
        return movieService.getMovie(id);
    }

    @DeleteMapping("movies/{id}")
    @ResponseStatus(HttpStatus.NO_CONTENT)
    public void deleteMovie(@PathVariable String id) {
        movieService.deleteMovie(id);
    }


}
