package week3;

public class MathExamples {
    public static void main(String[] args) {
        System.out.println(Math.abs(-4));   //every method in the math class is static 
        System.out.println(Math.abs(-4.1));

        System.out.println(Math.pow(2,3));   //(base, to the power of) //2 to the power of 3

        //length of a line segment between two points 

        int x1 = 5;
        int y1 = 3; 

        int x2 = 10; 
        int y2 = 2; 

        double length = Math.sqrt(Math.pow((x2-x1),2) + Math.pow((y2-y1), 2)); 
        System.out.println(length); 
        
    }
}
