package com.app.scorring.cricket.turnament;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class TurnamentController {
	
	@Autowired
	private TurnamentService turnamentService;
	
	@PostMapping
	public Turnament saveTurnament(@RequestBody Turnament turnament) {
		return turnamentService.saveTurnament(turnament);
	}
	
	@GetMapping("/turnamet/{id}")
	public List<Turnament> getTeamByTurnamentId(@PathVariable("id") Long turnamentId) {
		return turnamentService.getTeamByTurnamentId(turnamentId);
	}
	
	
	

}
