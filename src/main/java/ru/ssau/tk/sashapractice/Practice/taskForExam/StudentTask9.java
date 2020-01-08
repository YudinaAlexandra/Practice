package ru.ssau.tk.sashapractice.Practice.taskForExam;

import java.util.ArrayList;
import java.util.Collection;
import java.util.HashSet;

public class StudentTask9 {
    private String name;
    private int recordBookNumber;
    private int yearOfBirth;
    private String cityOfBirth;

    public StudentTask9(){

    }
    public StudentTask9(String name, int recordBookNumber, int yearOfBirth, String cityOfBirth){
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

    private static Collection myCollection(StudentTask9[] students){
        HashSet <String> collectionForCity = new HashSet<>();
        for(StudentTask9 student : students){
            collectionForCity.add(student.getCityOfBirth());
        }
        return collectionForCity;
    }
    public static void main(String[] args){
        StudentTask9[] students = {
                new StudentTask9("Sasha", 123, 1998, "Samara"),
                new StudentTask9("Kostya", 456, 1972, "Moscow"),
                new StudentTask9("Andrew", 789, 1986, "Samara"),
        };
        System.out.println(StudentTask9.myCollection(students));
    }
}
