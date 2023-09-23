package com.nextassignment;

import jdk.jshell.spi.ExecutionControl;

public class PrimeOrNot {
    public static void main(String[] args) {
        boolean flag = true;
        int number = Integer.parseInt(args[0]);

        if (number == 0 || number == 1) {
            System.out.println(number + "is neither prime nor composite");
        } else {
            for (int i = 2; i < number / 2; i++) {
                if (number % i == 0) {
                    flag = false;
                }
            }
            if (flag) {
                System.out.println(number + "is a Prime Number");
            } else {
                System.out.println(number + "is not a Prime");
            }
        }
    }
}
