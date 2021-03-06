package sk.stuba.fei.uim.oop;

import java.util.Arrays;
import java.util.Collections;
import java.util.Scanner;

public class Main {
    public static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        Student[] students = createStudentsArray(5);
        sortStudentsByName(students);
        showAllStudentsInfo(students);

    }

    public static void showAllStudentsInfo(final Student[] studentsToShow) {
        for (Student student : studentsToShow) {
            student.showStudentInfo();
        }
    }

    public static void showAllStudentsAge(final Student[] studentsToShow) {
        for (Student student : studentsToShow) {
            System.out.println(student.getAge());
        }
    }

    public static void testStudentClass() {
        Student student = new Student("Thomas", "Newman", 21);
        student.showStudentInfo();

        Student student1 = new Student();
        student1.showStudentInfo();
    }

    public static Student[] createStudentsArray(final int numberOfStudents) {
        final String[] studentNames = new String[] {"Antony", "Joshua", "Fero", "Andreu", "Johny", "Mortar"};
        final String[] surNames = new String[] {"Newman", "Oldman", "Getter", "Setter", "Mony", "Fielder"};
        Student[] students = new Student[numberOfStudents];

        for (int i = 0; i < numberOfStudents; i++) {
            students[i] = new Student(studentNames[i], surNames[i], (int)(Math.random()*100));
        }
        return students;
    }

    public static void sortStudentsByName(Student[] arrayToSort) {
        final byte TOP_DOWN = 1;
        final byte DOWN_TOP = 2;
        final boolean TURN_OFF = false;
        boolean getChoice = true;
        while (getChoice) {
            System.out.print("Press 1 to Top-Down Sort, " +
                             "Press 2 to Down-Top Sort " +
                             "or anything else to end : ");
            byte choice = scanner.nextByte();
            if (choice == TOP_DOWN) {
                sortStudentsTopDown(arrayToSort);
                break;
            }
            else if (choice == DOWN_TOP){
                sortStudentsDownTop(arrayToSort);
                break;
            }
            else {
                getChoice = TURN_OFF;
            }
        }
    }

    public static void sortStudentsTopDown(Student[] arrayToSort) {
        Arrays.sort(arrayToSort, Student::compareTo);
    }

    public static void sortStudentsDownTop(Student[] arrayToSort) {
        Arrays.sort(arrayToSort, Collections.reverseOrder(Student::compareTo));
    }

    public static void sortByAgeAscend(Student[] arrayToSort) {
        Arrays.sort(arrayToSort, new sortByAge());
    }

    public static void sortByAgeDescend(Student[] arrayToSort) {
        Arrays.sort(arrayToSort, Collections.reverseOrder(new sortByAge()));
    }

}
