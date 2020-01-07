package ru.ssau.tk.sashapractice.Practice.taskForExam;


import java.io.Serializable;
import java.util.Arrays;

public class Students implements Serializable {
    private String surname;
    private String name;
    private String patronymic;
    private int recordBookNumber;
    private int[] marks;

    public Students() {

    }

    public Students(String surname, String name, String patronymic) {
        this.name = name;
        this.surname = surname;
        this.patronymic = patronymic;
    }

    public String getSurname() {
        return surname;
    }

    public String getName() {
        return name;
    }

    public String getPatronymic() {
        return patronymic;
    }

    public int getRecordBookNumber() {
        return recordBookNumber;
    }

    public int[] getMarks() {
        return marks;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setPatronymic(String patronymic) {
        this.patronymic = patronymic;
    }

    public void setRecordBookNumber(int recordBookNumber) {
        this.recordBookNumber = recordBookNumber;
    }

    public void setMarks(int[] marks) {
        this.marks = marks;
    }

    public static void main(String[] args) {
        Students firstStud = new Students("Yudina", "Alexandra", "Alexandrovna");
        int[] arrayOfScoreOfFirstStud = new int[]{4, 5, 4, 4};
        System.out.println("Information about student:  " + firstStud.getSurname() + " " + firstStud.getName() + " " + firstStud.getPatronymic());
        firstStud.setRecordBookNumber(123);
        System.out.println("Record Book Number of Student:  " + firstStud.getRecordBookNumber());
        firstStud.setMarks(arrayOfScoreOfFirstStud);
        System.out.println("Grades for exams: " + Arrays.toString(firstStud.getMarks()));
    }
}
