package dao.users;

import models.User;

import java.util.ArrayList;

public interface IUserDao {
    public User add_user(String username, Character gender, int age);
    public ArrayList<User> get_users();

}
