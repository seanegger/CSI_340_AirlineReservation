import java.util.ArrayList;

public class Plane {
	private ArrayList<VIPSeat> vipSeats;
	private ArrayList<RegularSeat> regularSeats;
	private int id;
	private AirPlaneCompany ownedBy;
	private Flight flights[];

	public Plane()
	{
		//make some seats when you make the plane
		Seat currentSeat;
		for (int i = 0;  i < 20; i++)
		{
			if (i > 6)
			{
				//create regular seat
				currentSeat = new RegularSeat(Integer.toString(i), this);
				regularSeats.add((RegularSeat) currentSeat);
			}
			else
			{
				//create vip seat
				currentSeat = new VIPSeat(Integer.toString(i), this);
				vipSeats.add((VIPSeat) currentSeat);
			}
		}
	}

	public ArrayList<VIPSeat> getVipSeats() {
		return vipSeats;
	}
	public void setVipSeats(ArrayList<VIPSeat> vipSeats) {
		this.vipSeats = vipSeats;
	}
	public ArrayList<RegularSeat> getRegularSeats() {
		return regularSeats;
	}
	public void setRegularSeats(ArrayList<RegularSeat> regularSeats) {
		this.regularSeats = regularSeats;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public Flight[] getFlights() {
		return flights;
	}
	public void setFlights(Flight[] flights) {
		this.flights = flights;
	}
	public AirPlaneCompany getOwnedBy()
	{
		return this.ownedBy;
	}
	public void setBelongsTo(AirPlaneCompany apc)
	{
		this.ownedBy = apc;
	}

	/**
	 * Find a seat by string name
	 * @param seat the seat string
	 * @return the seat
	 */
	public Seat getSeat(String seat)
	{
		for (int i = 0; i < vipSeats.size(); i++)
		{
			if(seat == vipSeats.get(i).getId())
				return vipSeats.get(i);
		}
		for (int i = 0; i < vipSeats.size(); i++)
		{
			if(seat == regularSeats.get(i).getId())
				return regularSeats.get(i);
		}
		return null;
	}
}
