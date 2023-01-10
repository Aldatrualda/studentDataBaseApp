package StudentDataBaseApp;

import java.util.Scanner;

public class Student {
    private final String firstName;
    private final String lastName;
    private final String gradeYear;
    private String studentID;
    private String courses = "";
    private int tuitionBalance;
    //cost of course belongs whole class
    private static final int costOfCourse = 600;
    //create the variable that belongs the class
    private static int ID = 1000;

    // Constructor prompted user to enter student's name and year
    public Student() {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter student first name: ");
        this.firstName = sc.nextLine();

        System.out.print("Enter student last name: ");
        this.lastName = sc.nextLine();

        System.out.print("1 - Freshman\n2 - Sophomore\n3 - Junior\n4 - Senior\nEnter student class level: ");
        this.gradeYear = sc.nextLine();

        //add a studentID to our student
        setStudentID();
    }

    //Generate an ID
    public String setStudentID() {
        ID++;
        return studentID = gradeYear + ID;
    }

    //Enroll in courses
    public void enrollInCourse() {
        int course;
        System.out.println("What course do student attend");
        do {
            System.out.print("""
                    1 - History 101;
                    2 - English 101;
                    3 - Math 101;
                    4 - PE 101;
                    0 - Quit;
                    Enter a number of course:\s""");
            Scanner sc = new Scanner(System.in);
            course = sc.nextInt();
            switch (course) {
                case (1) -> {
                    this.courses = this.courses + "\tHistory 101\n";
                    this.tuitionBalance = tuitionBalance + costOfCourse;
                }
                case (2) -> {
                    this.courses = this.courses + "\tEnglish 101\n";
                    this.tuitionBalance = tuitionBalance + costOfCourse;
                }
                case (3) -> {
                    this.courses = this.courses + "\tMath 101\n";
                    this.tuitionBalance = tuitionBalance + costOfCourse;
                }
                case (4) -> {
                    this.courses = this.courses + "\tPE 101\n";
                    this.tuitionBalance = tuitionBalance + costOfCourse;
                }
                case (0) -> {
                }
                default -> System.out.println("In developing");
            }
        } while (course != 0);
    }

    //View balance
    public void showBalance() {
        System.out.println("Your balance is $" + tuitionBalance);
    }

    //Pay tuition
    public void payTuitionBalance() {
        System.out.print("Enter your deposit here: ");
        int deposit = new Scanner(System.in).nextInt();
        this.tuitionBalance = tuitionBalance - deposit;
        //After operation check a tuition balance
        showBalance();
    }

    //Show an information of a student
    public void showInformationOfAStudent() {
        System.out.println("Student info.\n" +
                "\tName: " + firstName + " " + lastName +
                ".\n\tGrade year: " + gradeYear +
                ".\n\tStudent ID: " + studentID + "\n" +
                "\tList of student's courses:\n" + courses +
                "\tTuition balance: " + tuitionBalance);
    }
}
