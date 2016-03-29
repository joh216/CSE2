/*Joseph Han 
CSE2
hw09

This homework has the objective of giving you practice in writing methods, 
overloading methods, and in forcing the user to enter good input. 
*/ 

import java.util.Scanner; 

public class Rectangularize{ 
    public static void main(String[] args){ //main method
        
        Scanner myScanner=new Scanner (System.in); //scanner declaration
        System.out.println("Please enter an input or string");
        int inputInt = 0; //input as integer
        String inputString = ""; //input as string
        
        if(myScanner.hasNextInt()){ //if input is a integer
        inputInt = myScanner.nextInt(); //set input as an integer
         rectangular(inputInt); //and run rectangular for integar
        }
        else //if not an integer, so string
        {
            inputString = myScanner.next(); //set input as string
        rectangular(inputString); //run rectangular for the string
        }
    }
    
    public static void rectangular(int i){ //method if input is a integar
        int a = 1, b = 1;
        for(b=1; b<=i; b++){ //outer loop to control how many lines
        for(a=1; a<=i; a++){ //inner loop to display % in a line
            System.out.print("%"); 
        }
        System.out.println();
        }
    }
        
        public static void rectangular(String j){ //method if input is a string
            int c = 1; 
            int length = j.length(); 
            for(c=1; c<=length; c++){ //loop to print out string x amount of times given the length of string
                System.out.println(j); 
            }
        }
}