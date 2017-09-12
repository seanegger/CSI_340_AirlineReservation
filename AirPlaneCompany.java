import java.util.HashMap;

public class AirPlaneCompany {
String name;
HashMap<Integer, Plane> planeMap;

public void addPlane(Plane plane)
{
	if(this.planeMap.get(plane.getId())==null)
	{
		this.planeMap.put(plane.getId(), plane)
		System.out.println("Plane Added to fleet");
	}
	else {
		System.out.println("Plane already exists in fleet");
	}
}
}
