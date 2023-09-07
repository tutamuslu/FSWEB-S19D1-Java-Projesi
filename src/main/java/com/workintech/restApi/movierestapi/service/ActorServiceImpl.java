package com.workintech.restApi.movierestapi.service;

import com.workintech.restApi.movierestapi.entity.Actor;
import com.workintech.restApi.movierestapi.repository.ActorRepository;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;
import java.util.Optional;

public class ActorServiceImpl implements ActorService{
    private ActorRepository actorRepository;
    @Autowired
    public ActorServiceImpl(ActorRepository actorRepository) {
        this.actorRepository = actorRepository;
    }
    @Override
    public List<Actor> findAll() {
        return actorRepository.findAll();
    }

    @Override
    public Actor findById(int id) {
        Optional<Actor> actor = actorRepository.findById(id);
        if(actor.isPresent()){
            return actor.get();
        }

        return null;
    }

    @Override
    public Actor save(Actor actor) {
        return actorRepository.save(actor);
    }

    @Override
    public Actor delete(int id) {
        Actor actor = findById(id);
        actorRepository.delete(actor);
        return actor;

    }
}
