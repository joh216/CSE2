/*Joseph Han 
CSE2
HW06

Purpose is to practice writing and using loops
*/ 

import java.util.Scanner;

public class RunFactorial{
    public static void main(String[] args){
        
        Scanner myScanner=new Scanner (System.in); 
        System.out.println("Provide a positive integer between 9 and 16, inclusively: ");
        int value = 0;  
        
        while (!myScanner.hasNextInt()){
            System.out.println("Invalid input, enter again!"); 
           myScanner.next(); 
           
        }
         value = myScanner.nextInt(); 
        
        while (value <= 9 || value >= 16){
                System.out.println("Invalid input, enter again!"); 
                value = myScanner.nextInt();
            }
            
            int value3 = value; 
            int value2 = 0; 
            System.out.println("Input accepted: "); 
            value2 = value * (value-1); 
            value--; 
            value--;
            
            
            while (value > 0){
                value2=value2*(value);
                value--; 
            }
            
            System.out.println(value3 + "! = " + value2); 
            
    }
}