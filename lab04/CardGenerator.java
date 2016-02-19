//Joseph Han
//CSE2
// 2/19/16

//This lab is an exercise in using if statments, switch statements
//and in using Math.random(), a random number generator 

public class CardGenerator{
    public static void main(String[] args) {
        
        int cardNumber = (int) (Math.random()*53)+1;
        //random number generation between 1 and 52
        
        String suit=""; 
        String card=""; 
        
        if(cardNumber >=1 && cardNumber<=13){
            suit = "diamonds"; 
        } 
        else if(cardNumber >13 && cardNumber <=26){
            suit = "clubs";
        }
        else if (cardNumber > 26 && cardNumber<=39){
            suit = "hearts";
        }
        else if (cardNumber > 39 && cardNumber<=52){
            suit = "spades";
        }
        
        switch (cardNumber%13){
            case 1: card = "ace"; 
            break; 
            case 0: card = "king";
            break; 
            case 12: card = "queen";
            break; 
            case 11: card = "jack";
            break; 
            default: card = Integer.toString(cardNumber%13); 
        }
        
        System.out.println("You picked the " + card + " of " + suit); 
        
    }
}