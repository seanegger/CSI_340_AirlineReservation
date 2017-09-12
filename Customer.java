import java.util.HashMap;

public class Customer {
	HashMap<Integer, Seat> seats;
	Flight flights[];


	/**
	 * Prints out a customers flight itinerary which includes:
	 * flght number, departure time, departure date, departure location,
	 * destination, flight duration, seat number
	 */
	public void printItinerary(flightID) {
		Flight flight = flights[flightID];
		string toPrint = "";
		toPrint += "Flight Number: " + flightID + "\n";
		toPrint += "Origin: " + flight.getDeparturePlace() + "\t";
		toPrint += "Date and Time: " + flight.getDepartureDate() + "\t";
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
