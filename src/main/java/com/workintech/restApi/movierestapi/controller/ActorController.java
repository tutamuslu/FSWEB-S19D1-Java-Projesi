package com.workintech.restApi.movierestapi.controller;

import com.workintech.restApi.movierestapi.entity.Actor;
import com.workintech.restApi.movierestapi.service.ActorService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/actor")
public class ActorController {
    private ActorService actorService;

    @Autowired
    public ActorController (ActorService  actorService) {
        this. actorService =  actorService;
    }

    @GetMapping("/")
    public List<Actor> findAll(){
        return  actorService.findAll();
    }
    @GetMapping("/{id}")
    public Actor findById(@PathVariable int id){
        return  actorService.findById(id);
    }
    @PostMapping("/")
    public Actor save(@RequestBody Actor actor){
        return  actorService.save(actor);
    }
    @PutMapping("/{id}")
    public Actor update(@RequestBody Actor actor, @PathVariable int id){
        Actor foundCategory = findById(id);
        if(foundCategory != null) {
            actor.setId(id);
            return  actorService.save(actor);
        }
        return null;
    }


}
