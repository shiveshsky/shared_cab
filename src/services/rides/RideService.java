package services.rides;

import dao.ride.RideDao;
import dao.ride.RiderDaoSingleton;
import models.Ride;
import models.User;
import models.Vehicle;
import services.rides.strategy.RideStrategy;

import java.util.ArrayList;

public class RideService implements IRideService{
    RideDao riderDao = RiderDaoSingleton.getRideDao();
    @Override
    public Ride offer_ride(User driver, String src, String destination, int seats, Vehicle vehicle) {
        return riderDao.add_ride(driver, src, destination, seats, vehicle);
    }

    @Override
    public void end_ride(Ride ride) {
        ArrayList<Ride> all_rides = riderDao.get_rides();
        for (Ride possible_ride: all_rides){
            if (possible_ride.equals(ride)){
                possible_ride.setAvailable(true);
            }
        }
    }

    @Override
    public ArrayList<Ride> print_ride_stats() {
        return riderDao.get_rides();

    }

    @Override
    public Ride select_ride(String src, String dest, RideStrategy strategy) {
        return strategy.applyStrategy(src, dest, riderDao.get_rides());
    }
}
