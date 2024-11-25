package com.app.service;

import com.app.dto.ReservationDTO;
import com.app.exceptions.LoginException;
import com.app.exceptions.ReservationException;
import com.app.model.Reservations;

import java.util.List;


public interface ReservationService {
	
	public Reservations addReservation(ReservationDTO reservationDTO,String key ) throws ReservationException,LoginException;

	public Reservations updateReservation(Reservations reservation,String key) throws ReservationException,LoginException;
	
	public Reservations deleteReservation(Integer reservationId,String key) throws ReservationException,LoginException;
	
	public Reservations viewAllReservation(Integer reservationId,String key)throws LoginException;
	
	public List<Reservations> getReservationDeatials(String key) throws ReservationException,LoginException;
	
//	public List<Reservations> getAllReservation(LocalDate date) throws ReservationException;
	
	
	
}
