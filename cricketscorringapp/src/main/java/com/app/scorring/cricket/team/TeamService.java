package com.app.scorring.cricket.team;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class TeamService {
	
	@Autowired
	private TeamRepository teamRepository;
	
	
	
	public Team saveTeam(Team team) {
		return teamRepository.save(team);
	}
	
	public Team findTeamByPlayerId(long playerId) {
		return teamRepository.findTeamByPlayerId(playerId);
	}

	

}
