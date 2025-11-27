package model;

public class HotelItem extends TravelItem {

    private String location;
    private String checkInDate;
    private String checkOutDate;
    private int guestCount;

    public HotelItem(
            String hotelId,
            String hotelName,
            String location,
            String checkInDate,
            String checkOutDate,
            int guestCount,
            double price
    ) {
        this.id = hotelId;
        this.name = hotelName;
        this.location = location;
        this.checkInDate = checkInDate;
        this.checkOutDate = checkOutDate;
        this.guestCount = guestCount;
        this.price = price;
    }

    public String getHotelId() { return id; }
    public String getHotelName() { return name; }
    public String getLocation() { return location; }
    public String getCheckInDate() { return checkInDate; }
    public String getCheckOutDate() { return checkOutDate; }
    public int getGuestCount() { return guestCount; }

    
    public void setLocation(String location) { this.location = location; }
    public void setCheckInDate(String checkInDate) { this.checkInDate = checkInDate; }
    public void setCheckOutDate(String checkOutDate) { this.checkOutDate = checkOutDate; }
    public void setGuestCount(int guestCount) { this.guestCount = guestCount; }
}
