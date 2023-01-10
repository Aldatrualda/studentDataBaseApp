package StudentDataBaseApp;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        //Ask how many students we want to add and create n number of new students
        createArrayOfStudent(countOfStudents());
    }

    //Create a method to ask how mane new users we want to add
    static public int countOfStudents() {
        System.out.print("How many students do you want to add: ");
        int countOfStudents = new Scanner(System.in).nextInt();
        return countOfStudents;
    }

    //Create n number of new students
    static public void createArrayOfStudent(int countOfStudent) {
        Student[] student = new Student[countOfStudent];
        //Add students up into array
        for (int i = 0; i < countOfStudent; i++) {
            student[i] = new Student();
            student[i].enrollInCourse();
        }

        //Print information of students
        for (int i = 0; i < countOfStudent; i++) {
            student[i].showInformationOfAStudent();
        }
    }
}
