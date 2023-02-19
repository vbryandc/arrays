package com.demo.iterator;

import java.util.ArrayList;
import java.util.Iterator;

public class IteratorMain {

    public static void main(String[] args) {
        getItems();
    }

    public static void addItems() {
        // Make a collection
        ArrayList<String> cars = new ArrayList<String>();
        cars.add("Volvo");
        cars.add("BMW");
        cars.add("Ford");
        cars.add("Mazda");

        // Get the iterator
        Iterator<String> it = cars.iterator();

        // Print the first item
        System.out.println(it.next());
    }


    public static void getItems() {
        // Make a collection
        ArrayList<String> cars = new ArrayList<String>();
        cars.add("Volvo");
        cars.add("BMW");
        cars.add("Ford");
        cars.add("Mazda");

        // Get the iterator
        Iterator<String> it = cars.iterator();

        while (it.hasNext()) {
            System.out.println(it.next());
        }
    }
}
