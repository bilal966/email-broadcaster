package com.java8.practices;

import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.function.Predicate;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class FirstRide {
    public static void main(String[] args) {
        Predicate<Integer> predicate = (i)-> (i%2==0);
        System.out.println(predicate.test(0));
        System.out.println(predicate.test(1));
        System.out.println(predicate.test(2));
        System.out.println(predicate.test(3));

        List<String> names = Arrays.asList("Andy","Bod","zandy","Twillio","Bod");
        System.out.println("Printing List of Names:");
        System.out.println(names);

        System.out.println("Printing Stream of Names:");
        List<String> streamName = names.stream().map(y -> y+"=").collect(Collectors.toList());
        System.out.println(streamName.toString());

        System.out.println("Printing Stream of Names Length:");
        List<Integer> streamNameLength = names.stream().map(y -> y.length()).collect(Collectors.toList());
        System.out.println(streamNameLength);

/*
        Collections.sort(names, new Comparator<String>() {
            @Override
            public int compare(String o1, String o2) {
                System.out.println("Comparing: "+o1+" and "+o2);
                return o1.compareTo(o2);
            }
        });
*/
        Collections.sort(names,(a,b)-> {
            System.out.println("Comparing: "+a+" and "+b);
            return a.compareTo(b);
        });
        //Collections.sort(names);

        System.out.println(names);

        System.out.println("Printing List Int Stream:");
        List<Integer> numbers = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8);
        List<Integer> twoEvenSquares =
                numbers.stream()
                        .filter(n -> {
                            System.out.println("filtering " + n);
                            return n % 2 == 0;
                        })
                        .map(n -> {
                            System.out.println("mapping " + n);
                            return n * n;
                        })
                        .limit(3)
                        .collect(Collectors.toList());
        System.out.println(twoEvenSquares.toString());
    }
}
