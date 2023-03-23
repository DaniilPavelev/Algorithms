package main.Algorithms.SortAlgorithms;

import main.Algorithms.Entities.IntHeap;

public class HeapSort {
    public static void sort(int[] a){
       IntHeap A = new IntHeap(a);
       BuildMaxHeap(A);
       for(int i = A.getArray().length-1;i>1;i--){
           replace(A.getArray(),0,i);
           A.decreaseHeapSize();
           MaxHeapify(A,0);
       }
    }

    private static void BuildMaxHeap(IntHeap A){
        for(int i = A.getArray().length/2;i>=0;i--) MaxHeapify(A,i);
    }


    private static void replace(int[] a, int b, int c) {
        int buff;
        buff = a[b];
        a[b] = a[c];
        a[c] = buff;
    }

    private static int left(int a){
        return 2*a+1;
    }

    private static int right(int a){
        return 2*a+2;
    }

    private static void MaxHeapify(IntHeap A,int i){
        int l = left(i);
        int r = right(i);
        int largest;
        if(l<=A.getHeapSize()-1&&A.getArray()[l]>A.getArray()[i]){
            largest = l;
        }
        else largest = i;
        if(r<=A.getHeapSize()-1&&A.getArray()[r]>A.getArray()[largest]){
            largest = r;
        }
        if(largest!=i){
            replace(A.getArray(),largest,i);
            MaxHeapify(A,largest);
        }
    }
}
