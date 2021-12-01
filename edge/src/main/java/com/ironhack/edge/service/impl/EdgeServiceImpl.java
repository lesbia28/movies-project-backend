package com.ironhack.edge.service.impl;

import com.ironhack.edge.client.MovieClient;
import com.ironhack.edge.controller.dto.MovieDTO;
import com.ironhack.edge.service.interfaces.EdgeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;


@Service
public class EdgeServiceImpl implements EdgeService {

    @Autowired
    MovieClient movieClient;


    public List<MovieDTO> getAllMovies() {
        return movieClient.getAllMovies();
    }
}
