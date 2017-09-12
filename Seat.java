
public abstract class Seat {
	int id;
	boolean reserved;
	int planeID;


	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public boolean isReserved() {
		return reserved;
	}
	public void setReserved(boolean reserved) {
		this.reserved = reserved;
	}
	public int getPlaneID() {
		return planeID;
	}
	public void setPlaneID(int planeID) {
		this.planeID = planeID;
	}
}
