package com.app.scorring.cricket.player;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;

import com.app.scorring.cricket.team.Team;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Data
@AllArgsConstructor
@NoArgsConstructor
public class Player {
	public Player() {
    }

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Long playerId;
	private String playerName;
	private String county;
	private String position;
	private int age;
	private boolean isAllrounder;
	
    @ManyToOne(fetch = FetchType.LAZY)
        @JoinColumn(name = "team_id", nullable = false)
        private Team team;

    
	
	
	
	
}
