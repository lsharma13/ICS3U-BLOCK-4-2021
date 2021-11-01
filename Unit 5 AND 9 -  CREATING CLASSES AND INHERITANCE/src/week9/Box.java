package week9;

/**
 * implicit - java makes it 
 * explicit - you make it 
 */

public class Box extends Rectangle { //everything extends object, even if you do not state it
    /**
     * if you do not explicitly write a constructor, then java will implicitly write one for you, that takes 
     * NO ARGUMENTS and calls the PARENT class' no argument constructor 
     */
   
   
     /*
    public Box() {  //constructor that java makes automatically, if you do not make one 
    super();    
    */

    /**
     * super - refers to the parent class
     * this - instance of the class
     */

     private int height;    //everything from the parent class, the object inherits. 
   

     public Box(int l, int w, int h){      
          /**
           * you have to call your parent's constructor in your constructor or java will call the 
           * parent's no argument constructor, since the parent does not have a no argument constructor
           * it does not work.
           */

           /**
            * the FIRST STATEMENT of a constructor must be a call to the classes parent constructor
            */

         /*
         we do not get to directly access the parent class's private attributes and methods
         length = l; 
         width = w; 
         */
         super(l,w);     //calling the parent's no argument constructor <- this must be done before anything else
         height = h; 
     }

     public Box(int side){
         super(side); 
         height = side; 
     }
   
    }

 
   
    
