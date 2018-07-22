package unit3;

import unit1.Student;

import java.util.Arrays;
import java.util.List;

public class StreamsExample1 {

    public static void main(String[] args) {
        List<Student> students = Arrays.asList(
                new Student("Jonny","English",45),
                new Student("Mohd","Ali",72),
                new Student("Tan", "AhChong", 16),
                new Student("Naruto","Uzumaki",24)
        );

        students.stream()
                .filter(student -> student.getLastName().startsWith("A")) //Filter operation
                .forEach(student -> System.out.println(student.getFirstName())); //End condition

        long count = students.parallelStream()
                .filter(student -> student.getLastName().startsWith("A"))
                .count();

        System.out.println(count);
    }
}
