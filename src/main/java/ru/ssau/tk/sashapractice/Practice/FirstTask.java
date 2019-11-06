package ru.ssau.tk.sashapractice.Practice;

public class FirstTask {
    static Person onePerson = new Person();
    static Person twoPerson = new Person();
    static Person threePerson = new Person();

    public static void main(String[] args) {
        onePerson.setFirstName("Bob");
        onePerson.setLastName("Oliver");
        onePerson.setPassportId(361476);
        twoPerson.setFirstName("Robert");
        twoPerson.setLastName("Brunt");
        twoPerson.setPassportId(456734);
        threePerson.setFirstName("Michael");
        threePerson.setLastName("Pel");
        threePerson.setPassportId(562387);
        System.out.println(onePerson.getFirstName() + ' ' + onePerson.getLastName() + "; passport: " + onePerson.getPassportId());
        System.out.println(twoPerson.getFirstName() + ' ' + twoPerson.getLastName() + "; passport: " + twoPerson.getPassportId());
        System.out.println(threePerson.getFirstName() + ' ' + threePerson.getLastName() + "; passport: " + threePerson.getPassportId());
    }
}
