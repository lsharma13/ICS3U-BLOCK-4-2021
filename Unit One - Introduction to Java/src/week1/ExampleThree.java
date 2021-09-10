package week1;

/**
 * Escape Seuqences
 */


public class ExampleThree {
    public static void main(String [] args) {

        //System.out.println("This is "very" important!"); // double quotes encapsulate.
        //string literals - putting a quote in a String literal gets Java UPSET.

        System.out.println("This is \"very\" important!"); // \backslash escapes a character - creates an escape

        //System.out.println("This is \very" important!");    // \v is not a valid escape

        System.out.println("This is very \\important!");
        System.out.println("This\nis\nvery\nimportant!"); 
    }
}