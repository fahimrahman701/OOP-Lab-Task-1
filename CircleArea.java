/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.circlearea;

/**
 *
 * @author User
 */
import java.text.DecimalFormat;

public class CircleArea {
  public static void main(String[] args) {
    double radius = 5.0;
    double area = Math.PI * Math.pow(radius, 2);
    DecimalFormat df = new DecimalFormat("#.##");
    System.out.println("The area of a circle with radius " + radius + " is " + df.format(area));
  }
}
