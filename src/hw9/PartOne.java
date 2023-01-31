package hw9;

import java.util.*;

public class PartOne {

    public static void main(String[] args) {
        String [] array = new String[]{"One", "Two", "Three", "Four", "Five"};
        String line = "ONE";
        List<String> list = new ArrayList<>();
        list.add("ONE");
        list.add("TWO");
        list.add("THREE");
        list.add("FOUR");
        list.add("FIVE");
        list.add("ONE");
        list.add("TWO");
        list.add("SIX");
        list.add("ONE");
        list.add("SEVEN");
        list.add("SEVEN");
        List<Integer> numbers = new ArrayList<Integer>();
        numbers.add(1);
        numbers.add(4);
        numbers.add(2);
        numbers.add(3);
        numbers.add(2);
        numbers.add(4);
        numbers.add(5);
        numbers.add(6);
        numbers.add(7);
        numbers.add(8);
        numbers.add(2);
        numbers.add(4);
        numbers.add(9);
        numbers.add(10);
        countOccurance(list, line);
        System.out.println(toList(array));
        System.out.println(findUnique(numbers));
    }


    public static void countOccurance (List<String> list, String line){
        int count = 0;
        for(String lists : list){

            if(lists.equals(line)) count++;
        }
        System.out.println("line "+line+" meets " + count);
    }

    public static List toList (String [] array) {
        List<String> list = Arrays.asList(array);
        return list;
    }
    public static Set<Integer> findUnique(List<Integer> numbers){
        Set<Integer> set = new LinkedHashSet<>(numbers);
        return set;
    }
}
