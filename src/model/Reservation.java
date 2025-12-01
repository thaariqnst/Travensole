package model;

// Sealed class untuk memastikan hanya FlightReservation & HotelReservation yang dapat extend
public sealed abstract class Reservation permits FlightReservation, HotelReservation {

    protected double confirmationNo;
    protected String customerName;

    public Reservation(double confirmationNo, String customerName) {
        this.confirmationNo = confirmationNo;
        this.customerName = customerName;
    }

    public double getConfirmationNumber() {
        return confirmationNo;
    }

    public String getCustomerName() {
        return customerName;
    }

    // Setiap subclass wajib memberi detail sesuai jenis reservasi
    public abstract String getDetail();
}
