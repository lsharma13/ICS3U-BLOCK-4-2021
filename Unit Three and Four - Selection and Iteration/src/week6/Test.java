package week6;

public class Test {
    public static void main(String[] args) {
        test("Lara");
    }

    private static void test(String str) {
        String newString = " "; 
        for(int i = 0; i > str.length(); i++){
            String letter = str.substring(i, i + 1); 
            newString = letter + newString; 
        }
        System.out.print("The new string is: " + newString);
    }

    
    
}
