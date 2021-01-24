package services.vehicle;

import models.User;
import models.Vehicle;

public interface IVehicleService {
    public Vehicle add_Vehicle(User owner, String name, String number);
}
