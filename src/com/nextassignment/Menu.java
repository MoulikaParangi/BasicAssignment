package com.nextassignment;

import java.util.Scanner;

public class Menu {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        char ch;
        do {
            System.out.println("Please choose any of the options 1.Add 2.Sub");
            int option = sc.nextInt();
            System.out.println("Please enter the two operands");
            int op1 = sc.nextInt();
            int op2 = sc.nextInt();
            if (option == 1) {
                System.out.println(op1 + op2);
            } else {
                System.out.println(op1 - op2);
            }
            System.out.println("Do you want to continue?");
             ch = sc.next().charAt(0);
        }
        while(ch=='y' || ch=='Y');







    }
}
