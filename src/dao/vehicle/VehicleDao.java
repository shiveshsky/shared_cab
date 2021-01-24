package dao.vehicle;

import models.User;
import models.Vehicle;

import java.util.ArrayList;

public class VehicleDao implements IVehicleDao {
    ArrayList<Vehicle> vehicles = new ArrayList<>();
    @Override
    public Vehicle add_vehicle(User owner, String name, String number) {
        Vehicle vehicle = new Vehicle();
        vehicle.setName(name);
        vehicle.setNumber(number);
        vehicle.setOwner(owner);
        vehicles.add(vehicle);
        return vehicle;
    }

    @Override
    public ArrayList<Vehicle> get_vehicles() {
        return vehicles;
    }
}
