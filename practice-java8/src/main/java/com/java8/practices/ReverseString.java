package com.java8.practices;


public class ReverseString {
    public static void main(String[] args) {
        ReverseString reverse = new ReverseString();
        /**
         *Input: I love Java8
         *Output:I evol 8avaJ
         *Input is character array (not string) and output should also be character array.
         * Function needs to work in-place, modify the input array itself.
         * Don't use any extra arrays, string objects or language provider libraries. Use of temporary variables is allowed.
         * Input: char[] input = ['I', ' ', 'l','o','v','e',' ','J','a','v','a','8'];
         * Output: ['I', ' ', 'e','v','o','l',' ','8','a','v','a','j'];
         * */
        char[] inputArray = {'I', ' ', 'l','o','v','e',' ','j','a','v','a','8'};
        System.out.println(new String(inputArray));
        System.out.println(new String(reverse.reverseSentence(inputArray)));

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

        String input = "smith";

        // getBytes() method to convert string
        // into bytes[].
        byte [] strAsByteArray = input.getBytes();

        byte [] result =
                new byte [strAsByteArray.length];

        // Store result in reverse order into the
        // result byte[]
        for (int i = 0; i<strAsByteArray.length; i++)
            result[i] = strAsByteArray[strAsByteArray.length-i-1];

        System.out.println("Reverse String:"+new String(result));

    }

    private char[] reverseSentence(char[] inputArray){
        for(int x=0;x<inputArray.length;x++){
            if(inputArray[x]==' '){
                int nextSpace = this.foundNextSpace(inputArray,x+1)-1;
                for(x=x+1;x<nextSpace;x++,nextSpace--){
                    char tmp = inputArray[x];
                    inputArray[x] = inputArray[nextSpace];
                    inputArray[nextSpace] = tmp;
                }
            }
        }
        return inputArray;
    }
    private int foundNextSpace(char[] inputArray,int currentIndex){
        for(int x=currentIndex; x< inputArray.length;x++){
            if(inputArray[x]==' '){
                return x;
            }
        }
        return inputArray.length;
    }

    private char[] reverseString(char[] inputArray){
        for(int x=0,y=inputArray.length-1;x<inputArray.length/2;x++,y--){
            char tmp = inputArray[x];
            inputArray[x] = inputArray[y];
            inputArray[y] = tmp;
        }
        return inputArray;
    }
}
