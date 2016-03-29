/*Joseph Han 
CSE2
hw09

This homework has the objective of giving you practice in writing methods, 
overloading methods, and in forcing the user to enter good input. 
*/ 

import java.util.Scanner; 

public class Games{ 
    public static void main(String[] args){ 
    Scanner myScanner = new Scanner (System.in); 
    System.out.println("Welcome to [insert name here] game center"); 
    String game = ""; 

    game = myScanner.next(); 
    
    if(!game.equals("guessTheBox") && !game.equals("spinTheWheel") && !game.equals("scrambler")){
            System.out.println("Error, arcade does not have game."); 
            game = myScanner.next(); //validity check for string and game name
            return; 
    }
    
    if(game.equals("guessTheBox")){ //if the game is guessTheBox
        String result = guessTheBox(); //run guess the box
        System.out.println(result); //and print
    }
    
    if(game.equals("spinTheWheel")){ //if the game is spinTheWheel
        String outcome = spinTheWheel(); //run this game
        System.out.println(outcome); //and print
    }
    
    if(game.equals("scrambler")){ //if the game is scrambler
        String scrambled = scrambler(); //run this game
        System.out.println(scrambled); //and print
    }
    }
    
    public static String guessTheBox(){ //method for guessTheBox
        Scanner scan=new Scanner (System.in); //call Scanner for input 
        System.out.print("Enter a number between 1 and 3: ");
        int a = 0; 
        while (!scan.hasNextInt()){
            System.out.print("Number must be an interger, try again"); //validity check for integer
           scan.next();
        }
        a = scan.nextInt(); 
        int randomA = (int) (Math.random()*4)+1; //random number generation between 1 and 3
        while (a < 1 || a > 3){
            System.out.print("Number must be between 1 and 3, try again"); //validity check for input in range
            a = scan.nextInt(); 
        }
        
        if(a==randomA){ //if inputed integer and random chosen integer match
            return "Congratulaions, you just won a new car."; //print reward
        }
        else{ //if they dont equal, print 
            return "Sorry,  you did not win."; 
        }
    }
    
    public static String spinTheWheel(){ //method for spinTheWheel
        Scanner newScanner=new Scanner (System.in); 
        System.out.println("Enter a color: "); 
        String color = ""; 
        color = newScanner.next(); 
        
        int randomColor = (int) (Math.random()*3)+1; //random number generation for black or red
        int randomInt = (int) (Math.random()*6)+1; //random number generation between 1 and 5
        
        while (!color.equals("black") && !color.equals("Black") && !color.equals("red") && !color.equals("Red")){
            System.out.println("Enter black, Black, red or Red."); 
            color = newScanner.next(); //sees if color is equal to black or red (capitalization included)
        }
        int a = 0; 
        if(color.equals("black") || color.equals("Black")){
            a=1; //if color = black, let a = 1 for easiness
        }
        
        if(color.equals("red") || color.equals("Red")){
            a=2; //if color = red, let a = 2 for ease of use
        }
        
        System.out.println("Enter an integer between 1 and 5: "); 
        int number = 0; 
        while (!newScanner.hasNextInt()){
           System.out.println("Number must be an interger, try again" ); //validity check for integer
           newScanner.next();
        }
        
        number = newScanner.nextInt();
        
        while (number < 1 || number > 5){
            System.out.println("Number must be between 1 and 5, try again" ); //validity check for input in range
            number = newScanner.nextInt(); 
        }
        
        if(randomColor==a){ //if random color (1 or 2) is equal to a, which we assigned above depending on the color you input
            if(randomInt==number){ //if statements for the number you inputed and the number randomly chosesn
                return "You won!"; //both color and number are correct
            }
            else{
                return "Sorry, you lost!"; //color is correct but number is wrong
            }
        }
        else{
            return "Sorry, you lost!"; //color is wrong
        }
    }
    
    public static String scrambler(){ //method for scrambler
        Scanner newScan = new Scanner (System.in); 
        System.out.println("Enter a word: "); 
        String word = ""; 
        word = newScan.next(); //set input into a string
        
        int length = word.length(); //find length of inputed word
        char[] arr = word.toCharArray(); //char array puts the strings into individual chars
        for(int i=0; i<100; i++){ //while loop to run scrambler a lot
            int random = 1 + (int) (Math.random()*(length-1)); //random generator for numbers between 1 and length
            
            //swap chars
            char temp = arr[0]; //let char temp = to first char of word
            arr[0] = arr[random]; //first char of word is now the char of the random number found in the length
            arr[random] = temp; //char of random is = to temp
        }
        
        word = new String(arr); //put scrambled chars into a string
        
        return word;
        }
}
