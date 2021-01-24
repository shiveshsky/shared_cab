package services.rides;

import models.Ride;
import models.User;
import models.Vehicle;
import services.rides.strategy.RideStrategy;

import java.util.ArrayList;

public interface IRideService {
    public Ride offer_ride(User driver, String src, String destination, int seats, Vehicle vehicle);
    public void end_ride(Ride ride);
    public ArrayList<Ride> print_ride_stats();
    public Ride select_ride(String src, String dest, RideStrategy strategy);
}
