package org.example.Utils;

public class ShowUtil {
    public static void showArrays(int[] a){
        for(int item: a){
            System.out.print(String.valueOf(item)+", ");
        }
        System.out.println();
    }
}