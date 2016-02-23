//Joseph Han
//CSE2
//Hw04

/*This homework gives you practice with 
selection statements, operators, and String manipulation.*/ 


//Develop a program which takes decimal RGB values 
//(three inputs) and convert them to hexadecimal

import java.util.Scanner;

public class ToHex{
    public static void main(String[] args)  {
        
        Scanner myScanner = new Scanner (System.in);
        //declaring of a Scanner object 
        
        System.out.print("Please enter three numbers representing RGB values: ");
        //declaring scanning object 
        int rValue = myScanner.nextInt(); 
        int gValue = myScanner.nextInt();
        int bValue = myScanner.nextInt();
        
         
        if  (rValue >= 0 && rValue <= 255 && gValue >= 0 && gValue <=255 && bValue >= 0 && bValue <= 255){
        
        String r1Hex = "";  
        //setting hexademical into one string
        switch (rValue/16){
            case 0: r1Hex = "0";  //different cases for division 
            break; 
            case 10: r1Hex = "A"; 
            break; 
            case 11: r1Hex="B"; 
            break; 
            case 12: r1Hex="C";
            break;
            case 13: r1Hex="D";
            break;
            case 14: r1Hex="E";
            break; 
            case 15: r1Hex="F"; 
            break; 
            //switch statements for modular operation of each RGB value
            default: r1Hex = Integer.toString(rValue/16); 
            break;
            //default needed for modular decimals 0-9 --> hexademicals = decimal
        }
        
        String r2Hex = "";  
        //setting hexademical into one string
        switch (rValue%16){
            case 10: r2Hex = "A"; //different cases for remainder/modular 
            break; 
            case 11: r2Hex="B"; 
            break; 
            case 12: r2Hex="C";
            break;
            case 13: r2Hex="D";
            break;
            case 14: r2Hex="E";
            break; 
            case 15: r2Hex="F"; 
            break; 
            //switch statements for modular operation of each RGB value
            default: r2Hex = Integer.toString(rValue%16); 
            break;
            //default needed for modular decimals 0-9 --> hexademicals = decimal
        }
        
        String g1Hex = "";  
        //setting hexademical into one string
        switch (gValue/16){
            case 0: g1Hex = "0";  //different cases for division 
            break; 
            case 10: g1Hex = "A"; 
            break; 
            case 11: g1Hex="B"; 
            break; 
            case 12: g1Hex="C";
            break;
            case 13: g1Hex="D";
            break;
            case 14: g1Hex="E";
            break; 
            case 15: g1Hex="F"; 
            break; 
            //switch statements for modular operation of each RGB value
            default: g1Hex = Integer.toString(gValue/16); 
            break;
        } 
        
        String g2Hex = "";  
        //setting hexademical into one string
        switch (gValue%16){
            case 10: g2Hex = "A"; 
            break; 
            case 11: g2Hex="B"; 
            break; 
            case 12: g2Hex="C";
            break;
            case 13: g2Hex="D";
            break;
            case 14: g2Hex="E";
            break; 
            case 15: g2Hex="F"; 
            break; 
            //switch statements for modular operation of each RGB value
            default: g2Hex = Integer.toString(gValue%16); 
            break;
        }
        
        String b1Hex = "";  
        //setting hexademical into one string
        switch (bValue/16){
            case 0: b1Hex = "0";  //different cases for division 
            break; 
            case 10: b1Hex = "A"; 
            break; 
            case 11: b1Hex="B"; 
            break; 
            case 12: b1Hex="C";
            break;
            case 13: b1Hex="D";
            break;
            case 14: b1Hex="E";
            break; 
            case 15: b1Hex="F"; 
            break; 
            //switch statements for modular operation of each RGB value
            default: b1Hex = Integer.toString(bValue/16); 
            break;
        } 
        
        String b2Hex = "";  
        //setting hexademical into one string
        switch (bValue%16){
            case 10: b2Hex = "A"; //different cases for modular 
            break; 
            case 11: b2Hex="B"; 
            break; 
            case 12: b2Hex="C";
            break;
            case 13: b2Hex="D";
            break;
            case 14: b2Hex="E";
            break; 
            case 15: b2Hex="f"; 
            break; 
            //switch statements for modular operation of each RGB value
            default: b2Hex = Integer.toString(bValue%16); 
            break;
        }
            
            System.out.println("The decimal numbers R:" + rValue
            + " G:" +gValue + " B:" + bValue +", is represented in hexadecimal as: "
            +r1Hex+r2Hex+g1Hex+g2Hex+b1Hex+b2Hex); 
        }
        
        else{
            System.out.println("Sorry, your input must consist of integers "
            + "between 0-255"); 
        }
        
    }
}