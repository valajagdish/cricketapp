package com.app.scorring.cricket.player;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class PlayerService {
	
	
	@Autowired
	private PlayerRepository playerRepository; 

	
	public Player savePlayer(Player player) {
		return playerRepository.save(player);
	}


	public List<Player> findPlayersByTeamId(Long teamId) {
		return playerRepository.findPlayersByTeamId(teamId);
	}
	

}
