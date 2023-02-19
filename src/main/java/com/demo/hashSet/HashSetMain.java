package com.demo.hashSet;

import java.util.HashSet;

/**
 * El HashSet no se pueden repetir los valores que se almacenan.
 */
public class HashSetMain {

    public static void main(String[] args) {
        addItems();
    }

    public static void addItems() {
        HashSet<String> cars = new HashSet<String>();
        cars.add("Volvo");
        cars.add("BMW");
        cars.add("Ford");
        cars.add("BMW");
        cars.add("Mazda");
        System.out.println(cars);
    }
}
