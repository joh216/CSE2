/*Joseph Han
CSE2
LAB09

Methods allow software developers to modularize and reuse their code in many contexts, 
reducing the chance for bugs and increasing productivity. 
This lab will give you basic experience in declaring and calling methods. 

Artificial story generation is an aspect of computer games and human computer interaction
that tries to add additional realism to interactive software. 
At a basic level, there is a focus on randomly generating grammatically correct English sentences.  
In this lab, we will generate some basic random sentences. */ 

import java.util.Random; //import Random class

public class Methods{ 
    public static void main(String[] args){ 

    String a,b,c,d; 
        for(int i = 0; i<7; i++){
            switch(i){
            case 0: System.out.print("The "); 
            break; 
            case 1: a=adjectives(); 
            System.out.print(a+" ");
            break; 
            case 2: b=subject();
            System.out.print(b+" "); 
            break; 
            case 3:c=pastTenseVerb(); 
            System.out.print(c+" "); 
            break; 
            case 4: System.out.print("the "); 
            break; 
            case 5: a=adjectives();
            System.out.print(a+" "); 
            break; 
            case 6: d=object();
            System.out.print(d+"."); 
            break; 
            }
        }
        System.out.println(); 
    }
    
    public static String adjectives(){ //method for adjective
    Random randomGenerator = new Random(); //creating Random() object
    int randomA = randomGenerator.nextInt(10); //statement generates random integers less than 10
        String adj = ""; //setting an adjective to a string
        switch(randomA){ //assignment of string based on random integer
            case 0: adj = "quick"; 
            break; 
            case 1: adj = "mean"; 
            break; 
            case 2: adj = "cool"; 
            break; 
            case 3: adj = "big"; 
            break; 
            case 4: adj = "tall"; 
            break; 
            case 5: adj = "small"; 
            break; 
            case 6: adj = "crazy"; 
            break; 
            case 7: adj = "scary"; 
            break; 
            case 8: adj = "shy"; 
            break; 
            case 9: adj = "lazy"; 
            break; 
        }
        return adj; 
    }
    
    public static String subject(){ //method for subject
    Random randomGenerator = new Random(); //creating Random() object
    int randomB = randomGenerator.nextInt(10); //statement generates random integers less than 10
        String sub = ""; //setting subject to a string
        switch (randomB){ //switch statement for assingment of subject
            case 0: sub = "man"; 
            break; 
            case 1: sub = "woman"; 
            break; 
            case 2: sub = "dog"; 
            break; 
            case 3: sub = "policeman"; 
            break; 
            case 4: sub = "cat"; 
            break; 
            case 5: sub = "boy"; 
            break; 
            case 6: sub = "girl"; 
            break; 
            case 7: sub = "child"; 
            break; 
            case 8: sub = "firefighter"; 
            break; 
            case 9: sub = "ninja"; 
            break; 
        }
        return sub; 
    }
    
    public static String pastTenseVerb(){ //method for verb
    Random randomGenerator = new Random(); //creating Random() object
    int randomC = randomGenerator.nextInt(10); //statement generates random integers less than 10
        String verb = ""; //setting verb to a string
        switch (randomC){  //assignment of verb to random number
            case 0: verb = "passed"; 
            break; 
            case 1: verb = "fought"; 
            break; 
            case 2: verb = "raced"; 
            break; 
            case 3: verb = "helped"; 
            break; 
            case 4: verb = "taught"; 
            break; 
            case 5: verb = "calmed"; 
            break; 
            case 6: verb = "kicked"; 
            break; 
            case 7: verb = "called"; 
            break; 
            case 8: verb = "captured"; 
            break; 
            case 9: verb = "attacked"; 
            break; 
        }
        return verb; 
    }
    
     public static String object(){ //method for object 
     Random randomGenerator = new Random(); //creating Random() object
     int randomD = randomGenerator.nextInt(10); //statement generates random integers less than 10
        String obj = ""; //setting object to a string
        switch (randomD){ //assignment of object based on random integer 
            case 0: obj = "teenager"; 
            break; 
            case 1: obj = "grandpa"; 
            break; 
            case 2: obj = "grandma"; 
            break; 
            case 3: obj = "doctor"; 
            break; 
            case 4: obj = "tiger"; 
            break; 
            case 5: obj = "teacher"; 
            break; 
            case 6: obj = "witch"; 
            break; 
            case 7: obj = "kid"; 
            break; 
            case 8: obj = "athlete"; 
            break; 
            case 9: obj = "farmer"; 
            break; 
        }
        return obj; 
     }
}