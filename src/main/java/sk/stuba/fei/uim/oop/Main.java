package sk.stuba.fei.uim.oop;

import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.Scanner;

public class Main {
    public static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        //testStudentClass();
        Student[] students = createStudentsArray(5);
        sortByAge(students);
        showAllStudentsInfo(students);
    }

    public static void showAllStudentsInfo(Student[] studentsToShow) {
        System.out.println("-----showAllStudentsInfo()-----");
        for (Student student : studentsToShow) {
            student.showStudentInfo();
        }
    }

    public static void testStudentClass() {
        System.out.println("-----testStudentClass()-----");
        Student student = new Student("Thomas", "Newman", 21);
        student.showStudentInfo();

        Student student1 = new Student();
        student1.showStudentInfo();
    }

    public static Student[] createStudentsArray(int numberOfStudents) {
        System.out.println("-----createStudentArray()------");
        String[] studentNames = new String[] {"Antony", "Joshua", "Fero", "Andreu", "Johny", "Mortar"};
        String[] surNames = new String[] {"Newman", "Oldman", "Getter", "Setter", "Mony", "Fielder"};
        Student[] students = new Student[numberOfStudents];

        for (int i = 0; i < numberOfStudents; i++) {
            students[i] = new Student(studentNames[i], surNames[i], (int)(Math.random()*100));
        }
        return students;
    }

    public static void sortStudents(Student[] arrayToSort) {
        System.out.println("-----sortStudents()------");
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
            }
            else if (choice == DOWN_TOP){
                sortStudentsDownTop(arrayToSort);
            }
            else {
                getChoice = TURN_OFF;
            }
        }
    }

    public static void sortStudentsTopDown(Student[] arrayToSort) {
        System.out.println("-----sortStudentsTopDown()------");
        Arrays.sort(arrayToSort, Student::compareTo);
    }

    public static void sortStudentsDownTop(Student[] arrayToSort) {
        System.out.println("-----sortStudentsDownTop()------");
        Arrays.sort(arrayToSort, Collections.reverseOrder(Student::compareTo));
    }

    public static void sortByAge(Student[] arrayToSort) {
        System.out.println("-----sortByAge()------");
        Arrays.sort(arrayToSort, Collections.reverseOrder(new sortByAge()));
    }

}
