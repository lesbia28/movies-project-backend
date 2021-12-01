package com.ironhack.edge.client;

import com.ironhack.edge.controller.dto.MovieDTO;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;

import java.util.List;

@FeignClient("movie-service")
public interface MovieClient{
    @GetMapping("/movies")
    List<MovieDTO> getAllMovies();



}
