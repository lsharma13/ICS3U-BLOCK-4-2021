package week2;

public class ModulusExample {
    public static void main(String [] args) {
        int num = 5672;     // base 10 system. 2 is 2 * 10^0; 7 is 2 * 10^1; so on 
        int num1 = num / 1000;  // 5 
        int num4 = num % 10;      // modulus of 2 
        int num2 = num % 1000 / 100;    // 5672 % 1000 => 672 / 100 => 6
        num2 = num / 100 % 10;  //  576 /10 => 56 % 10 => 6 // any time you % 10 you get the ones column

        int num3 = num % 100 / 10;  // 7
        num3 = num / 10 % 10; 

        System.out.println(num1 + num2 + num3 + num4); 

        
    }
    
}
