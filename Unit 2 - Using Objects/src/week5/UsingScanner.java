package week5;

import java.util.Scanner;

public class UsingScanner {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in); //declare scanner in the main (system.in is the input device (computer keyboard))
       // exampleOne(in); 
        exampleTwo(in); 
        in.close();     //closing in 
    
    }

    private static void exampleTwo(Scanner in) {
        System.out.print("Please enter a number: ");
       // double num = in.nextDouble();   //takes next double that is typed in but PROBLEMS:  if an int is typed in it crashes, it doesn't throw away the enter key
        
       double num = 6; 

       boolean validInput = false; 


       while (!validInput){ //does not equal a valid input, does not equal true, equals false 
       try{
       num = Double.parseDouble(in.nextLine());  //Double.parseDouble = if the string represents a double it will turn it into a double
       validInput = true; 
        }catch(Exception ex){
           System.out.print("Invalid input!!! Please enter a number: ");
       }

       double result = Math.pow(num,2);    //pow = static, belongs to the Math class 
       System.out.println(result);
    }

    private static void exampleOne(Scanner in) {
        System.out.print("Please enter your name: ");
        String name = in.nextLine();    //next line = grabs everything up until enter key - puts them as a string and gets rid of enter key 
        
        System.out.println("Hello " + name);
    }
    
}
}
