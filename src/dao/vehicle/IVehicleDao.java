package dao.vehicle;

import models.User;
import models.Vehicle;

import java.util.ArrayList;

public interface IVehicleDao {
        public Vehicle add_vehicle(User owner, String name, String numner);
        public ArrayList<Vehicle> get_vehicles();
}
