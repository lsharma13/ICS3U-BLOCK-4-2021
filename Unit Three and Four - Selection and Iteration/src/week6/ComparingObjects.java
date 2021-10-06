package week6;

public class ComparingObjects {
    public static void main(String[] args) {
        //when we compare Strings we NEVER EVER EVER use == in Java

        //why? coming soon 
        // if we don't instantiate an objet then the variable stores NULL
        // otherwise the variable stores the address of the actual object

        // Why? 
        // when you use == you aer comparing what is stored in the variable (the address - location in memory where it is stored)
        // two objects can have the same attributes and different address so == doesn't work 


        // equals method compares the sequence of the characters in the two objects 

    
        String s1 = new String("hello"); 
        String s2 = new String("hello"); 

        System.out.println(s1.equals(s2));      //whatever is on the left of the . is this 


        String str1 = "ABCD";   //comparing by alphabetical level 
        String str2 = "BCD"; 

        System.out.println(str1.compareTo(str2));
        
        //System.out.println("a".compareTo("g")); //-6 because 6 is 6 away 

        // if they are equal it returns 0 
        // if ("") is bigger than "".compareTo than - 
        // if "".compareTo is bigger that ("")



        
    }
    
}
