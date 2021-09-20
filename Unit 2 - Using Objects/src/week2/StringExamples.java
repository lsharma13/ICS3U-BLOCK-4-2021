package week2;

public class StringExamples {
    public static void main(String[] args) {

        String s1 = "Max";   //String literal 
        String s2 = "Fred"; //String literal
        String s4 = "Max";  //String literal
        String s3 = new String("Kyle"); //String object 
        String s5 = new String("Max");  //String object


        System.out.println(s1.length());    //length returns the number of characters in the String 

        System.out.println(s1.equals(s5)); //true = same sequence of characters
        System.out.println(s1.equals("max")); //false - capitalization matters (M and m are not the same)

        System.out.println("Brad".indexOf("ra"));   // index of ra in Brad is 1
        System.out.println(s2.indexOf("Red"));      //Red is not in Fred so Fred returns -1 

        String x = "ABCDEF"; 

        System.out.println(x.substring(2)); 
        System.out.println(x.substring(2,4));   //starts at index 2 and then goes to index 4 but not including 3
        System.out.println(x.substring(2,3)); 
        System.out.println("Friday".substring(1, "Friday", length())); 


    } 
    
}
