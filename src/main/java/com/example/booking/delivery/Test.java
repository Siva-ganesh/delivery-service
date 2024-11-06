package com.example.booking.delivery;

import java.util.Arrays;
import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Test {

    public static void main(String[] args) {

//        List<String> list1 = Arrays.asList("Hello", "world", "welcome to java");
//        List<Integer> list = list1.stream()
//                .map(str -> (str.split(" ")).length)
//                .toList();
//        System.out.println(list);

        Integer[] a = {1, 2, 3};
        Integer[] b = {2, 3, 4};

        // 1,2,3,4
        Set<Integer> collect = Stream.of(a)
                .collect(Collectors.toSet());
        collect.addAll(Stream.of(b)
                .collect(Collectors.toSet()));
        System.out.println(collect);




    }
}
