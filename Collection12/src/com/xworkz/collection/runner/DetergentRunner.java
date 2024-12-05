package com.xworkz.collection.runner;

import com.xworkz.collection.dto.DetergentDTO;

import java.util.ArrayList;
import java.util.Collection;

public class DetergentRunner {
    public static void main(String[] args) {
        Collection<DetergentDTO> ref=new ArrayList<DetergentDTO>();
        ref.add(new DetergentDTO("surf excel",55.0,1,10.0,"Amazon"));
        ref.add(new DetergentDTO("tiered",90.0,2,5.00,"flipcart") );
        ref.add(new DetergentDTO("rin",56.0,1,15.00,"Marketing") );
        ref.add(new DetergentDTO("arial",70.0,1,20.0,"BIG Bascket") );
        ref.add(new DetergentDTO("wheel", 60.0, 5, 8.0, "Flipkart") );
        ref.add(new DetergentDTO("ghadi", 50.0, 4, 12.0, "JioMart") );
        ref.add(new DetergentDTO("nirma", 40.0, 3, 7.0, "BigBasket") );
        ref.add(new DetergentDTO("henko", 110.0, 7, 10.0, "Amazon") );
        ref.add(new DetergentDTO("mr. White", 120.0, 5, 18.0, "Flipkart") );
        ref.add(new DetergentDTO("sunlight", 80.0, 6, 9.0, "BigBasket") );

        ref.stream().forEach(ref1-> System.out.println(ref1));
        System.out.println("====================");
        ref.stream().sorted((a,b)->a.getBrand().compareTo(b.getBrand())).forEach(ref2-> System.out.println(ref2));
        System.out.println("============================");
        ref.stream().sorted((a,b)->Integer.compare(b.getQuantity(),a.getQuantity())).forEach(ref3-> System.out.println(ref3));
        System.out.println("=========================");
        ref.stream().filter(a ->a.getPricePerKg()<100).forEach(a-> System.out.println(a));

    }

}
