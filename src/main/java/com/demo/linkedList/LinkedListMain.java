package com.demo.linkedList;

import java.util.LinkedList;

/**
 * LinkedList almacena los datos en contenedores que se relacionan uno con el otro es mas optimo para recuperar datos mientras
 * que ArrayList es mas optimo para almacenar datos.
 */
public class LinkedListMain {

    public static void main(String[] args) {
        useLinkedList();
    }

    public static void useLinkedList() {
        LinkedList<String> cars = new LinkedList<>();
        cars.add("Volvo");
        cars.add("BMW");
        cars.add("Ford");
        cars.add("Mazda");
        System.out.println(cars);
    }
}
