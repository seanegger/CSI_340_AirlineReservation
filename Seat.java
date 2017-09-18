
public abstract class Seat {
	private String id;
	private Plane plane;

	public Seat(String id, Plane plane)
	{
		this.setId(id);
		this.setPlane(plane);
	}

	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	public Plane getPlane() {
		return plane;
	}
	public void setPlane(Plane plane) {
		this.plane = plane;
	}
}
