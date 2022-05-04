package com.flight.models;


import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;
import javax.persistence.Table;

import lombok.Data;

@Entity
@Data
@Table(name="Schedule_details")

public class ScheduleBean {
	
	@Id	
	private String scheduleID;
	private int travelDuration;
	private String availableDays;
	private String departureTime;
	
	@OneToOne(cascade = CascadeType.MERGE)
	@JoinColumn (name="flight_id")
	private FlightBean flight;
	
	@OneToOne(cascade = CascadeType.MERGE)
    @JoinColumn(name="route_id")
    private RouteBean route;

	
}
