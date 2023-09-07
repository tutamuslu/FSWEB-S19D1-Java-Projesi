package com.workintech.restApi.movierestapi.service;

import com.workintech.restApi.movierestapi.entity.Actor;

import java.util.List;

public interface ActorService {
    List<Actor>findAll();
    Actor findById(int id);
    Actor save(Actor actor);
    Actor delete(int id);

}
