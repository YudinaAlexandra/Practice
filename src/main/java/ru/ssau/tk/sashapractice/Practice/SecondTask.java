package ru.ssau.tk.sashapractice.Practice;

public class SecondTask {
        static Person firstPerson = new Person();
        static Person secondPerson = new Person("Helen", "Blooms");
        static Person thirdPerson = new Person(548796);
        static Person fourthPerson = new Person("Helen", "Blooms", 548796, Gender.FEMALE);
    public static void main(String[] args)
    {
        System.out.println(firstPerson.getFirstName() + ' ' + firstPerson.getLastName() + ", passport " + firstPerson.getPassportId());
        System.out.println(secondPerson.getFirstName() + ' ' + secondPerson.getLastName() + ", passport " + secondPerson.getPassportId());
        System.out.println(thirdPerson.getFirstName() + ' ' + thirdPerson.getLastName() + ", passport " + thirdPerson.getPassportId());
        System.out.println(fourthPerson.getFirstName() + ' ' + fourthPerson.getLastName() + ", passport " + fourthPerson.getPassportId()+' '+fourthPerson.getGender());
    }
}
