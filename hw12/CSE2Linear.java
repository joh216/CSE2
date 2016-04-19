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
        
        findGrade(finalGrades); //call find grade method
        
        scrambleGrade(finalGrades); //call scramble method
        
        printArray(finalGrades); //print the scrambled array
        
        findGrade(finalGrades); //search for a grade in scrambled array 
        
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
    
    public static void findGrade(int[] array){ //method to find a specific grade
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