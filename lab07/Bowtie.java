/*Joseph Han 
CSE2
Lab07

The purpose of this lab is to write while loops
and use a break statement
*/ 

public class Bowtie{
    public static void main(String[] args){
        
        int nStars = 9; 
        int i = 1, j = nStars, k = 1, l = (nStars+1)/2; 
        int nSpaces = 1; 
        
       while(1<=j){
           i=1; 
           k=1; 
        while(nSpaces>k){
            System.out.print(" "); 
            k++; 
        }
       while(nStars>=i){
           System.out.print("*"); 
           i++; 
       }
       if (j>l){
           nStars--; nStars--; 
           nSpaces++; 
       }
       else{
           nStars++; nStars++; 
           nSpaces--; 
       }
       j--; 
       System.out.println(); 
       }
    }
}
