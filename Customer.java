import java.util.HashMap;

public class Customer {

	String fname;
	String lname;
	HashMap<Integer, Seat> seats;
	Flight flights[];


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
	public void printItinerary(int flightID) {
		Flight flight = flights[flightID];
		String toPrint = "";
		toPrint += "Flight Number: " + flightID + "\n";
		toPrint += "Origin: " + flight.getDeparturePlace() + "\t";
		toPrint += "Date and Time: " + flight.getDate() + "\t";
		toPrint += flight.getDepartureTime() + "\n";
		toPrint += "Destination: " + flight.getDestination() + "\t";
		toPrint += "Duration: " + flight.getDuration() + "\t";
		toPrint += "Seat: " + seats.get(flight.getPlaneID()) + "\t";
	}

	/**
	 *
	 * @param seatID
	 * @return
	 */
	public boolean reserveSeat(int seatID)
	{
		if(seats.get(seatID)!=null)
		{
			if(seats.get(seatID).isReserved())
			{
				System.out.println("Seat is already reserved");
				return false;
			}
			else
			{
				seats.get(seatID).setReserved(true);
				System.out.println("Seat reserved");
				return true;
			}
		}
		else
		{
			System.out.println("No Such Seat Exists");
			return false;

		}
	}
}
