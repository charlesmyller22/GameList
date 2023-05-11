package com.charles.ListaGames.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.charles.ListaGames.dto.GameListDTO;
import com.charles.ListaGames.entities.GameList;
import com.charles.ListaGames.repositories.GameListRepository;


@Service
public class GameListService {
	@Autowired
	private GameListRepository gameListRepository;
	
	@Transactional(readOnly = true)
	public List<GameListDTO> findAll() {
		List<GameList> result = gameListRepository.findAll();
		       
		return result.stream().map(x -> new GameListDTO(x)).toList();
	}
}
