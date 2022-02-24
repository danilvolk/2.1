package com.company;
import java.util.*;

public class Main {

    public static void main(String[] args) {
        List<Integer> intList = Arrays.asList(1, 2, 5, 16, -1, -2, 0, 32, 3, 5, 8, 23, 4);
        List<Integer> newIntList = new ArrayList<>();
        for (Integer num : intList) {
            if (num >0 && num % 2 ==0){
                newIntList.add(num);
            }
        }
        System.out.println("Без стримов");
        Collections.sort(newIntList);
        for (Integer num : newIntList) {
           System.out.print(num);
        }
        System.out.println("\n" + "С помощью стримов");
        StreamMain.main();
    }
}
