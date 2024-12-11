package com.xworkz.ajay;

import java.util.HashMap;
import java.util.Map;

public class Person {
    public static void main(String[] args) {
        Map<String, String> phoneNo= new HashMap<>();

        // Adding 10 entries
        phoneNo.put("Ajay", "8310447174");
        phoneNo.put("Akshay", "7406509584");
        phoneNo.put("Sachin", "9972471697");
        phoneNo.put("Rahul", "9972697271");
        phoneNo.put("Charan", "9663676891");
        phoneNo.put("Chetan", "9035113801");
        phoneNo.put("Amoga", "2589764893");
        phoneNo.put("Parshu", "9972459864");
        phoneNo.put("Osam", "9947863548");
        phoneNo.put("Raksha", "83310445684");

        System.out.println("Contains key 'Ajay'? " + phoneNo.containsKey("Ajay"));

        System.out.println("==============================");

        System.out.println("Contains value '7406509584'? " + phoneNo.containsValue("8310447174"));

        System.out.println("==============================");


        phoneNo.forEach((k,v)-> System.out.println(k+ ":"+v));

        System.out.println("==============================");


        System.out.println("Get phone number of 'Ajay': " + phoneNo.get("Ajay"));

        System.out.println("==============================");


        System.out.println("Get phone number of 'Akshay' (default if not found): " + phoneNo.getOrDefault("Akshay","N/A"));

        System.out.println("==============================");


        Map<String, String> anotherMap = new HashMap<>();
        anotherMap.put("Charan", "9663676891");
        anotherMap.put("Parshu", "9972459864");
        System.out.println("Maps are equal? " + phoneNo.equals(anotherMap));

        System.out.println("==============================");

        System.out.println("HashCode of the map: " + phoneNo.hashCode());

        System.out.println("==============================");

        System.out.println("Is the map empty? " + phoneNo.isEmpty());

        System.out.println("==============================");

        System.out.println("Key Set:");
        phoneNo.keySet().forEach(key-> System.out.println(key));

        System.out.println("==============================");

        phoneNo.put("Osam", "9947863548");
        System.out.println("Phone number of 'Osam': " + phoneNo.get("Osam"));

        System.out.println("==============================");

        phoneNo.putIfAbsent("Rahul", "9972697271");
        System.out.println("Rahaul's phone number (putIfAbsent): " + phoneNo.get("Rahul"));

        System.out.println("==============================");

        phoneNo.remove("Ajay");
        System.out.println("Ajay's phone number after removal: " + phoneNo.get("Ajay"));

        System.out.println("==============================");

        phoneNo.remove("Sachin", "9972471697");
        System.out.println("Sachin's phone number after conditional removal: " + phoneNo.get("Sachin"));

        System.out.println("==============================");

        phoneNo.put("Ajay", "8310447174");
        phoneNo.replace("Ajay", "1234567891");
        System.out.println("Ajay's phone number after replacement: " + phoneNo.get("Ajay"));

        System.out.println("==============================");

        phoneNo.replace("Ajay", "1234567891", "9876543219");
        System.out.println("Ajay's phone number after conditional replacement: " + phoneNo.get("Ajay"));

        System.out.println("==============================");

        phoneNo.replaceAll((key, value) -> value + "-New");
        System.out.println("Phonebook after replaceAll:");
        phoneNo.forEach((key, value) -> System.out.println(key + ": " + value));

        System.out.println("==============================");

        System.out.println("Size of the phone_numbers: " + phoneNo.size());

        System.out.println("==============================");

        System.out.println("All phone numbers:");
        phoneNo.values().forEach(System.out::println);

        System.out.println("==============================");

        phoneNo.computeIfAbsent("Raksha", key->"83310445684");
        System.out.println("Raksha's phone number (after computeIfAbsent): " + phoneNo.get("Raksha"));

        System.out.println("==============================");

        phoneNo.computeIfPresent("Akshay", (key, value) -> value + "-Updated");
        System.out.println("Akshay's phone number (after computeIfPresent): " + phoneNo.get("Akshay"));

        System.out.println("==============================");

        System.out.println("Entry Set:");
        phoneNo.entrySet().forEach(entry -> System.out.println(entry.getKey() + ": " + entry.getValue()));

        Map<String, String> newEntries = new HashMap<>();
        newEntries.put("Arjun", "83155555555");
        newEntries.put("Om", "9999999999");
        phoneNo.putAll(newEntries);
        System.out.println("Arjun's phone number: " + phoneNo.get("Arjun"));

        System.out.println("==============================");

        phoneNo.putIfAbsent("Chetan", "88889997774");
        System.out.println("Chetan's phone number (putIfAbsent): " + phoneNo.get("Chetan"));




    }
}
