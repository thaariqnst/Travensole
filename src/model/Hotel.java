package model;

public class Hotel extends TravelItem {
    private String location;
    private String checkInDate;
    private String checkOutDate;
    private int maxGuests;

    public Hotel(String hotelId, String hotelName, String location, String checkIn, String checkOut, int maxGuests, double price) {
        this.id = hotelId;
        this.name = hotelName;
        this.price = price;
        this.location = location;
        this.checkInDate = checkIn;
        this.checkOutDate = checkOut;
        this.maxGuests = maxGuests;
    }

    // Getters
    public String getLocation() { return location; }
    public String getCheckInDate() { return checkInDate; }
    public String getCheckOutDate() { return checkOutDate; }
    public int getMaxGuests() { return maxGuests; }

    @Override
    public String toString() {
        return String.format("Hotel [%s] %s | Loc: %s | Date: %s - %s | Price: Rp%.2f | Guests: %d", 
            id, name, location, checkInDate, checkOutDate, price, maxGuests);
    }
}