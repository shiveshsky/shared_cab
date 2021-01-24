package models;

import java.util.ArrayList;

public class Ride {
    private User driver;
    private String src;
    private String dest;
    private ArrayList<Seats> seats;
    private Vehicle vehicle;
    private boolean available;

    public String getSrc() {
        return src;
    }

    public void setSrc(String src) {
        this.src = src;
    }

    public String getDest() {
        return dest;
    }

    public void setDest(String dest) {
        this.dest = dest;
    }

    public ArrayList<Seats> getSeats() {
        return seats;
    }

    public void setSeats(ArrayList<Seats> seats) {
        this.seats = seats;
    }

    public Vehicle getVehicle() {
        return vehicle;
    }

    public void setVehicle(Vehicle vehicle) {
        this.vehicle = vehicle;
    }

    public boolean isAvailable() {
        return available;
    }

    public void setAvailable(boolean available) {
        this.available = available;
    }

    public User getDriver() {
        return driver;
    }

    public void setDriver(User driver) {
        this.driver = driver;
    }
}
