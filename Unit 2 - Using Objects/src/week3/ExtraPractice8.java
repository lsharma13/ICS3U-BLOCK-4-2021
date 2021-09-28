package week3;

public class ExtraPractice8 {
        public static void main(String[] args) {
            int num2 = questionEight(10, 12, 16, 14); 
            System.out.println(num2);
        }

        private static int questionEight(int x1, int x2, int y1, int y2) {
            double slope = ((x1 + x2)/2) + ((y1 + y2)/2); 
            return (int) slope;
        }

    

     }
    

