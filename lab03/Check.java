//Joseph Han
//2/12/16
//CSE2 

//The user has gone out to dinner with friends. After they receive the bill, 
//they decide to split the check evenly. Write a program that uses the 
//Scanner class to obtain from the user the original cost of the check, 
//the percentage tip they wish to pay, and the number of ways the check will be split. 
//Then determine how much each person in the group needs to spend in order to pay the check.

import java.util.Scanner; 

//adding class and main method 
public class Check{
    //main method required for every Java program
    public static void main(String[] args) {
        
        Scanner myScanner = new Scanner(System.in); //declaring of the Scanner object 
        
        System.out.print("Enter original cost of the check in the form xx.xx");
        
        double checkCost = myScanner.nextDouble();
        
        System.out.print("Enter the percentage tip you wish to pay as a whole number");
        double tipPercent = myScanner.nextDouble();
        
        tipPercent/= 100; //we want to convert the percentage into decimal value
        
        System.out.print("the number of people who went to dinner");
        
        int numPeople = myScanner.nextInt(); 
        
        double totalCost; 
        double costPerPerson; 
        int dollars, //whole dollar amount of cost
        dimes, pennies; //for storing digits to the right
            //of the demical point for the cost$
        totalCost = checkCost * (1 + tipPercent);
        costPerPerson = totalCost / numPeople;
        //get the whole amount, dropping demical fraction
        dollars = (int) costPerPerson; 
        //get dimes amount, e.g., 
        //(int)(6.73 * 10) % 10 -> 67 % 10 -> 7
        //where the % (mod) operator returns the remainder
        //after the division:   583%100 -> 83, 27%5 -> 2 
        dimes=(int)(costPerPerson * 10) % 10;
        pennies=(int)(costPerPerson*100)%10; 
        System.out.println("Each person in the group owes $"
        + dollars + '.' + dimes + pennies);
        
    } //end of main method
}//end of class