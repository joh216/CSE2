import java.util.Scanner; 

public class Symmetrit{
    public static void main(String[] args) {
        Scanner scan = new Scanner (System.in); 
        System.out.print("Print a non-negative integer that's in binary form 3 digits or less "); 
        int binary = scan.nextInt(); 
        int decimal; 
        
        switch (binary){
            case 0: decimal=0; 
            break; 
            case 1: decimal=1; 
            break; 
            case 10: decimal=2; 
            break; 
            case 11: decimal=3; 
            break; 
            default: System.out.println("Inappropriate integer"); 
            break; 
        }
            System.out.println(decimal); 
        
        
    }
}