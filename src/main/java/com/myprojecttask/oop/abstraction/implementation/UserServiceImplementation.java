package com.myprojecttask.oop.abstraction.implementation;

import com.myprojecttask.oop.encapsulation.User;

public interface UserServiceImplementation {
    String userByRoleId(int id);

    User userByFirstName(String firstName);

}
