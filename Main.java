/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.main;

/**
 *
 * @author User
 */
public class Main {
  public static void main(String[] args) {
    int A = 5;
    int B = 6;
    int C = 7;
    int D = 8;
    
    // (A * B - C * D)
    int result1 = A * B - C * D;
    System.out.println("Result1: " + result1);
    
    // 2A - B + 3D
    int result2 = 2 * A - B + 3 * D;
    System.out.println("Result2: " + result2);
    
    // A^2 + B^2 - C^2 + D^2
    int result3 = A * A + B * B - C * C + D * D;
    System.out.println("Result3: " + result3);
    
    // A^3 + B - C^2
    int result4 = A * A * A + B - C * C;
    System.out.println("Result4: " + result4);
  }
}