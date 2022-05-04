package com.flight.models;



import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.OneToOne;
import javax.persistence.Table;

import com.fasterxml.jackson.annotation.JsonIgnore;

import lombok.Data;
@Data
@Entity
@Table(name="Route_details")
public class RouteBean {

	@Id
	private	String routeID;
	private	String source;
	private	String destination;
	private	int distance;
	private	double fare;
	
	@OneToOne(mappedBy = "route",orphanRemoval = true)
	@JsonIgnore
	private ScheduleBean schdlroutes;

}
