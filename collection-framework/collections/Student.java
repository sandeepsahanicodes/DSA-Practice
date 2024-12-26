package collections;

import java.util.Objects;

public class Student implements Comparable<Student> {
    private String name;
    private int roll;
    
    public Student(String name, int roll) {
        this.name = name;
        this.roll = roll;
    }

    public String getName() {
        return name;
    }

    public int getRoll() {
        return roll;
    }

    @Override 
    public String toString() {
        return "Student{" +
                "name='" + name + '\'' +
                ", roll=" + roll +
                '}';
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        Student student = (Student) obj;
        return roll == student.roll;
    }

    @Override
    public int hashCode() {
        return Objects.hash(roll);
    }

    // Implementing the compareTo method to sort the students based on their roll numbers
    @Override
    public int compareTo(Student that) {
        return this.roll - that.roll;
    }

}
