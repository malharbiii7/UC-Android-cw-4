package com.example.myapplication;

public class Student {

    private String studentName;
    private int studentage;
    private int studentPhoto;



    public String getStudentName() {
        return studentName;
    }

    public void setStudentName(String studentName) {
        this.studentName = studentName;
    }

    public int getStudentage() {
        return studentage;
    }

    public void setStudentage(int studentage) {
        this.studentage = studentage;
    }

    public int getStudentPhoto() {
        return studentPhoto;
    }

    public void setStudentPhoto(int studentPhoto) {
        this.studentPhoto = studentPhoto;
    }

    public Student(String studentName, int studentage, int studentPhoto) {
        this.studentName = studentName;
        this.studentage = studentage;
        this.studentPhoto = studentPhoto;
    }
}
