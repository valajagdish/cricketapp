package com.app.scorring.cricket.turnament;

import java.util.Date;
import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import com.app.scorring.cricket.user.User;

@Repository
public interface TurnamentRepository extends JpaRepository<Turnament, Long> {
	List<Turnament> getTeamByTurnamentId(Long turnamentId);
	
	@Query("select * from turnamentInfo where scheduledate:date")
	public Turnament getTeamsBydate(@Param("scheduledate") Date date);
	
}
