package main.Algorithms.SortAlgorithms;

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

    private static void replace(int[] a, int b, int c) {
        int buff;
        buff = a[b];
        a[b] = a[c];
        a[c] = buff;
    }
}
