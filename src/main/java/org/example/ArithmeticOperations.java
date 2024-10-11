package org.example;

import java.util.Scanner;

public class ArithmeticOperations {
    // addition
    public static void main(String[] args) {

//        //Addition
//        System.out.println(2 + 3);
//
//        // Subtraction
//        System.out.println(20 - 10);
//
//        // Division
//        System.out.println(30 / 3);
//
//        // Multiplication
//        System.out.println(2 * 33);
//
//        System.out.println(1 % 3);
//
//        System.out.println((3 + 4) * 2);
//
//        // Math absolute
//        System.out.println(Math.abs(-2.3));
//
//        System.out.println(Math.max(3, 4));

//        double num = 2.345476575768;
//        System.out.printf("The formatted  number is : %-4.2f", num);

        System.out.print("Enter any word: ");

        Scanner scanner = new Scanner(System.in);
        String surname = scanner.nextLine();
        String firstName = scanner.next();

        System.out.println("Your name is: " + surname + " " + firstName);

    }
}
