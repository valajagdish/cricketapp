package com.app.scorring.cricket.turnament;

import java.util.Date;
import java.util.Set;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

import com.app.scorring.cricket.team.Team;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Data
@AllArgsConstructor
@NoArgsConstructor
public class Turnament {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Long turnamentId;
	private String turnamentName;
	private Set<Team> teamName;
	public Long getTurnamentId() {
		return turnamentId;
	}
	public void setTurnamentId(Long turnamentId) {
		this.turnamentId = turnamentId;
	}
	public String getTurnamentName() {
		return turnamentName;
	}
	public void setTurnamentName(String turnamentName) {
		this.turnamentName = turnamentName;
	}
	public Set<Team> getTeamName() {
		return teamName;
	}
	public void setTeamName(Set<Team> teamName) {
		this.teamName = teamName;
	}
	
	
	
	
	
	
	
	
	
	
	
	
}
