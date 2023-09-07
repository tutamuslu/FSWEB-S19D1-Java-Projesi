package com.workintech.restApi.movierestapi.service;

import com.workintech.restApi.movierestapi.entity.Actor;
import com.workintech.restApi.movierestapi.entity.Movie;

import java.util.List;

public interface MovieService {
    List<Movie> findAll();
    Movie findById(int id);
    Movie save(Movie movie);
    Movie delete(int id);

}
