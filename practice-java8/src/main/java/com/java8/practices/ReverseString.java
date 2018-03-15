package com.java8.practices;


public class ReverseString {
    public static void main(String[] args) {

        String name = "smith";
        System.out.println("Plain String:"+name);
        char[] charArray = name.toCharArray();

        System.out.println("Char Array Size :"+charArray.length);
        char[] reversArray = new char[charArray.length];
        for(int i=charArray.length-1; i>= 0; i--){
            reversArray[i] = new Character(charArray[i]);
            System.out.println(reversArray[i]);
        }
        System.out.println("Reverse String:"+new String(reversArray));
        for(Character c:reversArray){
            System.out.println(c.charValue());
        }



    }
}
