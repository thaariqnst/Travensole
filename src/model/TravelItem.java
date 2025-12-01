package model;

public abstract class TravelItem {
    // Parent class untuk FlightItem & HotelItem
    protected String id;
    protected String name;
    protected double price;

    public String getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public double getPrice() {
        return price;
    }
}
