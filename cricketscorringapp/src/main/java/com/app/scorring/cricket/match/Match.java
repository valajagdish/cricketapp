package com.app.scorring.cricket.match;

import java.time.Instant;
import java.util.Date;
import java.util.Set;

import org.hibernate.annotations.Immutable;

import com.app.scorring.cricket.team.Team;

@Immutable
public class Match {
	
	
	private final Long matchId;
	private final Instant startTime;
	private final int overs;	
	private final Set<Team> teamName;
	
	
	//private final Date startdate_time;
	public Match(Long matchId, Instant startTime, int overs, Set<Team> teamName) {
		super();
		this.matchId = matchId;
		this.startTime = startTime;
		this.overs = overs;
		this.teamName = teamName;
	}
	
	
	
	
	
	
	
	
	
	
	

}
