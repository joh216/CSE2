/*Joseph Han 
CSE2
HW06

Purpose is to practice writing and using loops
*/ 

public class TextSpinner{ 
    public static void main(String[] arg){
        
        int number = 1; 
        
        while(number >= 1){ 
            switch(number%4){
                case 1: System.out.print("/"); 
                break; 
                case 2: System.out.print("-"); 
                break; 
                case 3: System.out.print("\\"); 
                break; 
                case 0: System.out.print("|"); 
                break; 
            }
            number++;
            }
            
            System.out.println();
    }
}