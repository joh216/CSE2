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
        
        while (y<=width){
            x=1; 
        while (x<=length){
            if (x%(2*width) == y){
                System.out.print("#"); 
            }
            else if (x%(2*width)==width){
                System.out.print("/"); 
            }
            else if (x%(2*width)==(width+y)){
                System.out.print("\\"); 
            }
            else if (x%(2*width)==(width-y)){
                System.out.print("#");
            }
            else{
                System.out.print(" "); 
            }
            x++; 
        }
        y++; 
        System.out.println(); 
    }
}
}