package com.app.repository;

import com.app.model.Reservations;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.time.LocalDate;
import java.util.List;

@Repository
public interface ReservationRepo extends JpaRepository<Reservations, Integer> {
	
	public List<Reservations> findByReservationDate(LocalDate date);

}
