package services.users;

import dao.users.UserDao;
import models.User;

public class UserService implements IUsersService{

    @Override
    public User add_user(String username, Character gender, int age) {
        return new UserDao().add_user(username, gender, age);
    }
}
