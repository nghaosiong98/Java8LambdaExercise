package unit3;

import unit1.Student;

import java.util.Arrays;
import java.util.List;

public class CollectionIterationExample {

    public static void main(String[] args) {
        List<Student> students = Arrays.asList(
                new Student("Jonny","English",45),
                new Student("Mohd","Ali",72),
                new Student("Tan", "AhChong", 16),
                new Student("Naruto","Uzumaki",24)
        );

        System.out.println("Using Lambda forEach loop");
        students.forEach((student)-> System.out.println(student));
        students.forEach(System.out::println);
    }
}
