package com.xworkz.collection.dto;

public class DetergentDTO  {


        private String brand;
        private double pricePerKg;
        private int quantity;
        private double discount;
        private String soldBy;

        public DetergentDTO(){
            System.out.println("no-args constructor");
        }

        public DetergentDTO(String brand, double pricePerKg, int quantity, double discount, String soldBy) {
            this.brand = brand;
            this.pricePerKg = pricePerKg;
            this.quantity = quantity;
            this.discount = discount;
            this.soldBy = soldBy;
        }

        public String getBrand() {
            return brand;
        }

        public double getPricePerKg() {
            return pricePerKg;
        }

        public int getQuantity() {
            return quantity;
        }

        public double getDiscount() {
            return discount;
        }

        public String getSoldBy() {
            return soldBy;
        }

        @Override
        public String toString() {
            return "DetergentDTO{" +
                    "brand='" + brand + '\'' +
                    ", pricePerKg=" + pricePerKg +
                    ", quantity=" + quantity +
                    ", discount=" + discount +
                    ", soldBy='" + soldBy + '\'' + '}';
}
    }


