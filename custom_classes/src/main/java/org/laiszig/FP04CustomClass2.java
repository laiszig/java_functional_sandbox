package org.laiszig;

import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class FP04CustomClass2 {

    public static void main(String[] args) {

    List<Course> courses2 = List.of(
            new Course("Spring", "Framework", 98, 20000),
            new Course("Spring Boot", "Framework", 95, 18000),
            new Course("API", "Microservices", 97, 22000),
            new Course("Microservices", "Microservices", 96, 25000),
            new Course("Fullstack", "Fullstack", 91, 14000),
            new Course("AWS", "Cloud", 92, 21000),
            new Course("Azure", "Cloud", 99, 21000),
            new Course("Docker", "DevOps", 92, 20000),
            new Course("Kubernetes", "DevOps", 91, 20000)
    );
        //using comparingInt is more effective because there is no boxing and auto-boxing
        Comparator<Course> comparingByNoOfStudentsIncreasing = Comparator.comparingInt(Course::getNoOfStudents);
        Comparator<Course> comparingByNoOfStudentsDecreasing = Comparator.comparingInt(Course::getNoOfStudents).reversed();
        Comparator<Course> comparingByNoOfStudentsAndReviewScore =
                Comparator.comparingInt(Course::getNoOfStudents)
                .thenComparingInt(Course::getReviewScore);

        System.out.println(courses2.stream()
                .sorted(comparingByNoOfStudentsIncreasing)
                .collect(Collectors.toList()));

        System.out.println(courses2.stream()
                .sorted(comparingByNoOfStudentsDecreasing)
                .collect(Collectors.toList()));

        System.out.println(courses2.stream()
                .sorted(comparingByNoOfStudentsAndReviewScore)
                .collect(Collectors.toList()));
    }

}
