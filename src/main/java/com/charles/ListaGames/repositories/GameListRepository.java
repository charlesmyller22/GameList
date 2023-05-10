package com.charles.ListaGames.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.charles.ListaGames.entities.GameList;

public interface GameListRepository extends JpaRepository<GameList, Long> {
	
	
}
