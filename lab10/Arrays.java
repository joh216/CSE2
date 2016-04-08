/*Joseph Han
CSE2
4/8/16

This lab will get you familiar with 
one-dimensional array. */ 

import java.util.Scanner; 

public class Arrays{ 
    public static void main(String[] args){
        Scanner scan = new Scanner (System.in); 
        
         int random = (int) (Math.random()*11)+5; 
         
         String[] students = new String[random]; 
         
         System.out.println("Enter " + random + " student names:"); 
         
         for(int i=0; i<random; i++){
            students[i]=scan.nextLine(); 
         }
         
         
         int[] midterm = new int[random]; 
         
         for(int j=1; j<random; j++){
             int random2 = (int) (Math.random()*101);
             midterm[j]=random2; 
         }
         
         System.out.println("Here are the midterm grades of the " + random + " students above:"); 
         for(int k=0; k<random; k++){
             System.out.println(students[k] + ": " +midterm[k]); 
         }
    }
}