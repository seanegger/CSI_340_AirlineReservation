public class Reservation {

    Flight flight;
    Seat seat;
    Customer customer;

    public Reservation(Flight flight, Seat seat) {
        this.flight = flight;
        this.seat = seat;
    }
    public Reservation(Flight flight, String seat, Customer customer) {
        this.flight = flight;
        this.seat = flight.getPlane().getSeat(seat);
        this.customer = customer;
    }

    public void bookFlight()
    {
        flight.reserveSeat(seat.getId());
    }

    @Override
    public String toString() {
        String toPrint = "----------------------------------------\n";
        toPrint += "Passenger: " + customer.fname + " " + customer.lname + "\n";
        toPrint += "Flight Number: " + flight.getFlightID() + "\n";
        toPrint += "Origin: " + flight.getDeparturePlace() + "\t";
        toPrint += "Date and Time: " + flight.getDate() + "\t";
        toPrint += flight.getDepartureTime() + "\n";
        toPrint += "Destination: " + flight.getDestination() + "\t";
        toPrint += "Duration: " + flight.getDuration() + "\t";
        toPrint += "Seat: " + seat.getId() + "\n";
        toPrint += "Carrier: " + flight.getPlane().getOwnedBy().name + "\n";
        toPrint += "----------------------------------------\n";
        return toPrint;
    }
}
