package week3;

public class WrapperClassExamples {
    public static void main(String[] args) {
       // Integer n = new Integer(7); 
    
        //Double d = new Double(3.2); 

        Integer num = 7;    //auto-boxing
        //int x = new Integer(7);     //auto un-boxing
            

        int z = num.intValue();     //integer method has a non-static method called intValue 
        z = num;    //num is an integer object, if you try to give an integer an object it unboxes it 
        System.out.println(z);


        //double f = d;             //create a primitive object f and assign it to a double value d (unboxes it)
            //you can interchange between the primitives and objects wrapper classes because java will unbox it automatically
        //f = d.doubleValue(); 
            
        
        System.out.println(Integer.MAX_VALUE);  //max value (is a static value) belongs to the class, so you activate it through the class name
        System.out.println(Integer.MIN_VALUE); 


        
    }     
    }
    
