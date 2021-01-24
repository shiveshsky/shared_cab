package dao.users;

import dao.ride.RideDao;

public class UserDaoSingleton {
    private static UserDao userDao;
    public static UserDao getUserDao(){
        if (userDao != null){
            userDao = new UserDao();
        }
        return userDao;
    }
}
