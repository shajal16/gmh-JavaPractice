package Assignment2;
//import java.util.Scanner;

/**
 * Complete the following code using default-constructor and parameterized
 * constructor:
 */

public class StudentData {
    private int stuID;
    private String stuName;
    private int stuAge;

    StudentData() {
        stuID = 123;
        stuName = "Student";
        stuAge = 22;

    }

    StudentData(int id, String name, int age) {
        stuID = id;
        stuName = name;
        stuAge = age;

    }

    public int getStuID() {
        return stuID;
    }

    public String getStuName() {
        return stuName;
    }

    public int getStuAge() {
        return stuAge;
    }

    public static void main(String args[]) {
        // This object creation would call the default constructor
        StudentData myobj = new StudentData();
        System.out.println("Student Name is: " + myobj.getStuName());
        System.out.println("Student Age is: " + myobj.getStuAge());
        System.out.println("Student ID is: " + myobj.getStuID());

        /*
         * This object creation would call the parameterized
         * constructor StudentData(int, String, int)
         */
        StudentData myobj2 = new StudentData(555, "Chaitanya", 25);
        System.out.println("Student Name is: " + myobj2.getStuName());
        System.out.println("Student Age is: " + myobj2.getStuAge());
        System.out.println("Student ID is: " + myobj2.getStuID());
    }

}