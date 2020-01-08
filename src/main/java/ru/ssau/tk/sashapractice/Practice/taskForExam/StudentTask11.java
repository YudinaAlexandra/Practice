package ru.ssau.tk.sashapractice.Practice.taskForExam;

import java.util.Map;
import java.util.stream.Collector;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class StudentTask11 {
    private String name;
    private int recordBookNumber;
    private int yearOfBirth;
    private String cityOfBirth;

    public StudentTask11(){

    }
    public StudentTask11(String name, int recordBookNumber, int yearOfBirth, String cityOfBirth){
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

    private static Map<StudentTask11, Integer> getMap(){
        StudentTask11[] students = new StudentTask11[]{new StudentTask11("Masha", 123, 1998, "Nsk"),
        new StudentTask11("Olga", 456, 1999, "Samara")};
        return Stream.of(students).collect(Collectors.toMap(stud -> stud, StudentTask11::getRecordBookNumber));
    }
    public static void main (String[] args){
        System.out.println(StudentTask11.getMap());
    }
}
