package dao.ride;

public class RiderDaoSingleton {
    private static RideDao rideDao;
    public static RideDao getRideDao(){
        if (rideDao != null){
            rideDao = new RideDao();
        }
        return rideDao;
    }
}
