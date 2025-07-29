package org.example;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class PhoneBook {
    private static Map <String, List<String>> pb;

    public PhoneBook (){
         pb = new HashMap<>();
    }

    public static void add (String lastname, String number) {
        pb.computeIfAbsent(lastname, k -> new ArrayList<>()).add(number);
    }

    public List <String> get(String lastname) {
        return pb.getOrDefault(lastname, new ArrayList<>());

    }
    @Override
    public String toString() {
        return pb.toString();
    }

}
