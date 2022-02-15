package com.app.scorring.cricket.scorring;

import javax.persistence.Entity;


import org.hibernate.annotations.Immutable;

import com.app.scorring.cricket.team.Team;


public class Score {
	
	
	private  int run;
	private  Team team;
	
	
	public int getRun() {
		return run;
	}
	public void setRun(int run) {
		this.run = run;
	}
	public Team getTeam() {
		return team;
	}
	public void setTeam(Team team) {
		this.team = team;
	}
    
    
	
    
    
	

}
