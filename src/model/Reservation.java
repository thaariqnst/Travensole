package model;

public class Reservation {
    private double confirmationNo;
    private String customerName;
    private String type; // "Flight" atau "Hotel"
    private Object item; // Flight atau Hotel object
    
    public Reservation(double confirmationNo, String customerName, String type, Object item) {
        this.confirmationNo = confirmationNo;
        this.customerName = customerName;
        this.type = type;
        this.item = item;
    }
    
    // Getters
    public double getConfirmationNumber() { return confirmationNo; }
    public String getCustomerName() { return customerName; }
    public String getType() { return type; }
    public Object getItem() { return item; }
}
