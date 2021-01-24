package services.users;

import models.User;

public interface IUsersService {
    public User add_user(String username, Character gender, int age);

}
