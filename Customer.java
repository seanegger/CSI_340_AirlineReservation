import java.util.ArrayList;

public class Customer {

	String fname;
	String lname;
	ArrayList<Reservation> reservations;


	public void setfName(String name) {
		this.fname = name;
	}
	public void setlName(String name) {
		this.lname = name;
	}

	/**
	 * Prints out a customers flight itinerary which includes:
	 * flght number, departure time, departure date, departure location,
	 * destination, flight duration, seat number
	 */
	public void printItinerary() {
		for (int i = 0; i < reservations.size(); i++)
		{
			reservations.get(i).toString();
		}
	}


	/**
	 * Checks if the given seat is available on a flight and makes a
	 * reservation if the seat is not reserved
	 * @param flight The flight the seat is on
	 * @param seat The seat being reserved
	 * @return True if successfully booked, false otherwise.
	 */
	public boolean makeReservation(Flight flight, String seat) {
		//check if seat exists and is unreserved
		Seat x = flight.getPlane().getSeat(seat);
		if (x == null) {
			System.out.println("Seat not found");
			return false;
		}
		if (x.isReserved() == true) {
			System.out.println("Seat already reserved");
			return false;
		}
		Reservation y = new Reservation(flight, seat, this);
		reservations.add(y);
		y.bookFlight();
		System.out.println("Reservation made");
		return true;
	}
}
