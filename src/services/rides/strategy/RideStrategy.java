package services.rides.strategy;

import models.Ride;

import java.util.ArrayList;

public interface RideStrategy {
    public Ride applyStrategy(String src, String dest, ArrayList<Ride> rides);

}
