package com.app.scorring.cricket.match;

import java.time.Instant;
import java.util.Date;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.app.scorring.cricket.turnament.Turnament;
import com.app.scorring.cricket.turnament.TurnamentRepository;

@Service
public class MatchService {
	
	@Autowired
	private MatchRepository matchRepository;
	
	@Autowired
	private TurnamentRepository turnamentRepository;
	
	
	

	
	public Match getMatchbydate(Date date) {
		Turnament t=new Turnament();
		Match m=new Match(t.getTurnamentId(),Instant.now(),20,t.getTeamName());
		 t=turnamentRepository.getTeamsBydate(date);
		 
		 
		return null;
		
	}
	
	

}
