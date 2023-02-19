package com.demo.arrayList;

import java.util.ArrayList;
import java.util.Collections;

public class ArraysMain {

    public static void main(String args []) {
        sortArray();
    }

    public static void test() {
        ArrayList<String> arrays = new ArrayList<>();

        arrays.add("Volvo");
        arrays.add("BMW");
        arrays.add("Hyundai");


        //List all items
        System.out.println(arrays);

        //Update item
        arrays.set(0, "Volkswagen");

        System.out.println(arrays.get(0));
        System.out.println(arrays);

        //Listar items
        for (String item: arrays) {
            System.out.println("Item " + item);
        }
    }

    public static void sortArray() {
        ArrayList<String> cars = new ArrayList<String>();
        cars.add("Volvo");
        cars.add("BMW");
        cars.add("Ford");
        cars.add("Mazda");
        Collections.sort(cars);  // Sort cars
        for (String i : cars) {
            System.out.println(i);
        }
    }
}
