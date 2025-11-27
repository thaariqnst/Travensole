package model;

public class FlightItem extends TravelItem {

    private String origin;
    private String destination;
    private String date;
    private int passengerCount;

    public FlightItem(
        String flightNumber,
        String name,
        String origin, 
        String destination,
        String date,
        int passengerCount,
        double price
    ) {
        this.id = flightNumber;
        this.name = name;
        this.origin = origin;
        this.destination = destination;
        this.date = date;
        this.passengerCount = passengerCount;
        this.price = price;
    };

    public String getFlightNumber() { return id; }
    public String getOrigin() { return origin; }
    public String getDestination() { return destination; }
    public String getDate() { return date; }
    public int getPassengerCount() { return passengerCount; }


    // Setters
    public void setOrigin(String origin) { this.origin = origin; }
    public void setDestination(String destination) { this.destination = destination; }
    public void setDate(String date) { this.date = date; }
    public void setPassengerCount(int passengerCount) { this.passengerCount = passengerCount; }
};
