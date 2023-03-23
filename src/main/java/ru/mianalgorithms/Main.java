package ru.mianalgorithms;

import ru.mianalgorithms.Utils.CreateUtil;
import ru.mianalgorithms.Utils.ShowUtil;

public class Main {
    public static void main(String[] args) {
        int[] array = CreateUtil.createRandomIntArray(100);
        ShowUtil.showArrays(array);
        Insertion.sort(array);
        ShowUtil.showArrays(array);
    }
}