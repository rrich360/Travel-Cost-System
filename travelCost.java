/*
* This program uses total distance of the trip,
* the mpg of vehicle, ad the current price of
* gas to calculate the total cost of the trip.
*/
package travelCost;
import java.util.Scanner;
/**
 * 
 * 
 * /
 public class travelCost {
   
  
    public static void main(String[]args) { 
          double distance;
          double mpg;
          double pricePerGallon;
          double totalCost;
        //double distance, mpg, pricePerGallon, totalCost;
        Scanner in = new Scanner(system.in);
        System.out.println("Enter the total distance in miles: ");
        distance = in.nextDouble();
        System.out.println("Enter the mpg for the vehicle: ");
        mpg = in.nextDouble();
        System.out.println("Enter the price of one gallon of gas: ");
        pricePerGallon = in.nextDouble();
        
        totalCost = (distance/mpg)*pricePerGallon;
        System.out.printf("The trip is going to cost $%5.2f", totalCost);
        System.out.println();
    }
   
 } 
