import java.util.*;

public class Timing {


        public static void main(String[] args){
            int[] range = {10,100,1000,3000,5000,10000,30000,50000,100000,300000,500000,1000000};
            for (int arraySize : range) {
                long startTime = System.nanoTime();
                Sort.testableMethod(arraySize);
                long endTime = System.nanoTime();
                long duration = (endTime - startTime);
                System.out.println(duration);
            }
        }
    }








