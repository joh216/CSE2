/*Joseph Han
CSE2
hw12

*/ 

import java.util.Scanner;
public class RemoveElements{
  public static void main(String [] arg){
	Scanner scan=new Scanner(System.in);
int num[]=new int[10]; //set array to hold 10 integers
int newArray1[];
int newArray2[];
int index,target;
	String answer="";
	do{
  	System.out.print("Random input 10 ints [0-9]");
  	num = randomInput(num); //call randomInput method 
  	String out = "The original array is:";
  	out += listArray(num); //list array members
  	System.out.println(out);
 
  	System.out.print("Enter the index ");
  	index = scan.nextInt();
  	newArray1 = delete(num,index);
  	String out1="The output array is ";
  	out1+=listArray(newArray1); //return a string of the form "{2, 3, -9}"  
  	System.out.println(out1);
 
      System.out.print("Enter the target value ");
  	target = scan.nextInt();
  	newArray2 = remove(num,target);
  	String out2="The output array is ";
  	out2+=listArray(newArray2); //return a string of the form "{2, 3, -9}"  
  	System.out.println(out2);
  	 
  	System.out.print("Go again? Enter 'y' or 'Y', anything else to quit-");
  	answer=scan.next();
	}while(answer.equals("Y") || answer.equals("y"));
  }
 
  public static String listArray(int num[]){ //method to print out array
	String out="{";
	for(int j=0;j<num.length;j++){
  	if(j>0){
    	out+=", ";
  	}
  	out+=num[j];
	}
	out+="} ";
	return out;
  }
  
  public static int[] randomInput(int[] array){ //assign random int from 0 to 9 to each array member 
      for(int i=0; i<array.length; i++){
             int random = (int) (Math.random()*10); //set a variable to a random number btween 0 and 9
             array[i]=random; 
      }
      return array; 
  }
  
  public static int[] delete(int[] array, int index){ //method to delete an element position
    if(index>9 || index<0){
      System.out.println("The index is not valid."); //if not in range, print invalid
      return array; 
    }
    else{ 
      int array2[] = new int[array.length - 1]; //new length of array
      for(int i=0; i<array2.length; i++){ 
        if(i>=index){ //if position number is equal to or greater than index
          array2[i]=array[i + 1]; //shift elements left 
        }
        else{ 
          array2[i]=array[i]; //if position number is less than array, keep array element the same
        }
      }
      return array2; //return new array 
    }
  }
    public static int[] remove(int[] array, int target){ //method to remove certain value(s) in array
      int counter = 0; //create var counter to see how many times target shows up
      for(int i=0; i<array.length; i++){ 
      if(array[i] == target){ //if value in that position = target, increase counter by 1
        counter +=1; 
      }
    }
    int array2[] = new int[array.length - counter]; //create new array with length without the target variables
    int h = 0; //create var h for new array position 
    for(int j=0; j<array.length; j++){
      if(array[j]!=target){ //if array values does not equal target 
        array2[h]=array[j];//then let new array position equal to that position
        h++; //this will skip any variables that are equal to that target
      }
    }
    return array2; 
    }
}