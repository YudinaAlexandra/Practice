package ru.ssau.tk.sashapractice.Practice;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

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

    @Test
    public void testStringComparison() {
        Strings.stringComparison();
    }

    @Test
    public void testCheckPalindrome(){
        String firstString = "шалаш";
        String secondString = "палатка";
        assertTrue(Strings.checkPalindrome(firstString));
        assertFalse(Strings.checkPalindrome(secondString));
    }
}