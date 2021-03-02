package sk.stuba.fei.uim.oop;

public class Student {
    private int ID;
    private String name;
    private String surname;
    private int age;

    public static final String UNSET_NAME = "UNSET";
    public static final int UNSET_AGE = 0;

    Student(String studentName, String studentSurname, int studentAge) {
        setName(studentName);
        setID();
        setSurname(studentSurname);
        setAge(studentAge);
    }

    Student() {
        this(UNSET_NAME, UNSET_NAME, UNSET_AGE);
    }

    public void setName(String studentName) {
        this.name = studentName;
    }

    public void setID() {
        this.ID = (int)(Math.random()*10000);
    }

    public void setSurname(String studentSurname) {
        this.surname = studentSurname;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public int getID() {
        return ID;
    }

    public String getName() {
        return name;
    }

    public String getSurname() {
        return surname;
    }

    public int getAge() {
        return age;
    }

    public void showStudentInfo() {
        System.out.println("name : " +getName());
        System.out.println("Surname : " +getSurname());
        System.out.println("ID : " +getID());
        if (getAge() == 0) {
            System.out.println("Age : UNSET");
        }
        else {
            System.out.println("Age : " +getAge());
        }
    }
}
