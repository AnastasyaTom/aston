package org.example;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class PhoneBook {
    public static HashMap<String, String> pb = new HashMap<>();


    public static void addPB(String number, String lastname) {
        pb.put(number, lastname);
    }

    public static void getPB(String lastname, String number) {

        List<String> result = new ArrayList<String>();

        for (Map.Entry entry : pb.entrySet()) {
            if (lastname.equalsIgnoreCase((String)entry.getValue())){
                result.add((String)entry.getKey());
            }
            System.out.println(result);
        }

    }

}
