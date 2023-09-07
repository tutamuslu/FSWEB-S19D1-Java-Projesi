package com.workintech.restApi.movierestapi.dto;

import com.workintech.restApi.movierestapi.entity.Actor;
import com.workintech.restApi.movierestapi.entity.Movie;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor

public class MovieActorRequest {
    private Movie movie;
    private Actor actor;
}
