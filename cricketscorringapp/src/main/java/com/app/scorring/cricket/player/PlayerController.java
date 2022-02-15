package com.app.scorring.cricket.player;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/player")
public class PlayerController {

	@Autowired
	private PlayerService playerService;
	
	@PostMapping("/")
	public Player savePlayer(@RequestBody Player player) {
		return playerService.savePlayer(player);		
	}
	
	@GetMapping("/{id}")
	public List<Player> findPlayersByTeamId(@PathVariable("id") Long teamId){
		return playerService.findPlayersByTeamId(teamId);
	}
	
}
