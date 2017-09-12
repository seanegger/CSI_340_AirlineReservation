import java.util.ArrayList;
import java.util.HashMap;

public class Customer {
HashMap<Integer, Seat> seats;
Flight flights[];

public void printItinerary() {
	
}

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
			seats.
		}
	}
	else
	{
		System.out.println("No Such Seat Exists");
		return false;

	}
}
}
