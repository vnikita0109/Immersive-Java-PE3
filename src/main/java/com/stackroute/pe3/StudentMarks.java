package com.stackroute.pe3;

import java.util.Scanner;

public class StudentMarks{

    public static void main(String[] args) {


        Scanner sc = new Scanner(System.in);
        int numOfStudents = sc.nextInt();

        if (numOfStudents <= 0) {
            System.out.println("Invalid number of students");
        }
        int[] stuGrades = new int[numOfStudents];

        System.out.println("Enter grade of student:" + numOfStudents);
        for (int i = 0; i < numOfStudents; i++) {

            int grade = sc.nextInt();
            stuGrades[i] = grade;

        }
        fun(stuGrades);
    }
        public static String[] fun(int[] stuGrades) {
            String[] result = new String[stuGrades.length];

            for (int i = 0; i < stuGrades.length; i++) {

                if (stuGrades[i] < 0) {
                    result[i] = "Input is less than lowest value, enter a valid input";
                } else if (stuGrades[i] > 100) {
                    result[i] = "Input is greater than highest value, enter a valid input";
                } else if ((stuGrades[i] >= 0) && (stuGrades[i] <= 100)) {

                    result[i] = "true";
                }

            }
                return result;
            }


}
