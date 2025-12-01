package model;

public final class FlightReservation extends Reservation {
    private Flight flight;

    public FlightReservation(double confirmationNo, String customerName, Flight flight) {
        super(confirmationNo, customerName);
        this.flight = flight;
    }

    public Flight getFlight() { return flight; }

    @Override
    public String getDetail() {
        return "Flight: " + flight.getId() + " (" + flight.getOrigin() + " -> " + flight.getDestination() + ")";
    }
}