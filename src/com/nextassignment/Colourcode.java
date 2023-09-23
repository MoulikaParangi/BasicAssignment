package com.nextassignment;

public class Colourcode {
    public static void main(String[] args)
    {
        char ch='M';
        switch(ch)
        {
            case 'R':
                System.out.println("Red");
                break;
            case 'B':
                System.out.println("Blue");
                break;
            case 'G':
                System.out.println("Green");
                break;
            case 'O':
                System.out.println("Orange");
                break;
            case 'Y':
                System.out.println("Yellow");
                break;
            case 'W':
                System.out.println("white");
                break;
            default:
                System.out.println("Invalid Code");

        }
    }
}
