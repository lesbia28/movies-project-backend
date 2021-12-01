package com.ironhack.movieservice.service.impl;

import com.ironhack.movieservice.model.Movie;
import com.ironhack.movieservice.repository.MovieRepository;
import com.ironhack.movieservice.service.interfaces.MovieService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Service;
import org.springframework.web.server.ResponseStatusException;

import java.util.List;
import java.util.Optional;

@Service
public class MovieServiceImpl implements MovieService {

    @Autowired
    MovieRepository movieRepository;


    public List<Movie> getAllMovies() {
        return movieRepository.findAll();
    }
    public Movie addMovie(Movie movie) {
        return movieRepository.save(movie);
    }
    public Movie getMovie(String id) {
        Optional<Movie> optionalMovie = movieRepository.findById(id);
        if(optionalMovie.isPresent()){
            return optionalMovie.get();
        }
        else{
            throw new ResponseStatusException(HttpStatus.NOT_FOUND,"The movie with id "+id+" is not found");
        }
    }


    public void deleteMovie(String id) {
        Optional<Movie> optionalMovie = movieRepository.findById(id);
        if(optionalMovie.isPresent()){
            movieRepository.deleteById(id);
        }
        else{
            throw new ResponseStatusException(HttpStatus.NOT_FOUND,"The movie with id "+id+" is not found");
        }
    }


}
