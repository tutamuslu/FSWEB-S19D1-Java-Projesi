package com.workintech.restApi.movierestapi.controller;


import com.workintech.restApi.movierestapi.dto.MovieActorRequest;
import com.workintech.restApi.movierestapi.dto.MovieActorResponse;
import com.workintech.restApi.movierestapi.entity.Actor;
import com.workintech.restApi.movierestapi.entity.Movie;
import com.workintech.restApi.movierestapi.service.MovieService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/movie")
public class MovieController {

    private MovieService movieService;

    @Autowired
    public MovieController(MovieService movieService){
        this.movieService = movieService;
    }
    @GetMapping("/")
    public List<Movie> findAll(){
        return movieService.findAll();
    }
    @GetMapping("/{id}")
    public Movie findById(@PathVariable int id){return  movieService.findById(id);
    }
    @PostMapping("/")
    public MovieActorResponse save(@RequestBody MovieActorRequest movieActorRequest){
        Movie movie = movieActorRequest.getMovie();
        Actor actor = movieActorRequest.getActor();
        movie.getActors().add(actor);
       Movie savedMovie =  movieService.save(movie);
       return new MovieActorResponse(movie, actor.getId(), actor.getFirstName(),
               actor.getFirstName(), actor.getBirthDate());

    }

}
