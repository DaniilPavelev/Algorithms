package main.Algorithms.AlgorithmsUtils;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class ReadFromFileUtil {

    public static int[] get1mInt() throws FileNotFoundException {
        int[] result;
        List<Integer> ints = new ArrayList<>();
        File file = new File("D:\\data\\programmirovanie\\java\\Algorithms\\src\\main\\java\\main\\res\\1m int (1000)");
        Scanner scanner = new Scanner(file);
        while (scanner.hasNext()){
            ints.add(Integer.valueOf(scanner.nextLine()));
        }
        result = new int[ints.size()];
        for (int i = 0; i<ints.size();i++) result[i] = ints.get(i);
        return result;
    }
    public static int[] get10mInt() throws FileNotFoundException {
        int[] result;
        List<Integer> ints = new ArrayList<>();
        File file = new File("D:\\data\\programmirovanie\\java\\Algorithms\\src\\main\\java\\main\\res\\10m int (1000)");
        Scanner scanner = new Scanner(file);
        while (scanner.hasNext()){
            ints.add(Integer.valueOf(scanner.nextLine()));
        }
        result = new int[ints.size()];
        for (int i = 0; i<ints.size();i++) result[i] = ints.get(i);
        return result;
    }
    public static int[] get100kInt() throws FileNotFoundException {
        int[] result;
        List<Integer> ints = new ArrayList<>();
        File file = new File("D:\\data\\programmirovanie\\java\\Algorithms\\src\\main\\java\\main\\res\\100k int (1000)");
        Scanner scanner = new Scanner(file);
        while (scanner.hasNext()){
            ints.add(Integer.valueOf(scanner.nextLine()));
        }
        result = new int[ints.size()];
        for (int i = 0; i<ints.size();i++) result[i] = ints.get(i);
        return result;
    }
    public static int[] get300kInt() throws FileNotFoundException {
        int[] result;
        List<Integer> ints = new ArrayList<>();
        File file = new File("D:\\data\\programmirovanie\\java\\Algorithms\\src\\main\\java\\main\\res\\300k int (1000)");
        Scanner scanner = new Scanner(file);
        while (scanner.hasNext()){
            ints.add(Integer.valueOf(scanner.nextLine()));
        }
        result = new int[ints.size()];
        for (int i = 0; i<ints.size();i++) result[i] = ints.get(i);
        return result;
    }
    public static int[] get500kInt() throws FileNotFoundException {
        int[] result;
        List<Integer> ints = new ArrayList<>();
        File file = new File("D:\\data\\programmirovanie\\java\\Algorithms\\src\\main\\java\\main\\res\\500k int (1000)");
        Scanner scanner = new Scanner(file);
        while (scanner.hasNext()){
            ints.add(Integer.valueOf(scanner.nextLine()));
        }
        result = new int[ints.size()];
        for (int i = 0; i<ints.size();i++) result[i] = ints.get(i);
        return result;
    }
    public static int[] get15Int() throws FileNotFoundException {
        int[] result;
        List<Integer> ints = new ArrayList<>();
        File file = new File("D:\\data\\programmirovanie\\java\\Algorithms\\src\\main\\java\\main\\res\\15 int (10)");
        Scanner scanner = new Scanner(file);
        while (scanner.hasNext()){
            ints.add(Integer.valueOf(scanner.nextLine()));
        }
        result = new int[ints.size()];
        for (int i = 0; i<ints.size();i++) result[i] = ints.get(i);
        return result;
    }
    public static int[] get5mInt() throws FileNotFoundException {
        int[] result;
        List<Integer> ints = new ArrayList<>();
        File file = new File("D:\\data\\programmirovanie\\java\\Algorithms\\src\\main\\java\\main\\res\\5m int (1000)");
        Scanner scanner = new Scanner(file);
        while (scanner.hasNext()){
            ints.add(Integer.valueOf(scanner.nextLine()));
        }
        result = new int[ints.size()];
        for (int i = 0; i<ints.size();i++) result[i] = ints.get(i);
        return result;
    }
    public static int[] get3mInt() throws FileNotFoundException {
        int[] result;
        List<Integer> ints = new ArrayList<>();
        File file = new File("D:\\data\\programmirovanie\\java\\Algorithms\\src\\main\\java\\main\\res\\3m int (1000)");
        Scanner scanner = new Scanner(file);
        while (scanner.hasNext()){
            ints.add(Integer.valueOf(scanner.nextLine()));
        }
        result = new int[ints.size()];
        for (int i = 0; i<ints.size();i++) result[i] = ints.get(i);
        return result;
    }
}
