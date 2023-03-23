package Algorithms.SortAlgorithms;

import Algorithms.AlgorithmsUtils.CreateUtil;
import Algorithms.AlgorithmsUtils.ShowUtil;

public class Main {
    public static void main(String[] args) {
        int[] array = CreateUtil.createRandomIntArray(100);
        ShowUtil.showArrays(array);
        Insertion.sort(array);
        ShowUtil.showArrays(array);
    }
}