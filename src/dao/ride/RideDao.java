package dao.ride;

import models.Ride;
import models.Seats;
import models.User;
import models.Vehicle;

import java.util.ArrayList;
import java.util.HashMap;

public class RideDao implements IRideDao{
    ArrayList<Ride> rides = new ArrayList<>();
    @Override
    public Ride add_ride(User driver, String src, String destination, int seats, Vehicle vehicle) {
        Ride ride = new Ride();
        ride.setDest(destination);
        ride.setSrc(src);
        ride.setDriver(driver);
        ArrayList<Seats> allseats = new ArrayList<Seats>();
        for (int i =0; i< seats; i++){
            Seats seat = new Seats();
            seat.setIs_available(true);
            allseats.add(seat);
        }
        ride.setSeats(allseats);
        ride.setVehicle(vehicle);
        rides.add(ride);
        return ride;
    }

    @Override
    public ArrayList<Ride> get_rides() {
        return rides;
    }

    public HashMap<Ride, Integer> get_vacant_rides_count(){
        HashMap<Ride, Integer> ride_vaccant_count = new HashMap<Ride, Integer>();
        for(Ride ride: rides){
            int count = 0;
            for(Seats seats: ride.getSeats()){
                if (seats.isIs_available()){
                    count+=1;
                }
            }
            ride_vaccant_count.put(ride, count);
        }
        return ride_vaccant_count;
    }
}
