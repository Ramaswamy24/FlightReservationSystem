package com.flight.dao;

import java.util.ArrayList;

import org.springframework.data.jpa.repository.JpaRepository;

import com.flight.models.PassangerBean;
import com.flight.models.Reservationbean;

public interface PassangerDetailsRepo extends JpaRepository<PassangerBean, Long>{
	
	ArrayList<PassangerBean> findByReserveid(Reservationbean reserveid);

}
