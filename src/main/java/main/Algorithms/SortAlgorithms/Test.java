package main.Algorithms.SortAlgorithms;

import main.Algorithms.AlgorithmsUtils.ReadFromFileUtil;
import main.Algorithms.AlgorithmsUtils.StopWatch;
import main.Algorithms.AlgorithmsUtils.CreateUtil;
import main.Algorithms.AlgorithmsUtils.ShowUtil;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.lang.reflect.Field;

public class Test {

    public static void main(String[] args) throws IOException {

        int[] array = ReadFromFileUtil.get100kInt();

//        File file = new File("D:\\data\\programmirovanie\\java\\Algorithms\\src\\main\\java\\main\\res\\500k int (1000)");
//        FileWriter writer = new FileWriter(file);
//        for(int a:array){
//            writer.write(String.valueOf(a)+'\n');
//        }
//        writer.close();


 //      ShowUtil.showArrays(array);
        StopWatch stopWatch = new StopWatch();
        Insertion.sort(array);
        long time = stopWatch.checkTime();
 //       ShowUtil.showArrays(array);
        System.out.println(time);
    }
}