package services.rides.strategy;

import models.Ride;

import java.util.ArrayList;

public class PreferredVehicleStrategy implements RideStrategy {
    private String perferredvehicle;

    public String getPerferredvehicle() {
        return perferredvehicle;
    }

    public void setPerferredvehicle(String perferredvehicle) {
        this.perferredvehicle = perferredvehicle;
    }


    @Override
    public Ride applyStrategy(String src, String dest, ArrayList<Ride> rides) {
        for(Ride ride: rides){
            if (ride.getVehicle().equals(perferredvehicle) &&
                    ride.isAvailable() &&
                    ride.getSrc().equals(src) &&
                    ride.getDest().equals(dest)){
                return ride;
            }
        }
        return null;
    }
}
