package com.myprojecttask.core;

public class SelectionStatements {
    public static void demoIfStatement() {
        String userName = "Michael";
        if (userName.equals("Michael")) {
            System.out.println("PASS");
        } else if (userName.equals("Lewis")) {
            System.out.println("FAIL");
        } else {
            System.out.println("Not Valid");
        }
    }

    public static void demoSwitchStatement() {
        String userName = "Janson";
        switch (userName) {
            case "Felipe":
                System.out.println("PASS");
                break;
            case "Janson":
                System.out.println("FAIL");
                break;
            default:
                System.out.println("Not Valid");
        }

    }
}
