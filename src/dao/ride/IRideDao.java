package dao.ride;

import models.Ride;
import models.User;
import models.Vehicle;

import java.util.ArrayList;

public interface IRideDao {
    public Ride add_ride(User driver, String src, String destination, int seats, Vehicle vehicle);
    public ArrayList<Ride> get_rides();
}
