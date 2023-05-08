package org.laiszig;

import java.util.List;

public class FP02Functional {
    public static void main(String[] args) {

        List<Integer> numbers = List.of(12, 9, 13, 4, 6, 2, 4, 12, 15);

        int sum = addListFunctional(numbers);
        System.out.println(sum);
    }

    private static int sum(int a, int b) {
        return a + b;
    }

    private static int addListFunctional(List<Integer> numbers) {
        return numbers.stream()
                //Combine them into one result => One Value
                //0 and (a,b) -> a + b
                .reduce(0, FP02Functional::sum);
    }
}