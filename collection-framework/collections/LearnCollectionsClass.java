// Collections class is a utility class in java.util package which consists of only static methods that operate on or return collections.
package collections;

import java.util.List;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

public class LearnCollectionsClass {
    public static void main(String[] args) {
        List<Integer> numbers = new ArrayList<>();
        numbers.add(9);
        numbers.add(1);
        numbers.add(2);
        numbers.add(3);
        numbers.add(3);
        numbers.add(3);
        numbers.add(4);
        numbers.add(5);

        // Find the minimum element in the array list
        System.out.println("Minimum element in the list is "+ Collections.min(numbers));
        // Find the maximum element in the array list
        System.out.println("Maximum element in the list is "+ Collections.max(numbers));
        //Find the frequency of an element in the list
        System.out.println("Frequency of 3 in the list is "+ Collections.frequency(numbers, 3));
        
        // Sort the list
        Collections.sort(numbers);
        System.out.println(numbers);

        // Sort the list in reverse order wrt natural ordering
        Collections.sort(numbers, Comparator.reverseOrder());
        System.out.println(numbers);
    
        // Sort Custom Objects using Comparable imterface
        List<Student> students = new ArrayList<>();

        students.add(new Student("Sandeep", 23));
        students.add(new Student("Tejas", 11));
        students.add(new Student("Prasant", 30));
        students.add(new Student("Ravi", 44));

        Collections.sort(students);
        System.out.println(students);

        // Sort Custom Objects using Comparator interface
        Collections.sort(students, new Comparator<Student>() {
            @Override
            public int compare(Student s1, Student s2) {
                return s1.getName().compareTo(s2.getName());
            }
        });
        System.out.println(students);
    
    
    
    }
}
