/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.calculator;

/**
 *
 * @author User
 */
import java.util.Scanner;

public class Calculator {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter first number: ");
        int num1 = input.nextInt();
        System.out.print("Enter second number: ");
        int num2 = input.nextInt();
        System.out.println("");
        System.out.println("Enter 1 to perform addition");
        System.out.println("Enter 2 to perform subtraction");
        System.out.println("Enter 3 to perform multiplication");
        System.out.println("Enter 4 to perform division");
        System.out.println("");
        System.out.print("Enter your choice: ");
        int choice = input.nextInt();
        System.out.println("");
        if (choice == 1) 
        {
            System.out.println("The result of the addition is " + (num1 + num2));
        } else if (choice == 2) {
            System.out.println("The result of the subtraction is " + (num1 - num2));
        } else if (choice == 3) {
            System.out.println("The result of the multiplication is " + (num1 * num2));
        } else if (choice == 4) {
            System.out.println("The result of the division is " + (num1 / num2));
        } else {
            System.out.println("Invalid choice");
        }
    }
}

