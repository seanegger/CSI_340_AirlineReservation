
public class Plane {
	VIPSeat vipSeats[];
	RegularSeat regularSeats[];
	private int id;
	AirPlaneCompany ownedBy;
	Flight flights[];
	public VIPSeat[] getVipSeats() {
		return vipSeats;
	}
	public void setVipSeats(VIPSeat[] vipSeats) {
		this.vipSeats = vipSeats;
	}
	public RegularSeat[] getRegularSeats() {
		return regularSeats;
	}
	public void setRegularSeats(RegularSeat[] regularSeats) {
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
}
