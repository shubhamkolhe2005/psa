package com.app.repository;

import com.app.model.CurrentUserSession;
import org.springframework.data.jpa.repository.JpaRepository;

public interface SessionRepo extends JpaRepository<CurrentUserSession, Integer> {

	
	public CurrentUserSession findByUuid(String Uuid);
}
