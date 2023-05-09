package com.javaproject.dslist.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.javaproject.dslist.entities.Game;

public interface GameRepository extends JpaRepository<Game, Long> {
  
}
