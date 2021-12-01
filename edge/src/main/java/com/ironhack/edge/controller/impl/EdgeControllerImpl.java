package com.ironhack.edge.controller.impl;

import com.ironhack.edge.controller.dto.MovieDTO;
import com.ironhack.edge.controller.interfaces.EdgeController;
import com.ironhack.edge.service.interfaces.EdgeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@CrossOrigin(origins = "*")
@RestController
public class EdgeControllerImpl implements EdgeController {

    @Autowired
    EdgeService edgeService;


    @GetMapping("/movies")
    @ResponseStatus(HttpStatus.OK)
    public List<MovieDTO> getAllMovies() {
        return edgeService.getAllMovies();
    }
}
