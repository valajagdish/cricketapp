package com.app.scorring.cricket.turnament;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class TurnamentService {
	
	@Autowired
	private TurnamentRepository turnamentRepository;

	public Turnament saveTurnament(Turnament turnament) {
		return turnamentRepository.save(turnament);
	}

	public List<Turnament> getTeamByTurnamentId(Long turnamentId) {
		turnamentRepository.getTeamByTurnamentId(turnamentId);
		
	}

}
