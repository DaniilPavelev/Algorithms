package ru.mianalgorithms;

public class Insertion {
    public static void sort(int[] a){
        int N = a.length;
        for(int i=0; i<N;i++){
            int curent= i;
            for(int j = i;j>=0;j--){
                if(a[curent] < a[j]){
                    replace(a,curent,j);
                    curent=j;
                }
            }
        }
    }

    private static void replace(int[] a, int i, int min) {
        int buff;
        buff = a[i];
        a[i] = a[min];
        a[min] = buff;
    }
}
