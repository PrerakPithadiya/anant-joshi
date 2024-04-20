package Anant_Joshi;

import java.util.Scanner;

class Student {
    int roll;
    String name;
    int total;
    double percent;
    String result;
}

class Student_Management_System {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the Number of Students : ");
        int numOfStudent = sc.nextInt();

        System.out.print("Enter the Number of Subjects : ");
        int numOfSubject = sc.nextInt();
        System.out.println();

        Student[] arr = new Student[numOfStudent];
        int[][] marks = new int[numOfStudent][numOfSubject];
        String[] names = new String[numOfStudent];
        double maxPercent = 0;
        int roll = 0, passed = 0;

        for (int i = 0; i < numOfStudent; i++) {
            System.out.print("Enter Student " + (i + 1) + " Name : ");
            names[i] = sc.next();
            for (int j = 0; j < numOfSubject; j++) {
                System.out.print("Enter Student " + (i + 1) + " SUB " + (j + 1) + " Marks : ");
                marks[i][j] = sc.nextInt();
            }
            System.out.println();
        }

        for (int i = 0; i < arr.length; i++) {
            arr[i] = new Student();
            arr[i].roll = i + 1;
            arr[i].name = names[i];
            arr[i].total = calcTotalMarks(marks[i]);
            arr[i].percent = calcPercentage(arr[i].total, numOfSubject * 100);
            arr[i].result = calcResult(arr[i].total, numOfSubject * 40);
        }

        System.out.println("\n                  ** Student Record **");

        System.out.print("\nRoll No     Name    ");
        for (int i = 1; i <= numOfSubject; i++) {
            System.out.print("SUB" + i + "     ");
        }
        System.out.println("Total     Per     Result");

        for (int i = 0; i < arr.length; i++) {
            if (arr[i].roll < 10) System.out.print("0" + arr[i].roll + "      |   ");
            else System.out.print(arr[i].roll + "      |   ");
            System.out.print(arr[i].name + "  |   ");
            printMarks(marks, i);
            System.out.print(arr[i].total + "   |  ");
            System.out.printf("%.2f |  ", arr[i].percent);
            System.out.println(arr[i].result);
        }

        System.out.println("\n\n                  ** Student Summary **");

        System.out.println("Maximum Marks : ");
        System.out.println("Subject      Roll No      Marks");

        for (int j = 0; j < marks[0].length; j++) {
            int maxMarks = 0;
            roll = 0;
            for (int i = 0; i < marks.length; i++) {
                if (maxMarks < marks[i][j]) {
                    maxMarks = marks[i][j];
                    roll = i + 1;
                }
            }
            System.out.print("SUB ");
            if ((j + 1) < 10) System.out.print("0" + (j + 1));
            else System.out.print(j + 1);
            System.out.print("        ");
            if (roll < 10) System.out.print("0" + roll);
            else System.out.print(roll);
            System.out.println("           " + maxMarks);
        }

        for (int i = 0; i < arr.length; i++) {
            if (maxPercent < arr[i].percent) {
                maxPercent = arr[i].percent;
                roll = i + 1;
            }
        }

        System.out.printf("\n\nHighest Per: %.2f\n", maxPercent);
        System.out.println("Roll No: " + roll);

        for (Student element : arr) {
            if (element.result.equals("Pass")) {
                passed++;
            }
        }

        System.out.println("\n\nTotal Students: " + numOfStudent);
        System.out.println("Pass: " + passed);
        System.out.println("Fail: " + (numOfStudent - passed));
    }

    public static int calcTotalMarks(int[] marks) {
        int sum = 0;
        for (int element : marks) {
            sum += element;
        }
        return sum;
    }

    public static double calcPercentage(double obtained, int total) {
        return obtained / total * 100;
    }

    public static String calcResult(int obtained, int required) {
        if (obtained < required) {
            return "Fail";
        }
        return "Pass";
    }

    public static void printMarks(int[][] marks, int i) {
        for (int j = 0; j < marks[0].length; j++) {
            if (j < marks[0].length - 1) System.out.print(marks[i][j] + "       ");
            else System.out.print(marks[i][j] + "   ");
        }
        System.out.print("|   ");
    }
}