package com.myprojecttask.lambda.sorting;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class NumberList {
    public static void main(String[] args) {
        List<Integer> list = new ArrayList<>();
        list.add(51);
        list.add(413);
        list.add(1404);
        list.add(22);

        System.out.println(list);
        Collections.sort(list);
        System.out.println(list);

        Collections.sort(list, new MyComparator());
        System.out.println(list);


        // with lambda


    }
}
