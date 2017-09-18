
public abstract class Seat {
	private String id;
	private boolean reserved;
	private Plane plane;

	public Seat(String id, Plane plane)
	{
		this.setId(id);
		this.setReserved(false);
		this.setPlane(plane);
	}

	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	public boolean isReserved() {
		return reserved;
	}
	public void setReserved(boolean reserved) {
		this.reserved = reserved;
	}
	public Plane getPlane() {
		return plane;
	}
	public void setPlane(Plane plane) {
		this.plane = plane;
	}
}
