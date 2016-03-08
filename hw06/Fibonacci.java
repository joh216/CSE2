/*Joseph Han
Hw06
03/08/15

This homework gives us practice with writing loops.*/ 

import java.util.Scanner; 

public class Fibonacci{
    public static void main(String[] args){
        
        Scanner myScanner = new Scanner (System.in); 
        System.out.println("Enter the first number in the sequence: "); 
        int number1 = 0; 
        
        while (!myScanner.hasNextInt()){
            System.out.println("Number must be an interger"); 
           myScanner.next(); 
        }
        
        number1 = myScanner.nextInt(); 
        
        while (number1<0){
                System.out.println("Number must be positive"); 
                number1 = myScanner.nextInt();
            }
           
        System.out.println("Enter the second number in the sequence: "); 
        int number2 = 0;
        
        while (!myScanner.hasNextInt()){
            System.out.println("Number must be an interger"); 
           myScanner.next(); 
        }
        
         number2 = myScanner.nextInt(); 
         
         while (number2<0){
                System.out.println("Number must be positive"); 
                number2 = myScanner.nextInt();
            }
        
        System.out.println("How many custom Fibonacci numbers should be printed? "); 
        int number3 = 0; 
        
        while (!myScanner.hasNextInt()){
            System.out.println("Number must be an interger"); 
           myScanner.next(); 
        }
        
         number3 = myScanner.nextInt(); 
         
         while (number3<0){
                System.out.println("Number must be positive"); 
                number3 = myScanner.nextInt();
            }
            
            int number4 = 0; 
        System.out.print("The numbers are: ");
        System.out.print(number1+ ", "); System.out.print(number2);
        
        while (number3 > 2){
            number4=number1+number2; 
            System.out.print(", " +number4 ); 
            number3--;
            number1=number2; 
            number2=number4; 
        }
     System.out.println("."); 
        
    }
}