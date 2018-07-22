package unit1;

import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class Unit1ExerciseSolutionJava7 {

    public static void main(String[] args) {
        List<Student> students = Arrays.asList(
                new Student("Jonny","English",45),
                new Student("Mohd","Ali",72),
                new Student("Tan", "AhChong", 16),
                new Student("Naruto","Uzumaki",24)
        );

        //Step 1: Sort list by last name
        Collections.sort(students, new Comparator<Student>() {
            @Override
            public int compare(Student o1, Student o2) {
                return o1.getLastName().compareTo(o2.getLastName());
            }
        });

        //Step 2: Create a method that prints all elements in the list
        printAll(students);


        //Step 3: Create a method that prints all student that have last name beginning with A
        printConditionally(students, new Condition() {

            @Override
            public boolean test(Student student) {
                return student.getLastName().startsWith("A");
            }
        });
    }

    public static void printConditionally(List<Student> students, Condition condition){
        for(Student student: students){
            if(condition.test(student))
                System.out.println(student);
        }
    }

    public static void printAll(List<Student> students){
        for(Student student: students){
            System.out.println(student);
        }
    }

//    public static void printFiltered(List<Student> students){
//        for(Student student: students){
//            if(student.getLastName().startsWith("A"))
//                System.out.println(student);
//        }
//    }

}

interface Condition{
    boolean test(Student student);
}

