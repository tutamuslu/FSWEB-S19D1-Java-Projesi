package com.workintech.restApi.movierestapi.repository;

import com.workintech.restApi.movierestapi.entity.Movie;
import org.springframework.data.jpa.repository.JpaRepository;

public interface MovieRepository extends JpaRepository<Movie, Integer> {
}
