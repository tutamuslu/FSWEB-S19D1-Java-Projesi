package com.workintech.restApi.movierestapi.dto;

import com.workintech.restApi.movierestapi.entity.Movie;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.LocalDate;
@Data
@NoArgsConstructor
@AllArgsConstructor

public class MovieActorResponse {
    private Movie movie;
    private int actorId;
    private String actorFistName;
    private String actorLastName;
    private LocalDate actorBirthDate;
}
