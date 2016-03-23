/*Joseph Han 
CSE2
hw07

The objective of this homework is to give you practice
with writing while, for, and do-while loops
*/ 

import java.util.Scanner;

public class Twisty{
    public static void main(String[] args){
        
        Scanner myScanner=new Scanner (System.in); 
        System.out.println("Input your desired length: ");
        int length = 0;
        
        while (!myScanner.hasNextInt()){
            System.out.println("Error: please type in an integer");
            myScanner.next(); //seeing if input is an integer 
        }
        
        length = myScanner.nextInt(); 
        
        while (length<0 || length>80){
            System.out.println("Error: please type in an integer between 1 and 80"); 
            length = myScanner.nextInt(); //seeing if integer is between 1 and 80
        }
        
        System.out.println("Input your desired width: "); 
        int width = 0; 
        
        while (!myScanner.hasNextInt()){
            System.out.println("Error: please type in an integer");
            myScanner.next(); //seeing if input is an integer 
        }
        
        width = myScanner.nextInt(); 
        
        while (width<0 || width>length){ 
            System.out.println("Error: Please input a positive integer smaller than the length"); 
            width = myScanner.nextInt(); //seeing if width is positive and less than length
        }
        
        int x = 1, y = 1; 
        int divide = x/width;
        int mod = x&width; 
        
        for(y=1; y<=width; y++){ //out loop for controlling each row
        for(x=1; x<=length; x++){ //inner loop for printing each line
            if(x%width==y){ //if remainder = y (row number) then its print either # or \
                divide = (x - 1) /width; //create a int divide to see if even or odd
                if (divide%2==0){ //if even, print out #
                    System.out.print("#"); 
                }
                else if(divide%2==1){ //if odd, print out \
                    System.out.print("\\");
                }
            }
            else if ((x - 1)%width==(width-y)){ //gets upward patterns
                divide = (x - 1)/width; //create divide to see if even or off
                if (divide%2==0){ //if even, print out /
                    System.out.print("/"); 
                }
                else if (divide%2==1){ //if odd, print out #
                    System.out.print("#");
                }
            }
            else{
                System.out.print(" "); //if not either, print out a space
            }
            }
            System.out.println(); 
        }
        
    }
}
