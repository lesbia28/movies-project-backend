package com.ironhack.movieservice.repository;

import com.ironhack.movieservice.model.Movie;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface MovieRepository extends MongoRepository <Movie,String>  {

}
