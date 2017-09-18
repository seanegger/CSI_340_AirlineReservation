import com.sun.org.apache.regexp.internal.RE;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Hashtable;
import java.util.Map;

public class Flight {
	private String departurePlace;
	private String destination;
	private int flightCapacity;
	private float vipPrice;
	private float regularPrice;
	private String date;
	private String departureTime;
	private String duration;
	private Plane plane;
	private int flightID;
	private Map<String, Boolean> seatReservationMap;


	public int getFlightID() {
		return flightID;
	}
	public void setFlightID(int flightID) {
		this.flightID = flightID;
	}
	public String getDeparturePlace() {
		return departurePlace;
	}
	public void setDeparturePlace(String departurePlace) {
		this.departurePlace = departurePlace;
	}
	public String getDestination() {
		return destination;
	}
	public void setDestination(String destination) {
		this.destination = destination;
	}
	public int getFlightCapacity() {
		return flightCapacity;
	}
	public void setFlightCapacity(int flightCapacity) {
		this.flightCapacity = flightCapacity;
	}
	public float getVipPrice() {
		return vipPrice;
	}
	public void setVipPrice(float vipPrice) {
		this.vipPrice = vipPrice;
	}
	public float getRegularPrice() {
		return regularPrice;
	}
	public void setRegularPrice(float regularPrice) {
		this.regularPrice = regularPrice;
	}
	public String getDate() {
		return date;
	}
	public void setDate(String date) {
		this.date = date;
	}
	public String getDepartureTime() {
		return departureTime;
	}
	public void setDepartureTime(String departureTime) {
		this.departureTime = departureTime;
	}
	public String getDuration() {
		return duration;
	}
	public void setDuration(String duration) {
		this.duration = duration;
	}
	public Plane getPlane() {
		return plane;
	}
	public void setPlane(Plane plane) {
		this.plane = plane;
		//add map keeping track of which seat is reserved
		this.seatReservationMap = new Hashtable<String, Boolean>();
		ArrayList<VIPSeat> vseats = plane.getVipSeats();
		for(int i = 0; i < vseats.size(); i++)
		{
			this.seatReservationMap.put(vseats.get(i).getId(), false);
		}
		ArrayList<RegularSeat> rseats = plane.getRegularSeats();
		for(int i = 0; i < rseats.size(); i++)
		{
			this.seatReservationMap.put(rseats.get(i).getId(), false);
		}
	}

	public boolean isSeatReserved(String seatID)
	{
		return seatReservationMap.get(seatID);
	}
	public void reserveSeat(String seatID)
	{
		seatReservationMap.put(seatID, true);
	}
}
