package week2;

/**
 * Type Casting
 */

public class ExampleEight {
    public static void main(String[] args) {
        final int NUM_MARKS = 5; 

        int markOne = 78, markTwo = 87, markThree = 64, markFour = 95, markFive = 84; 

        double average = (double)(markOne + markTwo + markThree + markFour + markFive) / NUM_MARKS; 
        //* if you want to treat one number as a type, you just need to specify which type in () before the number

        System.out.println("The average is: " + average); 

        double y = 3.7; 
        //int x = (int)3.7; 

        double z = (double)7;  //explicit cast 

        //int -> double // widening conversion
        //double -> int // narrowing conversion 

       //boolean p = (int)true; // cannot cast from boolean to int
    }
    
}
