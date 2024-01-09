package _11;

import java.util.Comparator;

public class SortingStudentsByGPA implements Comparator<NewStudent> {
    @Override
    public int compare(NewStudent student1, NewStudent student2) {
        return Double.compare(student2.getGPA(), student1.getGPA());
    }

    // Быстрая сортировка
    public static void quickSort(NewStudent[] students, int low, int high) {
        if (low < high) {
            int pivotIndex = partition(students, low, high);

            quickSort(students, low, pivotIndex - 1);
            quickSort(students, pivotIndex + 1, high);
        }
    }

    private static int partition(NewStudent[] students, int low, int high) {
        double pivot = students[high].getGPA();
        int i = (low - 1);

        for (int j = low; j < high; j++) {
            if (students[j].getGPA() > pivot) {
                i++;

                NewStudent temp = students[i];
                students[i] = students[j];
                students[j] = temp;
            }
        }

        NewStudent temp = students[i + 1];
        students[i + 1] = students[high];
        students[high] = temp;

        return (i + 1);
    }

    // Пример использования
    public static void main(String[] args) {
        NewStudent[] students = {
                new NewStudent("John", 3.7),
                new NewStudent("Alice", 3.9),
                new NewStudent("Bob", 3.5)
        };

        quickSort(students, 0, students.length - 1);

        for (NewStudent student : students) {
            System.out.println(student.getName() + " - " + student.getGPA());
        }
    }
}