public class TestClass{
    public static void main(String[] args)
    {
        //Create aircraft
        Plane plane1 = new Plane();

        //Add a company and add this aircraft to its fleet
        AirPlaneCompany delta = new AirPlaneCompany();
        delta.setName("Delta Air Lines");
        delta.addPlane(plane1);

        plane1.setBelongsTo(delta);

        Flight flight1 = new Flight();
        flight1.setFlightID(plane1.getId());
        flight1.setDate("October 10, 2017");
        flight1.setDeparturePlace("Burlington");
        flight1.setDestination("New York City");
        flight1.setDepartureTime("10.00 am");
        flight1.setDuration("1 hour");

        Flight flight2 = new Flight();
        flight2.setFlightID(plane1.getId());
        flight2.setDate("October 10, 2017");
        flight2.setDeparturePlace("New York City");
        flight2.setDestination("Atlanta");
        flight2.setDepartureTime("01.00 pm");
        flight2.setDuration("1 hour");

        Customer cust1 = new Customer();
        cust1.setfName("Murat");
        cust1.setlName("Gungor");
        cust1.makeReservation(flight1, "3");
        cust1.makeReservation(flight2, "3");

        cust1.printItinerary();

    }
}