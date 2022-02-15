package com.app.scorring.cricket.scorring;

import java.nio.channels.OverlappingFileLockException;

import org.springframework.stereotype.Service;

import com.app.scorring.cricket.team.Team;


public class ScoreService {
	Score score=new Score();
	
	Wicket wicket=new Wicket();
	
	
	public boolean score(Team team, int run)throws ScoreIllegalException {
		boolean scorestatus=true;
		if(run<0) {
			scorestatus=false;
			throw new ScoreIllegalException("Illegal run exception lessthan 0 is not allowed");
		}
		if(run>6) {
			scorestatus=false;
			throw new ScoreIllegalException("Illegal run exception more than 6 run is not valid");
		}
		score.setRun(run);
		score.setTeam(team);
		
		return scorestatus;		
	}
	
	
	public boolean wicket(Team team, int wicketcount)throws ScoreIllegalException {
		boolean wicketStatus=true;
		
		if(wicketcount>1 || wicketcount<0) {
			wicketStatus=false;
			throw new ScoreIllegalException("wicket must be 1");
			
		}
		if (wicket.getWicketCunt()<=wicketcount)
		{
			throw new ScoreIllegalException("old wicket and new wicketcount is either same or smaller  ");
		}
		
		wicket.setTeam(team);
		wicket.setWicketCunt(wicketcount);
		return wicketStatus;
		
	} 

}
