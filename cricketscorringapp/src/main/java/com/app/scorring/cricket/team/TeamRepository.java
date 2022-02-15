package com.app.scorring.cricket.team;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface TeamRepository extends JpaRepository<Team, Long>{

	Team findTeamByPlayerId(long playerId);
	
	

}
