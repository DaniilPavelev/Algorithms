package main.Algorithms.SortAlgorithms;

public class Selection {
    public static void sort(int[] a){
        int N = a.length;
        for(int i=0;i<N;i++){
            int min =i;
            for(int j=i+1;j<N;j++){
                if(a[j]<a[min]){
                    min = j;
                }
            }
            replace(a,i,min);
        }
    }

    private static void replace(int[] a, int b, int c) {
        int buff;
        buff = a[b];
        a[b] = a[c];
        a[c] = buff;
    }

    private static boolean less(Comparable comparable, Comparable comparable1) {
    if (comparable.compareTo(comparable1) == -1) return true;
    else return false;
    }
}
