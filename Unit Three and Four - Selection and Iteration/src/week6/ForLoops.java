package week6;

import java.util.Scanner;

public class ForLoops { //meant for counting 
    public static void main(String[] args) {
        
    //exampleOne();
    //test(); 
    getNumber(); 
    }

private static void exampleOne() {

    for(int index = 1; index <= 100; index++){    //same thing as while loops but everything goes in the restrictions 
                                                //can declare multiple variables if needed
        System.out.print(index); 
        }
    }


/**
 * private static void test(){
    Scanner in = new Scanner(System.in); 
    boolean playAgain = true; 

    while(playAgain){
        System.out.println("Game is playing..."); 
        System.out.println("Game is over"); 

        System.out.println("Do you want to play again: "); 
        playAgain = in.nextLine().equals("Yes");
    }
System.out.println("Bye"); 
}
equivalent to below 
 */


private static void test(){
    Scanner in = new Scanner(System.in); 

    for(boolean playAgain = true; playAgain; System.out.println("Bye")){
        System.out.println("Game is playing..."); 
        System.out.println("Game is over"); 

        System.out.println("Do you want to play again: "); 
        playAgain = in.nextLine().equals("Yes");
    }
 

private static int getNumber() {
    boolean validInput = false; 
    Scanner in = new Scanner(System.in); 
    System.out.println("Please enter a number [1, 10]: "); 

    while(!validInput){
        String input = in.nextLine(); 

        try{
            int result = Integer.parseInt(input); 
            if (result >=1 && result <= 10)
            return result; 
        else{
            System.out.println("Only numbers between 1 and 10 please: "); 
        } catch(Exception ex){
        System.out.println("Only numbers between 1 and 10 please: "); 
    }
}
}