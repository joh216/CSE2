/*Joseph Han
CSE2
HW12

This homework gives you practice with arrays 
and in searching single dimensional arrays

*/ 
import java.util.Scanner;

public class CSE2Linear{ 
    public static void main(String[] args){ 
        
        Scanner scan = new Scanner (System.in); 
        
        int[] finalGrades = new int[15]; //set array of int to hold 15 members
        
        System.out.println("Enter 15 ints for final grades for CSE2: "); 
        
        for(int i=0; i<finalGrades.length; i++){
            finalGrades[i]=getInput();//call method to see if inputs are allowable
            if(i==0){ continue;} //skip at i=0 b/c you want the user to input a grade initially
            if(finalGrades[i]<finalGrades[i- 1]){ //checks if the next inputed final grade is 
            //greater than the previous
                System.out.println("Enter an input greater than or equal to the previous");
                i--; //redo the loop for input since entered grade is lower than previous grade
            } 
         }
        
        System.out.println("Sorted: "); 
        printArray(finalGrades); //call the sorted print method 
        
        String result = binarySearch(finalGrades); //call binary search method
        System.out.println(result); 
        
        scrambleGrade(finalGrades); //call scramble method
        
        printArray(finalGrades); //print the scrambled array
        
        linearSearch(finalGrades); //search for a grade in scrambled array 
        
    }
    public static int getInput(){ //method for input check
    
    Scanner scan = new Scanner (System.in); 
    System.out.println("Enter a grade: "); 
    int input = 0; 
    
    while (!scan.hasNextInt()){ //check for int
            System.out.println("Input must be an interger"); //has to be an int
           scan.next(); 
    }
    input = scan.nextInt(); 
    
    while (input<0 || input>100){ //has to be between 0 and 100
                System.out.println("Number must be between 0 and 100"); 
                input = scan.nextInt();
    }
    return input; //return input to each array member 
    }
    
    public static void printArray(int[] array){ //print the sorted array
        for(int i=0; i<array.length; i++){ 
            System.out.print(array[i] + " ");
    }
    System.out.println(); 
    }
    
    public static String binarySearch(int[] array){
        Scanner scan = new Scanner (System.in); 
        System.out.println("Enter a grade to search for: "); 
        int grade = scan.nextInt(); 
        int low = 0, high = 14; //set up high low for the range
        int mid = (low+high)/2; //find mid of the range
        int i = 1; //set up i to keep count of how many iterations
        while(low<high){ //loop to see if input is equal to the mid
            mid = (low+high)/2; 
            if (array[mid]==grade){
                return grade + " was found in the list in " + i + " iterations."; 
            }
            else if (grade>array[mid]){ //if input was higher than mid
                low=mid + 1; //mid is now the new low
                i++; //increase if not found 
            }
            else if (grade<array[mid]){ //if input was lower than mid
                high=mid - 1; //mid is now the new high
                i++; //increase if not found 
            }
        }
        return grade + " was not found in " + i + " iterations.";
    }
    
    public static void linearSearch(int[] array){ //method to find a specific grade
        Scanner scan = new Scanner (System.in); 
        System.out.println("Enter a grade to search for: "); 
        int grade = scan.nextInt(); 
        int i = 0; 
        for(i = 0; i<array.length; i++){ //linear search for the grade
            if(grade==array[i]){ //if equal print out it was found
                System.out.println(grade + " was found in " + i + " iterations");
                return;//return the found grade and leave the method 
            }
        }
        System.out.println(grade + " was not found in " + i + " iterations"); //if not found, print this
    }
    public static void scrambleGrade(int[] array){ //method to scramble grades
        System.out.println("Scrambled: "); 
        for (int i=0; i<array.length; i++){
            int target = (int) (array.length * Math.random()); //random generator for new member number
            int temp = array[target]; //create variable that is now the scrambled array member number
            array[target] = array[i]; //let new scrambled array member replace the old 
            array[i] = temp; //original array member is now switched to the new array member number
        }
    }

}