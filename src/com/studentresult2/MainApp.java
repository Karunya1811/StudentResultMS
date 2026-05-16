package com.studentresult2;

import java.util.ArrayList;
import java.util.Scanner;

public class MainApp {

    static ArrayList<Student> studentList = new ArrayList<>();
    static Scanner scanner = new Scanner(System.in);
    static int nextId = 1;

    public static void main(String[] args) {

        System.out.println("=============================");
        System.out.println(" STUDENT RESULT MANAGEMENT  ");
        System.out.println("=============================");

        int choice;
        do {
            System.out.println("\n1. Add Student");
            System.out.println("2. View All Students");
            System.out.println("3. Search Student by ID");
            System.out.println("4. Delete Student");
            System.out.println("0. Exit");
            System.out.print("Enter choice: ");
            choice = scanner.nextInt();

            switch (choice) {
                case 1: addStudent(); break;
                case 2: viewAll(); break;
                case 3: searchStudent(); break;
                case 4: deleteStudent(); break;
                case 0: System.out.println("Goodbye!"); break;
                default: System.out.println("Invalid choice!");
            }
        } while (choice != 0);
    }

    static void addStudent() {
        scanner.nextLine();
        System.out.print("Enter Name: ");
        String name = scanner.nextLine();
        System.out.print("Enter Department: ");
        String dept = scanner.nextLine();
        System.out.print("Enter Year (1-4): ");
        int year = scanner.nextInt();
        System.out.print("Enter Marks (0-100): ");
        double marks = scanner.nextDouble();

        Student s = new Student(nextId++, name, dept, year, marks);
        studentList.add(s);
        System.out.println("✓ Student added! ID: " + s.getStudentId());
    }

    static void viewAll() {
        if (studentList.isEmpty()) {
            System.out.println("No students found!");
            return;
        }
        System.out.println("\n===== ALL STUDENTS =====");
        for (Student s : studentList) {
            s.display();
        }
    }

    static void searchStudent() {
        System.out.print("Enter Student ID: ");
        int id = scanner.nextInt();
        for (Student s : studentList) {
            if (s.getStudentId() == id) {
                s.display();
                return;
            }
        }
        System.out.println("Student not found!");
    }

    static void deleteStudent() {
        System.out.print("Enter Student ID to delete: ");
        int id = scanner.nextInt();
        for (Student s : studentList) {
            if (s.getStudentId() == id) {
                studentList.remove(s);
                System.out.println("Student deleted!");
                return;
            }
        }
        System.out.println("Student not found!");
    }
}