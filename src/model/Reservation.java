package model;

// Menggunakan Sealed Class sesuai permintaan soal 
public sealed abstract class Reservation permits FlightReservation, HotelReservation {
    protected double confirmationNo;
    protected String customerName;

    public Reservation(double confirmationNo, String customerName) {
        this.confirmationNo = confirmationNo;
        this.customerName = customerName;
    }

    public double getConfirmationNumber() { return confirmationNo; }
    public String getCustomerName() { return customerName; }
    
    public abstract String getDetail(); // Abstract method
}