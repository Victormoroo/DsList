package com.javaproject.dslist.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.javaproject.dslist.entities.GameList;

public interface GameListRepository extends JpaRepository<GameList, Long> {
  
}
