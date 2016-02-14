//Joseph Han
//CSE2
//Hw03 

//This HW is about writing code that enables the user to input data 
//and gives practice in using arithmetic operations

//This program wants to convert meters to inches, which are stored
//in doubles. Ask the user for a measurement in meters, then
//print out the correct number of inches. 

import java.util.Scanner;

//adding class and main method like always
public class Convert{
    public static void main(String[] args)  {
        
        Scanner myScanner = new Scanner (System.in);
        //declaring of a Scanner object 
        
        System.out.print("Enter the distance in meters: ");
        double distanceMeters = myScanner.nextDouble(); 
        //allows for user for prompting and inputing 
        
        double distanceInches = distanceMeters * 39.37;
        //conversation equation from meters to inches 
        
        System.out.println(distanceMeters +" meters is "
        + (double) ((int) (distanceInches*10000))/10000 + " inches."); 
        //print out the output in inches
    }
}