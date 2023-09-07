package com.workintech.restApi.movierestapi.repository;

import com.workintech.restApi.movierestapi.entity.Actor;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ActorRepository extends JpaRepository<Actor, Integer> {
}
