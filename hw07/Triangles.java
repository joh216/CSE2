/*Joseph Han 
CSE2
hw07

The objective of this homework is to give you practice
with writing while, for, and do-while loops
*/ 

import java.util.Scanner;

public class Triangles{
    public static void main(String[] args){
        
        Scanner myScanner=new Scanner (System.in); 
        System.out.print("Enter a number between 5 and 30: ");
        int number = 0;
        
        while (!myScanner.hasNextInt()){
            System.out.print("Number must be an interger: "); //validity check for integer
           myScanner.next();
        }
        number = myScanner.nextInt(); 
        
        while (number < 5 || number > 30){
            System.out.print("Number must be between 5 and 30: "); //validity check for input in range
            number = myScanner.nextInt(); 
        }
        
        int i = 1, counter = number-1; //setting integers to help run through the code
        int number2 = number - counter; //always start with 1
        int number3 = number2; 
        
        System.out.println("While Loop:"); //while loop
        
        while (number3<2*number){ //outer loop to control each row, multiply by 2 to get total rows
            i=1; //both increasing and decreasing rows of numbers
        while (number2>=i){ 
            System.out.print(number2); //print out number and how many
            i++; 
        }
        if (number3<number){ //if current number is less than 2*number inputed, increase by 1
            number2++; 
        }
        else{
            number2--; //if current number is greater than 2*number inputed, decrease
        }
        number3++; //always increment 3 until greater than 2*number
        System.out.println(); 
        }
        System.out.println(); 
        System.out.println("For Loop:"); //for loop
        
        for (number3=number2; number3<2*number; number3++){ //outer loop to control rows
            for(i=1; number2>=i; i++){ //inner for loop to print out numbers and how many
                System.out.print(number2); 
            }
            if (number3<number){ //if current number is less than 2*number inputed, increase by 1
            number2++; 
        }
        else{
            number2--; //if current number is greater than 2*number inputed, decrease
        }
        System.out.println(); 
        }
        
        System.out.println(); 
        System.out.println("Do-while Loop:"); //do-while loop
        
        number2 = number - counter; //reset variables
        number3 = number2;
        do{
            i=1; //reset i to 1 every time
            do{
                System.out.print(number2); //inner do while loop to print out number and how many
                i++;
            }while(number2>=i); //increment number2
        if (number3<number){
            number2++; //if current number is less than 2*number inputed, increase by 1
        }
        else{
            number2--; //if current number is greater than 2*number inputed, decrease
        }
        number3++; //increment number3 until greater than 2*number
        System.out.println(); 
        }while(number3<2*number); 
    }
}
    