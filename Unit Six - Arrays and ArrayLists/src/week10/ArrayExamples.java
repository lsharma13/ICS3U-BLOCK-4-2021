package week10;

public class ArrayExamples {
    public static void main(String[] args) {
        exampleOne();
        exampleTwo();  
        /**
         * square bracket is what we use for arrays, there are no methods
         * ex. int[] arr = new int[s]   <- specify the size of arrays at beginning
         * check OneNote for drawing
         * arrays are not classes but reference types
         */

         int[] arr = {5,7,3,2,5,2};     // <- this is a new array that contains 5,7,3,2,5,2
        // most likely will not use this; but in mc questions
        mystery(arr); 

       numOdd(arr); 

        String[] names = { "Eva", "Lara", "Muriel"}; 
        String[] names2 = { "James", "Eva", "Sylvia", "Muriel", "Lara"}; 
        mystery(names, names2); 
    }

    private static String[] mystery(String[] names, String[] names2) {
        String[] greatNames = new String[5]; 
        int numGreatNames = 0; 
        
        for (int i = 0; i < names.length; i++) {
            String name = names[i]; 
            for (int j = 0; j < names2.length; j++) {
                if(name.equals(names2[j])){
                    greatNames[numGreatNames] = name; 
                    numGreatNames++; 
                }
            }
        }
        
        return greatNames;
    }


    private static int numOdd(int[] arr) {
        int numOdd = 0; 

       for (int i = 0; i < arr.length; i++) {
           if(arr[i] % 2 == 1){
               numOdd++; 
           }
       }
        return numOdd; 
    }


    private static void mystery(int[] arr) {
        int index = (int)(Math.random()*arr.length); 
        arr[index] = -arr[index]; 
        //taking the random index and flipping the sign of that index
        /**
         * it keeps the negative when it is outside the method because its not a copy of the array,
         * its a copy of the reference 
        */
        }

    private static void exampleTwo() {
        Animal[] animals = new Animal[3];   //<- automatically everything is null
        animals[1] = new Animal();  
        // animals at index 1 is a new animal, so in index 1 there is a reference to an animal
        animals[1].eat(); 
    }

    private static boolean exampleOne() {
        int[] arr = new int[5]; 
        //for a primitive int array, all the "boxes" are initially/automatically 0
        arr[4] = 2;     //by doing this, index 4 gets a 2 and index 2 gets a 7 
        arr[2] = 7; 

        System.out.println(arr.length); // <- arr.length has no round brackets because it is not a method

        if(arr[arr.length - 2] ==1){    // <- this finds the last 2 elements/chars of the array 
            return true; 
        }else{
            return false; 
        }
        
         
    }

    
    
}
