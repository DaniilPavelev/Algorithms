package main.Algorithms.AlgorithmsUtils;

import java.util.Random;

public class CreateUtil {

    public static int[] createIntArray(int lenght){
        int[] array = new int[lenght];
        for(int i =0; i<lenght;i++){
            array[i]=i;
        }
        return array;
    }
    public static int[] createRandomIntArray(int lenght){
        Random random = new Random(10);

        int[] result = new int[lenght];
        for(int i=0;i<lenght;i++){
            result[i] = random.nextInt(1000);
        }
        return result;
    }

    public static double[] createRandomDoubleArray(int lenght){
        Random random = new Random(100);

        double[] result = new double[lenght];
        for(int i=0;i<lenght;i++){
            result[i] = random.nextDouble();
        }
        return result;
    }
}
