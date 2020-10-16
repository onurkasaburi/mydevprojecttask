package com.myprojecttask;

import com.myprojecttask.core.Loops;
import com.myprojecttask.core.Methods;
import com.myprojecttask.core.SelectionStatements;
import com.myprojecttask.enums.Gender;
import com.myprojecttask.enums.Status;
import com.myprojecttask.oop.abstraction.implementation.UserServiceImplementation;
import com.myprojecttask.oop.abstraction.service.UserService;
import com.myprojecttask.oop.encapsulation.Role;
import com.myprojecttask.oop.encapsulation.User;
import com.myprojecttask.oop.inheritance.BaseEntity;
import com.myprojecttask.oop.inheritance.Project;
import com.myprojecttask.oop.polymorphism.Employee;

import java.time.LocalDate;
import java.time.LocalDateTime;

public class Main {
    public static void main(String[] args) {
        // *****CORE***** //
        Methods methods = new Methods();
        methods.methodA();
        methods.methodA("Apple");
        System.out.println(methods.methodB());
        methods.methodB(2005);
        Methods.methodC();

        Loops.demoForIterator();
        Loops.demoForEach();

        SelectionStatements.demoIfStatement();
        SelectionStatements.demoSwitchStatement();


        // *****OOP-ENCAPSULATION***** //
        User user = new User("Michael", "Schumacher", new Role(2, "Manager"), Gender.MALE);
        System.out.println(user.getFirstName());
        System.out.println(user.getLastName());
        System.out.println(user.getRole().getDescription());


        // *****OOP-INHERITANCE***** //

        Project project = new Project(1, LocalDateTime.now(),1,LocalDateTime.now().minusHours(5),1,
                "PRJ01","HUMAN RESOURCES", new User("Aryton","Senna",
                new Role(1,"Manager"),Gender.MALE),
                LocalDate.now(),LocalDate.now().plusMonths(6),Status.IN_PROGRESS, "HCRM Detail Information");


        // *****OOP-INTERFACE***** //
        UserService userService = new UserService();
        System.out.println(userService.userByFirstName("Mike").getLastName());


        // *****OOP-POLYMORPHISM***** //

       Employee employee = new Employee();
        BaseEntity employee2 = new Employee();
        UserServiceImplementation userServiceImplementation = new UserService();
        employee.getEmployeeHours();
        ((Employee)employee2).getEmployeeHours(); // Down casting

        // *****ENUM***** //

        System.out.println(Gender.FEMALE);
        System.out.println(Status.IN_PROGRESS.getValue().substring(2));
    }
}
