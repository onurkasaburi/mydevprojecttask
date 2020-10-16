package com.myprojecttask.collections;

import com.myprojecttask.enums.Gender;
import com.myprojecttask.oop.encapsulation.Role;
import com.myprojecttask.oop.encapsulation.User;

import java.util.ArrayList;
import java.util.List;

public class ArrayLists {
    public static void createList() {
        List<Integer> list = new ArrayList<>();
        list.add(3);
        list.add(5);
        for (Integer l : list) {
            System.out.println(l);
        }
    }

    public static void createUserList() {
        List<User> userList = new ArrayList<>();
        userList.add(new User("David", "Couldart", new Role(3, "Test User"), Gender.MALE));
        userList.add(new User("Fernando", "Alonso", new Role(4, "Test User"), Gender.MALE));

        for (User u : userList) {
            System.out.println(u.getRole().getDescription());
        }
    }

    public static List<Role> createRoleList() {
        List<Role> roleList = new ArrayList<>();
        roleList.add(new Role(1, "Manager"));
        roleList.add(new Role(2, "Assistant Manager"));
        roleList.add(new Role(3, "Employee"));
        return roleList;
    }
}
