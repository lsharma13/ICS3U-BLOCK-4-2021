package week3;

public class ExtraPractice6 {
public static void main(String[] args) {
        String str = questionSix("This is a sentence.", "ent"); // Should return "This is a sene"
        System.out.println(str); 
    }

        private static String questionSix(String str, String substr) {
        int index = str.indexOf(substr);
        String first = str.substring(0, index); 
        String second = str.substring(index + str.length()); 
        return first + second;

}
}