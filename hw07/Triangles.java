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
        System.out.println("Enter a number between 5 and 30: ");
        int number = 0;
        
        while (!myScanner.hasNextInt()){
            System.out.println("Number must be an interger"); 
           myScanner.next();
        }
        number = myScanner.nextInt(); 
        
        while (number < 5 || number > 30){
            System.out.println("Number must be between 5 and 30"); 
            number = myScanner.nextInt(); 
        }
    }
}