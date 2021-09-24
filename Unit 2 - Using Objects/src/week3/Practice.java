package week3;

public class Practice {
    public static void main(String[] args) {


        String str = "Random Numbers";  //take a random character in the string str and change it to the letter x 

        int index =  (int)(Math.random()*str.length()) + 0; 
        str = str.substring(0, index) + "x" + str.substring(index + 1); 
        System.out.println(str); 
}
}