package com.studentresult;

public class student {

    private int studentId;
    private String name;
    private String department;
    private int year;
    private double marks;

    // Constructor
    public student(int studentId, String name, String department, int year, double marks) {
        this.studentId = studentId;
        this.name = name;
        this.department = department;
        this.year = year;
        this.marks = marks;
    }

    // Getters
    public int getStudentId() { return studentId; }
    public String getName() { return name; }
    public String getDepartment() { return department; }
    public int getYear() { return year; }
    public double getMarks() { return marks; }

    // Grade calculate pannuvom
    public String getGrade() {
        if (marks >= 90) return "O";
        else if (marks >= 80) return "A+";
        else if (marks >= 70) return "A";
        else if (marks >= 60) return "B+";
        else if (marks >= 50) return "B";
        else if (marks >= 40) return "C";
        else return "F";
    }

    // Display
    public void display() {
        System.out.println("-----------------------------");
        System.out.println("ID      : " + studentId);
        System.out.println("Name    : " + name);
        System.out.println("Dept    : " + department);
        System.out.println("Year    : " + year);
        System.out.println("Marks   : " + marks);
        System.out.println("Grade   : " + getGrade());
        System.out.println("-----------------------------");
    }
}
