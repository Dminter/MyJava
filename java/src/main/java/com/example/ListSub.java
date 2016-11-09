package com.example;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by dminter on 2016/11/9.
 */

public class ListSub {
    public static void main(String[] args) {

        List<String> list1 = new ArrayList<>();
        list1.add("1");
        list1.add("112");
        list1.add("133");
        list1.add("1444");

        List<String> list2 = new ArrayList<>();

        list2 = list1.subList(0, 3);


        System.out.println("list2:" + list2);
    }
}
