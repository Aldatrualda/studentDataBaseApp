package StudentDataBaseApp;

import java.util.Scanner;

public class Student {
    private String firstName;
    private String lastName;
    private String gradeYear;
    private String studentID;
    private String courses = "";
    private int tuitionBalance;
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
        enrollInCourse();
        //test
        System.out.println("Student info.\n" +
                "Name: " + firstName + " " + lastName + ". Grade year: " + gradeYear +
                " student ID: " + studentID + "\n" +
                "List of student's courses:\n" + courses + "Tuition balance: " + tuitionBalance);
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
            System.out.println("""
                    1 - History 101
                    2 - English 101
                    3 - Math 101
                    4 - PE 101
                    0 - Quit
                    Enter a number of course:\s""");
            Scanner sc = new Scanner(System.in);
            course = sc.nextInt();
            switch (course) {
                case (1) -> {
                    this.courses = this.courses + "History 101\n";
                    this.tuitionBalance = tuitionBalance + costOfCourse;
                }
                case (2) -> {
                    this.courses = this.courses + "English 101\n";
                    this.tuitionBalance = tuitionBalance + costOfCourse;
                }
                case (3) -> {
                    this.courses = this.courses + "Math 101\n";
                    this.tuitionBalance = tuitionBalance + costOfCourse;
                }
                case (4) -> {
                    this.courses = this.courses + "PE 101\n";
                    this.tuitionBalance = tuitionBalance + costOfCourse;
                }
                case (0) -> {}
                default -> System.out.println("In developing");
            }
        } while (course != 0);


    }
    //View balance

    //Pay tuition

    //Show an information of a student
}
