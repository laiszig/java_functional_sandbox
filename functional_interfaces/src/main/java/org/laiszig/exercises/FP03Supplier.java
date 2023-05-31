package org.laiszig.exercises;

import java.util.function.Supplier;

public class FP03Supplier {

    //no input > return something

    public static void main(String[] args) {

    Supplier<Integer> randomIntegerSupplier = () -> 2; //empty parameter

        System.out.println(randomIntegerSupplier.get());
    }
}
