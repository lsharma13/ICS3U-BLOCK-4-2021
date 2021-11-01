package week8; 

/**
 * private - belongs to the class
 */

public class Die {
           
    //attributes define the state of an instance of the class at any particular time 
   private int numSides;    //private means that they are only accessible (visible) inside the class
   private int topSide;     //private means that they are only accessible (visible) inside the class

  /**constructor 
    Has the same name as the class
    Initializes the state of the class (attributes) - sets the attributes to what they should be at the 
    beginning
    returns the object (although we do not say return)
    */
 

    /* 
    if we do not EXPLICITLY create our own constructor JAVA will supply a NO ARGUMENT constructor 
    that DOES NOT initialize the state of the class (attributes)
    */

   public Die() {
       numSides = 6; 
       roll();     
   }
   public Die(int numSides) {
       this.numSides = numSides; 
       roll(); 

   }


   public int getTopSide(){
    return topSide; 
   }
    /**
    * accessor methods
    - accesses a method 
    * @return
    */

  
   public void roll(){
       topSide = (int)(Math.random()* numSides) + 1;
   }

    /**
    * mutator methods
    - to change or mutate methods
    */

    public boolean equals(Object obj) {
        if(obj == this){
            return true; 
        }
        if (obj instanceof Die) {
            return this.topSide == ((Die)obj).topSide;
        }else { 
        return false;
    }
}

    public String toString(){
        return "" + topSide; 
    }
}