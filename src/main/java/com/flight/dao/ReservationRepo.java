package com.flight.dao;

import java.util.ArrayList;
import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.flight.models.Reservationbean;
import com.flight.models.ScheduleBean;

public interface ReservationRepo extends JpaRepository<Reservationbean, String> {

ArrayList<Reservationbean> findByScheduleid(ScheduleBean scheduleid);
	public List<Reservationbean> findByScheduleidNotNull();
}
