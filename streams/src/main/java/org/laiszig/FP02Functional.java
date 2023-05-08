package org.laiszig;

import java.util.List;

public class FP02Functional {
    public static void main(String[] args) {

        List<Integer> numbers = List.of(12, 9, 13, 4, 6, 2, 4, 12, 15);
        List<String> courses = List.of("Spring", "Spring Boot", "API", "Microservices", "AWS", "PCF", "Docker", "Kubernetes");

        int sum = addListFunctional(numbers);
        System.out.println(sum);
        System.out.println("--------");
        numbers.stream().reduce(Integer.MIN_VALUE, (x,y) -> x>y ? x:y);

        printDistinct(numbers);
        System.out.println("--------");
        sortNumbers(numbers);
        System.out.println("--------");
        sortCourses(courses);

    }

    private static int sum(int aggregate, int nextNumber) {
        System.out.println(aggregate + " " + nextNumber);
        return aggregate + nextNumber;
    }



//    0 12
//    12 9
//    21 13
//    34 4
//    38 6
//    44 2
//    46 4
//    50 12
//    62 15
//    77

    private static int addListFunctional(List<Integer> numbers) {
        return numbers.stream()
                //Combine them into one result => One Value
                //0 and (a,b) -> a + b
//                .reduce(0, FP02Functional::sum);
//                .reduce(0, (x,y) -> x+y);
                .reduce(0, Integer::sum);
    }

    private static void printDistinct (List<Integer> numbers) {
        numbers.stream()
                .distinct()
                .forEach(System.out::println);
    }

    private static void sortNumbers (List<Integer> numbers) {
        numbers.stream()
                .sorted()
                .forEach(System.out::println);
    }

    private static void sortCourses (List<String> courses) {
        courses.stream()
                .sorted()
                .forEach(System.out::println);
    }
}