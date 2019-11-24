package ru.ssau.tk.sashapractice.Practice;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class PersonTest {
        @Test
        public void testPerson() {
            Person onePerson = new Person();
            onePerson.setFirstName("Tim");
            onePerson.setLastName("Vin");
            onePerson.setPassportId(259863);

            assertEquals(onePerson.getFirstName(), "Tim");
            assertEquals(onePerson.getLastName(), "Vin");
            assertEquals(onePerson.getPassportId(), 259863);
        }

}