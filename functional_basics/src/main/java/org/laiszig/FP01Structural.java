package org.laiszig;

import java.util.List;

public class FP01Structural {

    public static void main(String[] args) {

        printAllNumbersInListStructure(List.of(12, 9, 13, 4, 6, 2, 4, 12, 15));
    }

    private static void printAllNumbersInListStructure(List<Integer> numbers) {

        //How to loop the numbers
        for(int number:numbers) {
            System.out.println(number);
        }
    }
}
