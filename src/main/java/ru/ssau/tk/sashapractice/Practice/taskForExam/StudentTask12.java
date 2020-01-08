package ru.ssau.tk.sashapractice.Practice.taskForExam;

import java.util.Collection;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class StudentTask12 {
    private String name;
    private int recordBookNumber;
    private int yearOfBirth;
    private String cityOfBirth;

    public StudentTask12(){

    }
    public StudentTask12(String name, int recordBookNumber, int yearOfBirth, String cityOfBirth){
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

    public static Collection getCollection() {
        StudentTask12[] students = new StudentTask12[]{new StudentTask12("Jxhjbc", 123, 2000, "Moscow"),
                new StudentTask12("Kscmnx", 456, 2002, "Samara"),
                new StudentTask12("Jxjdbm", 789, 2004, "Sochi")};
        return Stream.of(students).filter(x -> !(x.getCityOfBirth().equals("Samara")) && x.getYearOfBirth() > 2000).collect(Collectors.toSet());
    }
    public static void main (String[] args){
        Collection studs = StudentTask12.getCollection();
        for(Object stud : studs){
            System.out.println(((StudentTask12) stud).getName());
        }
    }
}
