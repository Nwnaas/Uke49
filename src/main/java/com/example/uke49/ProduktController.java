package com.example.uke49;
import java.util.ArrayList;
import java.util.List;

public class ProduktController {
    private static List<Produkt> produkter = new ArrayList<>();

    public static void addProduct(String name, double price) {
        Produkt produkt = new Produkt(name, price);
        produkter.add(produkt);
    }

    public static List<Produkt> getProducts() {
        return produkter;
    }
}
