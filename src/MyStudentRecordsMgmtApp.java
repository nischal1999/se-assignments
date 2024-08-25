import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class MyStudentRecordsMgmtApp {

    public static void main(String[] args) {
        Student[] students = {
                new Student("110001", "Dave", LocalDate.of(1951, 11, 18)),
                new Student("110002", "Anna", LocalDate.of(1990, 12, 7)),
                new Student("110003", "Erica", LocalDate.of(1974, 1, 31)),
                new Student("110004", "Carlos", LocalDate.of(2009, 8, 22)),
                new Student("110005", "Bob", LocalDate.of(1990, 3, 5))
        };

        printListOfStudents(students);
        List<Student> platinumAlumni = getListOfPlatinumAlumniStudents(students);
        platinumAlumni.forEach(System.out::println);
    }

    public static void printListOfStudents(Student[] students) {
        Arrays.sort(students, (s1, s2) -> s1.getName().compareTo(s2.getName()));
        for (Student s : students) {
            System.out.println(s);
        }
    }

    public static List<Student> getListOfPlatinumAlumniStudents(Student[] students) {
        List<Student> platinumAlumni = new ArrayList<>();
        for (Student s : students) {
            if (s.getDateOfAdmission().isBefore(LocalDate.now().minusYears(30))) {
                platinumAlumni.add(s);
            }
        }
        platinumAlumni.sort((s1, s2) -> s2.getDateOfAdmission().compareTo(s1.getDateOfAdmission()));
        return platinumAlumni;
    }

    // Additional Methods

    public static void printHelloWorld(int[] numbers) {
        for (int number : numbers) {
            if (number % 5 == 0 && number % 7 == 0) {
                System.out.println("HelloWorld");
            } else if (number % 5 == 0) {
                System.out.println("Hello");
            } else if (number % 7 == 0) {
                System.out.println("World");
            }
        }
    }

    public static int findSecondBiggest(int[] numbers) {
        int largest = Integer.MIN_VALUE;
        int secondLargest = Integer.MIN_VALUE;
        for (int number : numbers) {
            if (number > largest) {
                secondLargest = largest;
                largest = number;
            } else if (number > secondLargest && number < largest) {
                secondLargest = number;
            }
        }
        return secondLargest;
    }
}
