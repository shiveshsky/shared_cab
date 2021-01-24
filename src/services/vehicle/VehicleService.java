package services.vehicle;

import dao.vehicle.VehicleDao;
import models.User;
import models.Vehicle;

public class VehicleService implements IVehicleService{
    @Override
    public Vehicle add_Vehicle(User owner, String name, String number) {
        return new VehicleDao().add_vehicle(owner, name, number);
    }
}
