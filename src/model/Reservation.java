package model;

public abstract class Reservation {
    // Ini adalah parent Class untuk child class seperti FlightReservation dan HotelReservation
    protected double confirmationNo;
    protected String customerName;

    public double getConfirmationNumber() { return confirmationNo; }
}
