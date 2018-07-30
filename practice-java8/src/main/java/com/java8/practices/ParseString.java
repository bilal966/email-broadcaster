package com.java8.practices;

import java.lang.reflect.Array;
import java.util.LinkedList;

public class ParseString {

    public static void main(String[] args) {
        String name ="smith";
        char[] input = name.toCharArray();
        System.out.println(new String(input));
        for(int x=0,y=input.length-1;x<y;x++,y--){
           char tmp = input[x];
           input[x] = input[y];
           input[y] = tmp;
        }

        System.out.println(new String(input));

    }
}
