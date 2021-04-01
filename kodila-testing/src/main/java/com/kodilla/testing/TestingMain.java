package com.kodilla.testing;

import com.kodilla.testing.User.SimpleUser;
import com.kodilla.testing.calculator.Calculator;

public class TestingMain {

    public static void main(String[] args) {
        SimpleUser simpleUser = new SimpleUser("theForumUser");

        String result = simpleUser.getUsername();

        if (result.equals("theForumUser")) {
            System.out.println("test OK");
        } else {
            System.out.println("Error!");
        }

        // Test Calculator class
        Calculator calculator = new Calculator();

        int sum = calculator.add(5, 5);


        if (sum == 10) {
            System.out.println("Calculator add() method successfully passed test!");
        } else {
            System.out.println("Calculator add() method failed test!");
        }

        int subtraction = calculator.subtract(10, 5);

        if (subtraction == 5) {
            System.out.println("Calculator subtract() method successfully passed test!");
        } else {
            System.out.println("Calculator subtract() method failed test!");
        }
    }

}
