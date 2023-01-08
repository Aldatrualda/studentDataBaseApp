package StudentDataBaseApp;

import java.util.Scanner;

public class Student {
    private String firstName;
    private String lastName;
    private String gradeYear;
    private String studentID;
    private String course;
    private String tuitionBalance;
    //cost of course belongs whole class
    private static final int costOfCourse = 600;
    //create the variable that belongs the class
    private static int ID = 1000;

    // Constructor prompted user to enter student's name and year
    public Student () {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter student first name: ");
        this.firstName = sc.nextLine();

        System.out.print("Enter student last name: ");
        this.lastName = sc.nextLine();

        System.out.print("1 - Freshman\n2 - Sophomore\n3 - Junior\n4 - Senior\nEnter student class level: ");
        this.gradeYear = sc.nextLine();
        
        //add a studentID to our student
        setStudentID();
        //test
        System.out.println(firstName + " " + lastName + " " + gradeYear + " " + studentID);
    }
    //Generate an ID
    public String setStudentID() {
        ID++;
        return studentID = gradeYear + ID;
    }
    //Enroll in courses

    //View balance

    //Pay tuition

    //Show an information of a student
}
