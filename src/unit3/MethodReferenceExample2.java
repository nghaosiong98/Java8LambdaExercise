package unit3;

import unit1.Student;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.function.Consumer;
import java.util.function.Predicate;

public class MethodReferenceExample2 {

    public static void main(String[] args) {
        List<Student> students = Arrays.asList(
                new Student("Jonny","English",45),
                new Student("Mohd","Ali",72),
                new Student("Tan", "AhChong", 16),
                new Student("Naruto","Uzumaki",24)
        );

        System.out.println("Print all students");
        printConditionally(students, (student)->true, System.out::println); //student -> method(student)

        }

    public static void printConditionally(List<Student> students, Predicate<Student> predicate, Consumer<Student> consumer){
        for(Student student: students){
            if(predicate.test(student))
                consumer.accept(student);
        }
    }
}
