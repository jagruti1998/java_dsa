package lowes;


import java.util.*;

public class StudentSorter {
    public static void main(String[] args) {
        // Create a list of students
        List<Student> students = new ArrayList<>();
        students.add(new Student(3, "Alice", 3.5));
        students.add(new Student(1, "Bob", 3.8));
        students.add(new Student(2, "Charlie", 3.2));

        // Sort the list of students by ID (ascending order)
        Collections.sort(students, Comparator.comparingInt(Student::getId));

        // Save the sorted students into a HashMap
        Map<Integer, Student> studentMap = new HashMap<>();
        for (Student student : students) {
            studentMap.put(student.getId(), student);
        }

        // Print the HashMap
        for (Map.Entry<Integer, Student> entry : studentMap.entrySet()) {
            System.out.println("Key: " + entry.getKey() + ", Value: " + entry.getValue());
        }
    }
}
