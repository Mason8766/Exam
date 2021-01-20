package com.company;

public class student {
    String studentName;
    private int studentNumber;
    int grade;
    static String school;
    String classroom;
    String teacher;

    public int getStudentNumber() {
        return studentNumber;
    }

    public void setStudentNumber(int studentNumber) {
        this.studentNumber = studentNumber;
    }
    static void isPassing(int grade){
        if (grade > 500) {
            System.out.println("Is passing");
        }else{
            System.out.println("Failed");
        }
    }
    public student(){
        student mason = new student();
        student jacob = new student();
    }


}
