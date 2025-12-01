package model;

public final class HotelReservation extends Reservation {
    private Hotel hotel;

    public HotelReservation(double confirmationNo, String customerName, Hotel hotel) {
        super(confirmationNo, customerName);
        this.hotel = hotel;
    }

    public Hotel getHotel() { return hotel; }

    @Override
    public String getDetail() {
        return "Hotel: " + hotel.getName() + " at " + hotel.getLocation();
    }
}