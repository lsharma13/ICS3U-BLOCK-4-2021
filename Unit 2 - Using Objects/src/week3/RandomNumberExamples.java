package week3;

public class RandomNumberExamples {
    public static void main(String[] args) {
        double r = Math.random();
        System.out.println(Math.random()); 

        int lower = -5; 
        int upper = 5; 
        int numPossibilities = (upper-lower+1); 

        double random = (int)(r * numPossibilities) + lower;  
        System.out.println(random); 

        
        String str = "Random Numbers";  //take a random character in the string str and change it to the letter x 

        int index =  (int)(Math.random()*str.length()) + 0; 
        str = str.substring(0, index) + "x" + str.substring(index + 1); 
        System.out.println(str); 
    }
    
}
