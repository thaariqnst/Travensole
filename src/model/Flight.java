package model;

public class Flight extends TravelItem {
    private String origin;
    private String destination;
    private String date;
    private int availableSeats;

    public Flight(String flightNumber, String airlineName, String origin, String destination, String date, int availableSeats, double price) {
        this.id = flightNumber; 
        this.name = airlineName;
        this.price = price;
        this.origin = origin;
        this.destination = destination;
        this.date = date;
        this.availableSeats = availableSeats;
    }

    // Getters
    public String getOrigin() { return origin; }
    public String getDestination() { return destination; }
    public String getDate() { return date; }
    public int getAvailableSeats() { return availableSeats; }

    @Override
    public String toString() {
        return String.format("Flight [%s] %s | %s -> %s | Date: %s | Price: Rp%.2f | Seats: %d", 
            id, name, origin, destination, date, price, availableSeats);
    }
}