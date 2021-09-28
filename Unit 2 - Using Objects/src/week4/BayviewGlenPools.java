package week4;

public class BayviewGlenPools{
    public static void main(String[] args) {
        final int length = 20; 
        final int width = 8; 
        final int shallowLength = 5; 
        final int transition = 7; 
        final int shallowHeight = 3; 
        final int deepHeight = 8; 
       // final int linerCost = 2; 

    

        double volume = getVolume(length, width, shallowLength, transition, shallowHeight,
        deepHeight); 
        System.out.println(volume);
        double surfaceArea = getSurfaceArea(length, width, shallowLength, transition, shallowHeight,
        deepHeight); 
        System.out.println(surfaceArea);


    }

    
    private static double getVolume(int length, int width, int shallowLength, int transition, int shallowHeight,
            int deepHeight) {
                double transitionBase = Math.sqrt((Math.pow(transition, 2)) - Math.pow(deepHeight - shallowHeight,2)); 
                double deepLength = length - shallowLength - transitionBase; 

                double volumeDeep = width*(deepLength)*deepHeight;
                double volumeShallow = width*shallowLength*shallowHeight; 

                double transitionAbove = transitionBase * shallowHeight * width; 
                double volumeTransition = (width * (deepHeight - shallowHeight) * transitionBase *0.5); 

                double answer = volumeShallow + volumeDeep + transitionAbove + volumeTransition;
                double ninetyPercentFull = answer * 0.9; 
                
                return (ninetyPercentFull); 
        

            }   

            private static double getSurfaceArea(int length, int width, int shallowLength, int transition, int shallowHeight,
            int deepHeight) {

                double transitionBase = Math.sqrt((Math.pow(transition, 2)) - (Math.pow(deepHeight - shallowHeight,2)));
                double deepLength = length - shallowLength - transitionBase; 

                double saDeep = 2*( width * deepLength + deepHeight * deepLength + deepHeight * width) - deepHeight * deepLength; 
                double saShallow = 2*(width*shallowLength + shallowHeight*shallowLength + shallowHeight*width) - shallowHeight * shallowLength; 
                
                double saTransition = 2*((transitionBase*(deepHeight - shallowHeight))/2); 

                double answer = saShallow + saDeep + saTransition;
                
                return answer; 
                
    }
    
}

