/*Joseph Han 
CSE2
Lab07

The purpose of this lab is to write while loops
and use a break statement
*/ 

import java.util.Scanner; 

public class BowTie{
    public static void main(String[] args){
        
        Scanner myScanner=new Scanner (System.in); 
        System.out.println("Enter a number between 3 and 33: ");
        int nStars = 0; 
        
        while (!myScanner.hasNextInt()){
            System.out.println("Error: please type in an integer");
            myScanner.next(); //seeing if input is an integer 
        }
        nStars = myScanner.nextInt(); 
        
        while (nStars<3 || nStars>33 || nStars%2!=1){
            System.out.println("Error: please type in an integer between 3 and 33"); 
            nStars = myScanner.nextInt(); //seeing if integer is between 3 and 33
        }
        
        int i = 1, j = nStars, k = 1, l = (nStars+1)/2; 
        int nSpaces = 1;  
        
       while(1<=j){ //setting up first loop 
           i=1; //reset values to 1
           k=1; 
        while(nSpaces>k){
            System.out.print(" "); 
            k++; //loop that prints out spaces before stars
        }
       while(nStars>=i){
           System.out.print("*"); 
           i++; //loop that prints out stars
       }
       if (j>l){ //if j is greater than 5, decrease number of stars and increase spaces
           nStars--; nStars--; 
           nSpaces++; 
       }
       else{ //if not, increase numbers of stars and decrease spaces
           nStars++; nStars++; 
           nSpaces--; 
       }
       j--; //decrease j to match number of rows
       System.out.println(); 
       }
    }
}
