package com.myprojecttask.oop.abstraction.service;

import com.myprojecttask.enums.Gender;
import com.myprojecttask.oop.abstraction.implementation.UserServiceImplementation;
import com.myprojecttask.oop.encapsulation.Role;
import com.myprojecttask.oop.encapsulation.User;

public class UserService implements UserServiceImplementation {
    @Override
    public String userByRoleId(int id) {
        User user = new User("Aryton", "Senna", new Role(id, "Admin"), Gender.MALE);
        return user.getFirstName() + " " + user.getLastName();
    }

    @Override
    public User userByFirstName(String firstName) {
        User user = new User("Tommi", "Hakkinen", new Role(3, "Employee"),Gender.MALE);
        return user;
    }
}
