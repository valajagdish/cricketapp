package com.app.scorring.cricket.team;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.repository.query.Param;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/team")
public class TeamController {
	
	@Autowired
	private TeamService teamService;
	
	@PostMapping
	public Team saveTeam(@RequestBody Team team) {
		return teamService.saveTeam(team);
	}
	
	@GetMapping("/{id}")
	public Team findTeamByPlayerId(@PathVariable("id") Long playerId) {
		return teamService.findTeamByPlayerId(playerId);
	}
	
	
	
	

}
