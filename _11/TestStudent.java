package _11;

import java.util.Arrays;

public class TestStudent {
    public static void main(String[] args) {
        Student[] students = {
                new Student("John", 123),
                new Student("Alice", 456),
                new Student("Bob", 789),
                new Student("Eve", 234)
        };

        System.out.println("Before sorting: " + Arrays.toString(students));

        insertionSortByIDNumber(students);

        System.out.println("After sorting: " + Arrays.toString(students));
    }

    public static void insertionSortByIDNumber(Student[] students) {
        for (int i = 1; i < students.length; i++) {
            Student currentStudent = students[i];
            int j = i - 1;
            while (j >= 0 && students[j].getIDNumber() > currentStudent.getIDNumber()) {
                students[j + 1] = students[j];
                j--;
            }
            students[j + 1] = currentStudent;
        }
    }
}
