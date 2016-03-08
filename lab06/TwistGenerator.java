/*Joseph Han 
CSE2
Lab06

The purpose of this lab is to get familiar with loops. 
We will write code that will print out a simple "twist"
*/ 

import java.util.Scanner;

public class TwistGenerator{
    public static void main(String[] args){
        
        Scanner myScanner=new Scanner (System.in); 
        System.out.println("Provide a positive integer for length: ");
        int length = 0;  
        
        while (!myScanner.hasNextInt()){
            System.out.println("Length must be an interger"); 
           myScanner.next(); 
           
        }
        length = myScanner.nextInt(); 
        
        while (length<0){
                System.out.println("Length must be positive"); 
                length = myScanner.nextInt();
            }
        int counter = 1; 
        
        while(counter <= length){ 
            switch(counter%3){
                case 1: System.out.print("\\"); 
                break; 
                case 2: System.out.print(" "); 
                break; 
                case 0: System.out.print("/"); 
                break; 
            }
            counter++; 
        }
        System.out.println();
        counter = 1;
        while(counter <= length){
            switch(counter%3){
                case 1: System.out.print(" "); 
                break; 
                case 2: System.out.print("X"); 
                break; 
                case 0: System.out.print(" "); 
                break; 
            }
            counter++; 
        }
        System.out.println();
        counter = 1;
        while(counter <= length){ 
            switch(counter%3){
                case 1: System.out.print("\\"); 
                break; 
                case 2: System.out.print(" "); 
                break; 
                case 0: System.out.print("/"); 
                break; 
            }
            counter++; 
        }
        System.out.println(); 
    }
}