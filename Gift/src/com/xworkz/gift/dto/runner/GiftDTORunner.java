package com.xworkz.gift.dto.runner;

import com.xworkz.gift.dto.GiftDTO;

import java.util.*;
import java.util.stream.Collectors;

public class GiftDTORunner {
    public static void main(String[] args) {
        GiftDTO gift1 = new GiftDTO(1, "Book", 20.0, "Ajay", "Rehan");
        GiftDTO gift2 = new GiftDTO(2, "Watch", 50.0, "Deekshith", "Charan");
        GiftDTO gift3 = new GiftDTO(3, "Pen", 10.0, "Shivu", "Umesh");
        GiftDTO gift4 = new GiftDTO(4, "Laptop", 800.0, "Raj", "Grace");
        GiftDTO gift5 = new GiftDTO(5, "Bag", 40.0, "Tara", "Sachin");
        GiftDTO gift6 = new GiftDTO(6, "Shoes", 60.0, "Veena", "Deekshith");
        GiftDTO gift7 = new GiftDTO(7, "Phone", 700.0, "Sumitra", "Ram");
        GiftDTO gift8 = new GiftDTO(8, "Headphones", 100.0, "Raksha", "Osam");
        GiftDTO gift9 = new GiftDTO(1, "Book", 20.0, "Prema", "Rehan");
        GiftDTO gift10 = new GiftDTO(2, "Watch", 50.0, "Vinayak", "Charan");

       Set<GiftDTO> giftDTOS=new HashSet<GiftDTO>();
       giftDTOS.add(gift1);
       giftDTOS.add(gift2);
       giftDTOS.add(gift3);
       giftDTOS.add(gift4);
       giftDTOS.add(gift5);
       giftDTOS.add(gift6);
       giftDTOS.add(gift7);
       giftDTOS.add(gift8);
       giftDTOS.add(gift9);
       giftDTOS.add(gift10);

        giftDTOS.stream().sorted((a,b)->Double.compare(b.getCost(), a.getCost())).forEach(ref-> System.out.println(ref));
        System.out.println("==========================");
        giftDTOS.stream().sorted((a,b)->a.getName().compareTo(b.getName())).forEach(show-> System.out.println(show));
        System.out.println("==========================");
        giftDTOS.stream().forEach(ref-> System.out.println(ref.getId()));
        giftDTOS.stream().forEach(ref-> System.out.println(ref.getId()));
        giftDTOS.stream().forEach(ref-> System.out.println(ref.getId()));
        System.out.println("==========================");
        giftDTOS.stream().sorted((a,b)->a.getFrom().compareTo(b.getFrom())).forEach(display -> System.out.println(display.getFrom()));
    }
}
