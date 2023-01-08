package StudentDataBaseApp;

import java.util.Scanner;

public class Student {
    private String firstName;
    private String lastName;
    private int gradeYear;
    private String studentID;
    private String course;
    private String tuitionBalance;
    private final int costOfCourse = 600;


    // Constructor prompted user to enter student's name and year
    public Student () {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter student first name: ");
        this.firstName = sc.nextLine();

        System.out.print("Enter student last name: ");
        this.lastName = sc.nextLine();

        System.out.print("1 - Freshman\n2 - Sophomore\n3 - Junior\n4 - Senior\nEnter student class level: ");
        this.gradeYear = sc.nextInt();
        System.out.println(firstName + " " + lastName + " " + gradeYear);
    }
    //Generate an ID

    //Enroll in courses

    //View balance

    //Pay tuition

    //Show an information of a student
}
