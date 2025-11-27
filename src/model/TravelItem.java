package model;

public abstract class TravelItem {
    // Ini adalah parent Class untuk child class seperti FlightItem dan HotelItem
    protected String id;
    protected String name;
    protected double price;

    public String getId() {return id; }
    public String getName() { return name; }
    public double getPrice() { return price; }
}
