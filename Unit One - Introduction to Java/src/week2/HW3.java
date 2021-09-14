package week2;

public class HW3 {
    public static void main(String [] args) {
        int num = 93460; 

        int num4 = num % 100 / 10; 
        int num2 = num / 1000 % 10; 

        int sum = num2 * num4; 

       System.out.println("The product of the 4th and 2rd digits of 93460 is" + " " + sum);
    }
    
}
