package com.java8.practices;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class ExampleMapStream {
    public static void main(String[] args) {
        Map<String,String> requestHeader = new HashMap<>();
        //TODO
        requestHeader.put("Operation","NetworkAccessProfile");
        requestHeader.put("Action","EquipmentPairing");
        requestHeader.put("ApplicationID","Rogers.com");
        requestHeader.put("TransactionID","foedere certo");
        requestHeader.put("Timestamp","2002-06-24T11:46:32-04:00");
        requestHeader.put("Franchise","ROGERS");

        String body = requestHeader.entrySet()
                .stream()
                .map(x -> String.join("=", x.getKey(), x.getValue()))
                .collect(Collectors.joining("&"));
        System.out.println(body);
        requestHeader.entrySet().parallelStream().forEach(y->{
            System.out.println(String.join("=",y.getKey(),y.getValue()));
        });
        requestHeader.entrySet().stream().forEachOrdered(x->{
            System.out.println(String.join("=",x.getKey(),x.getValue()));
        });

        Map<String,String> hashing = new HashMap<>();
        hashing.put("name","smith");
        hashing.put("name","smith");
        hashing.put("name","smith");
        System.out.print(hashing.toString());
        hashing.keySet().parallelStream().forEach(key->{
            System.out.println();
        });


    }
}
