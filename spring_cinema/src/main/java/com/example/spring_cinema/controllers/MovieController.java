package com.example.spring_cinema.controllers;


import com.example.spring_cinema.models.Movie;
import com.example.spring_cinema.services.MovieService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping(value = "/movies")
public class MovieController {

    @Autowired
    MovieService movieService;


    @GetMapping
    public ResponseEntity<List<Movie>> getMovies(){

        return new ResponseEntity<>(movieService.getMovies(), HttpStatus.OK);
    }

    // get by ID mapping
    @GetMapping(value = "/{id}")
    public ResponseEntity<Optional<Movie>> getMovieById(@PathVariable long id){

        return new ResponseEntity<>(movieService.getMovieById(id), HttpStatus.OK);
    }

    @PostMapping
    public ResponseEntity<Movie> addMovie(@RequestBody Movie givenMovie){
        movieService.saveMovie(givenMovie);
        return new ResponseEntity<>(givenMovie, HttpStatus.OK);
    }



//    @GetMapping(value = "/{id}")
//    public ResponseEntity<String> getMovieById(@PathVariable long id){
//        Movie movie;
//        movie.setId(id);
//
//        String returnMovie = movie.getTitle();
//
//        return new ResponseEntity<>(returnMovie, HttpStatus.OK);
//    }


}
