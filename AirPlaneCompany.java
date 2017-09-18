import java.util.ArrayList;

public class AirPlaneCompany {
	String name;
	ArrayList<Plane> planes;

	public AirPlaneCompany(String name) {
		this.name = name;
		this.planes = new ArrayList<Plane>();
	}

	public void setName(String name)
	{
		name = name;
	}

	public void addPlane(Plane plane)
	{
		if(this.planes.contains(plane) == false)
		{
			this.planes.add(plane);
			System.out.println("Plane Added to fleet");
		}
		else {
			System.out.println("Plane already exists in fleet");
		}
	}
}
