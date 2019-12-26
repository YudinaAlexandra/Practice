package ru.ssau.tk.sashapractice.Practice;

import org.junit.jupiter.api.Test;

class StringsTest {
    @Test
    public void testOutputSymbol() {
        String string = "test method output symbol";
        Strings.outputSymbol(string);
    }

    @Test
    public void testOutputBytes() {
        String firstString = "Test method output bytes";
        Strings.outputBytes(firstString);
        System.out.println("\n");
        String secondString = "Тест для метода";
        Strings.outputBytes(secondString);
    }
}