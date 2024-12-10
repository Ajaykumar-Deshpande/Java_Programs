package com.xworkz.gift.dto;

import java.util.Objects;

public class GiftDTO {
    private int id;
    private String name;
    private double cost;
    private String from;
    private String to;

    public GiftDTO(int id, String name, double cost, String from, String to) {
        this.id = id;
        this.name = name;
        this.cost = cost;
        this.from = from;
        this.to = to;
    }

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public double getCost() {
        return cost;
    }

    public String getFrom() {
        return from;
    }

    public String getTo() {
        return to;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (obj == null || getClass() != obj.getClass()) return false;
        GiftDTO giftDTO = (GiftDTO) obj;
        return id == giftDTO.id && Double.compare(giftDTO.cost, cost) == 0 &&
                Objects.equals(name, giftDTO.name) && Objects.equals(from, giftDTO.from) &&
                Objects.equals(to, giftDTO.to);

    }
    @Override
    public String toString() {
        return "GiftDTO{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", cost=" + cost +
                ", from='" + from + '\'' +
                ", to='" + to + '\'' +
                '}';
    }
}
