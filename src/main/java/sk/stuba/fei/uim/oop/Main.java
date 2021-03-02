package sk.stuba.fei.uim.oop;

import java.util.Scanner;

public class Main {
    public static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        // testStudentClass();
        Student[] students = createStudentArray(3);
        sortStudents(students);
    }

    public static void testStudentClass() {
        Student student = new Student("Thomas", "Newman", 21);
        student.showStudentInfo();

        Student student1 = new Student();
        student1.showStudentInfo();
    }

    public static Student[] createStudentArray(int numberOfStudents) {
        String[] studentNames = new String[] {"Antony", "Joshua", "Fero", "Andreu", "Johny", "Mortar"};
        String[] surNames = new String[] {"Newman", "Oldman", "Getter", "Setter", "Mony", "Fielder"};
        Student[] students = new Student[numberOfStudents];

        for (int i = 0; i < numberOfStudents; i++) {
            students[i] = new Student(studentNames[i], surNames[i], i+10);
        }
        return students;
    }

    public static void sortStudents(Student[] arrayToSort) {
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
        System.out.println("1");
    }

    public static void sortStudentsDownTop(Student[] arrayToSort) {
        System.out.println("2");
    }


}
