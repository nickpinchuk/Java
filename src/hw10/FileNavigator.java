package hw10;

import java.io.File;
import java.util.*;
import java.util.function.BiFunction;

public class FileNavigator extends FileData{
    static BiFunction<String, String, String> bFunc = (oldValue, newValue)->oldValue+";"+newValue;

    static Map<String, String> listName = new HashMap<>();
    public static void main(String[] args) {
        add(path, name);
        add(path1, "FileData.java");
        add(path1, "FileNavigator.java");
        System.out.println("listName = " + listName);
        System.out.println(find(path));
        System.out.println(find(path).length());
        listName.entrySet().stream()
                .sorted(Map.Entry.<String, String>comparingByValue().reversed())
                .forEach(System.out::println);
        remove(path1);
        System.out.println("listName = " + listName);

    }
    private static void add(String path, String name){

        listName.merge(path, name, bFunc);
    }

    private static String find(String path) {
        return listName.get(path);
    }
    private static void remove(String line){
        listName.remove(line);
    }
}