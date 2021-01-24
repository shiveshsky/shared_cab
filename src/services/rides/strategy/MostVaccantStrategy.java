package services.rides.strategy;

import dao.ride.RideDao;
import dao.ride.RiderDaoSingleton;
import models.Ride;

import java.util.ArrayList;
import java.util.Map;

public class MostVaccantStrategy implements RideStrategy {
    RideDao riderDao = RiderDaoSingleton.getRideDao();
    @Override
    public Ride applyStrategy(String src, String dest, ArrayList<Ride> rides) {
        int max_vacant=-1;
        Ride most_vacant_ride = null;
        for(Map.Entry<Ride, Integer> entry: riderDao.get_vacant_rides_count().entrySet())
        {
            if (max_vacant < entry.getValue()){
                max_vacant = entry.getValue();
                most_vacant_ride = entry.getKey();
            }
        }

        return most_vacant_ride;
    }
}
