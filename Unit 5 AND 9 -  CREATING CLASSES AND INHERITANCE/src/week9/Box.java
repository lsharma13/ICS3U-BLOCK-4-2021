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
           * if the parent does not have a constructor, java makes one, that does nothing
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

     public int getArea(){
         //super.getArea();    //this will call the parent's method not constructor 
        return 2 * super.getArea() + 2 * getWidth() * height + 2 * getLength() * height;
        /**
         * if you have your own method, it will use it's own, this is where you need to use super. if you 
         * want the parent's function
         * if you don't have your own method (like getWidth and getLength), you don't need to use
         * super. 
         */
        }

     public int getPerimeter(){
         return 2 * super.getPerimeter() + 4 * height; 
         /**
          * using super.getPerimeter allows you to call the parent class's getPerimeter
          * if you just use getPerimeter, you are just calling yourself over again
          */
     }

     public boolean equals(Object obj){

        if (super.equals(obj))  {
            if (obj instanceof Box){
                return height == ((Box)obj).height; 
            }
        }
        return false; 

        /**if (obj == this)
            return true; 
        
            if (obj instanceof Box) {
                Box b = (Box) obj; 
                return getLength() == b.getLength() && getWidth() == b.getWidth(); 
            }else {
                return false; 
            }

    }
    */

}
   
    }

 
   
    
