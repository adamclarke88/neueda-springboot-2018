package uk.ac.belfastmet.titanicconsumer.service;

import java.util.ArrayList;

import uk.ac.belfastmet.titanicconsumer.domain.Passenger;

//we need to write our own implementation. unlike the crud repo which was done for us

public interface PassengerService { 
	
	public ArrayList<Passenger> list();
	public Passenger get(Integer passengerId);
	public Passenger add(Passenger passenger);
	public Passenger update(Passenger passenger);
	public void delete(Integer passengerId);

}
