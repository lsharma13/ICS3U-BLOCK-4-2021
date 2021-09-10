package week1;

public class ExampleFive {
    public static void main(String[] args) {
        int markOne = 75, markTwo = 80, markThree = 87;
        double average = (markOne + markTwo + markThree) / 3; 

        System.out.println("The average is: " + average);




        //Integer vs Double Divistion
        System.out.print(4 / 5);    //0 because there are no decimals.
        System.out.print(4.0 / 5);  //0.8 because there are decimals.
        System.out.print(5 / 4);    //1 because there are no decimals.
        System.out.print(5 / 4.0);  //1.25 because there are decimals.



        //Modulus Operator %
        
        System.out.println(13 / 3);     //13 divided by 3 = 4
        System.out.println(13 % 3);     //13 mod 4 = 1 because 1 is left over 
    }
}
