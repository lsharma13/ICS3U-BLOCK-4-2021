package week3;

public class ExtraPractice4 {
    public static void main(String[] args) {
         int numbers = questionFour(10, -4); 
         System.out.println(numbers);
    }


    private static int questionFour(int larger, int smaller) {
        int num4 = (int)(Math.random()*(larger-smaller+1)) + smaller; 
        return num4;
        
    }
}