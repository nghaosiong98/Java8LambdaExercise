package unit2;

import unit1.Student;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.function.Consumer;
import java.util.function.Predicate;

public class StandardFunctionalInterfacesExample {

    public static void main(String[] args) {
        List<Student> students = Arrays.asList(
                new Student("Jonny","English",45),
                new Student("Mohd","Ali",72),
                new Student("Tan", "AhChong", 16),
                new Student("Naruto","Uzumaki",24)
        );

        //Step 1: Sort list by last name
        Collections.sort(students, (s1, s2) -> s1.getLastName().compareTo(s2.getLastName()));

        //Step 2: Create a method that prints all elements in the list
        printConditionally(students, (student)->true, student -> System.out.println(student));


        //Step 3: Create a method that prints all student that have last name beginning with A
        printConditionally(students, student -> student.getLastName().startsWith("A"),student -> System.out.println(student.getFirstName()));
    }

    public static void printConditionally(List<Student> students, Predicate<Student> predicate, Consumer<Student> consumer){
        for(Student student: students){
            if(predicate.test(student))
                consumer.accept(student);
        }
    }
}
