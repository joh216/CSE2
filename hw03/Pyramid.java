//Joseph Han
//CSE2
//Hw03 

//This HW is about writing code that enables the user to input data 
//and gives practice in using arithmetic operations

//This program  prompts the user for the dimensions of a pyramid 
//and returns the volume inside the pyramid

import java.util.Scanner;

//adding class and main method like always
public class Pyramid{
    public static void main(String[] args)  {
        
        Scanner myScanner = new Scanner (System.in);
        //declaring of a Scanner object 
        
        System.out.print("The square side of the pyramid " 
        +"is (input length) : "); 
        double pyramidLength = myScanner.nextDouble(); 
        //allows for user prompt and input for length 
        
        System.out.print("The height of the pyramid " 
        +"is (input height) : "); 
        double pyramidHeight = myScanner.nextDouble(); 
        //allows for user prompt and input for height
        
        double pyramidVolume = ((pyramidLength*pyramidLength*pyramidHeight)/3);
        //formula for volume of a pyramid 
        
        System.out.println("The volume inside the pyramid is : " 
        + pyramidVolume); 
        //print out the volume
    }    
}        
        