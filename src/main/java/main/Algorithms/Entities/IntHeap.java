package main.Algorithms.Entities;

public class IntHeap {
    private int[] array;
    private int heapSize;



    public IntHeap(int[] array) {
        this.array = array;
        this.heapSize = array.length;
    }

    public int[] getArray() {
        return array;
    }

    public int getHeapSize() {
        return heapSize;
    }

    public void decreaseHeapSize() {
        this.heapSize -=1;
    }
}
