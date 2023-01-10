package StudentDataBaseApp;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Student {
    private final String firstName;
    private final String lastName;
    private String gradeYear;
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

        //add a grade year to our student
        setGradeYear();
        //add a studentID to our student
        setStudentID();
    }

    //Set a grade year of a student
    public void setGradeYear() {
        System.out.print("""
                1 - Freshman
                2 - Sophomore
                3 - Junior
                4 - Senior
                Enter student class level:\s""");
        try {
            int intGradeYear = new Scanner(System.in).nextInt();
            switch (intGradeYear) {
                case (1) -> {
                    this.gradeYear = "1";
                }
                case (2) -> {
                    this.gradeYear = "2";
                }
                case (3) -> {
                    this.gradeYear = "3";
                }
                case (4) -> {
                    this.gradeYear = "4";
                }
                default -> {
                    System.out.println("In developing");
                }
            }
        } catch (InputMismatchException e) {
            System.out.println("Entered invalid variable. You can't enter a letter or letters of alphabet.");
            setGradeYear();
        }
    }

    //Generate an ID
    public String setStudentID() {
        ID++;
        return studentID = gradeYear + ID;
    }

    //Enroll in courses
    public void enrollInCourse() {
        try {
            int course;
            System.out.println("What course do student attend?");
            Scanner sc = new Scanner(System.in);
            do {
                System.out.print("""
                        1 - History 101;
                        2 - English 101;
                        3 - Math 101;
                        4 - PE 101;
                        0 - Quit;
                        Enter a number of course:\s""");
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
        } catch (InputMismatchException e) {
            System.out.print("Entered invalid variable. You can't enter a letter or letters of alphabet.\n");
            enrollInCourse();
        }
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
