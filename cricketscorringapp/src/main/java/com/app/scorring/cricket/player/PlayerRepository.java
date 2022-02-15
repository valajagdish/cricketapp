package com.app.scorring.cricket.player;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface PlayerRepository extends JpaRepository<Player, Long> {
	
	List<Player> findPlayersByTeamId(long teamId);
}
