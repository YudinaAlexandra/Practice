package ru.ssau.tk.sashapractice.Practice.taskForExam;

import java.util.ArrayList;
import java.util.Collection;

public class StudentTask8 {
    private String name;
    private int recordBookNumber;
    private int yearOfBirth;
    private String cityOfBirth;

    public StudentTask8(){

    }
    public StudentTask8(String name, int recordBookNumber, int yearOfBirth, String cityOfBirth){
        this.name = name;
        this.recordBookNumber = recordBookNumber;
        this. yearOfBirth = yearOfBirth;
        this.cityOfBirth = cityOfBirth;
    }

    public String getName() {
        return name;
    }

    public int getRecordBookNumber() {
        return recordBookNumber;
    }

    public int getYearOfBirth() {
        return yearOfBirth;
    }

    public String getCityOfBirth() {
        return cityOfBirth;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setRecordBookNumber(int recordBookNumber) {
        this.recordBookNumber = recordBookNumber;
    }

    public void setYearOfBirth(int yearOfBirth) {
        this.yearOfBirth = yearOfBirth;
    }

    public void setCityOfBirth(String cityOfBirth) {
        this.cityOfBirth = cityOfBirth;
    }
    private static Collection myCollection(StudentTask8[] students){
        Collection collection = new ArrayList();
        for(StudentTask8 student : students){
            collection.add(student.getName());
        }
        return collection;
    }
    public static void main(String[] args){
        StudentTask8[] students = {
                new StudentTask8("Sasha", 123, 1998, "Samara"),
                new StudentTask8("Kostya", 456, 1972, "Moscow"),
                new StudentTask8("Andrew", 789, 1986, "Orenburg"),
        };
        System.out.println(StudentTask8.myCollection(students));
    }
}
