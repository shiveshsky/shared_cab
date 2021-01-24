package dao.users;

import models.User;

import java.util.ArrayList;

public class UserDao implements IUserDao{
    ArrayList<User> users = new ArrayList<>();
    @Override
    public User add_user(String username, Character gender, int age) {
        User user = new User();
        user.setName(username);
        user.setGender(gender);
        user.setAge(age);
        users.add(user);
        return user;
    }

    @Override
    public ArrayList<User> get_users() {
        return users;
    }

}
