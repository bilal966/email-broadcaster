package com.java8.practices;

import javafx.util.converter.DateTimeStringConverter;

import java.util.HashSet;
import java.util.Set;

public class RepeatElement
{
    void printRepeating(int arr[], int size)
    {
        int count[] = new int[size];
        int i;

        System.out.println("Repeated elements are : ");
        for (i = 0; i < size; i++)
        {
            if (count[arr[i]] == 1)
                System.out.print(arr[i] + " ");
            else
                count[arr[i]]++;
        }
    }

    void printRepeatingHashSet(int arr[], int size)
    {
        int count[] = new int[size];
        Set<Integer> repeating = new HashSet<Integer>();
        int i;

        System.out.println("Repeated elements are : ");
        for (i = 0; i < size; i++)
        {
            try{
                if(!repeating.add(arr[i])){
                    System.out.print(arr[i] + " ");
                }
            }catch (Exception e){
                e.printStackTrace();
            }

        }
    }

    @Override
    public int hashCode() {
        return 1;
    }

    String reverse = "";
    public String reverseString(String str){

        if(str.length() == 1){
            return str;
        } else {
            reverse += str.charAt(str.length()-1)
                    +reverseString(str.substring(0,str.length()-1));
            return reverse;
        }
    }

    public static void main(String[] args)
    {
        RepeatElement repeat = new RepeatElement();
        RepeatElement repeat1 = new RepeatElement();
        System.out.println(repeat.hashCode());
        System.out.println(repeat1.hashCode());

        int arr[] = {4, 2, 4, 5, 2, 3, 1};
        int arr_size = arr.length;
        //repeat.printRepeating(arr, arr_size);
        repeat.printRepeatingHashSet(arr, arr_size);

        System.out.println("Result: "+repeat.reverseString("Java2novice"));
    }
}
