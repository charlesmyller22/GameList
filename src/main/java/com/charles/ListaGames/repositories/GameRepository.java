package com.charles.ListaGames.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.charles.ListaGames.entities.Game;

public interface GameRepository extends JpaRepository<Game, Long> {
	
	
}
