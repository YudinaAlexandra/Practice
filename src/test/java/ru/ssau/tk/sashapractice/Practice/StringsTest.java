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
    public void testCheckPalindrome() {
        String firstString = "шалаш";
        String secondString = "палатка";
        assertTrue(Strings.checkPalindrome(firstString));
        assertFalse(Strings.checkPalindrome(secondString));
    }
    @Test
    public void testGetIndexOfFirstEntry(){
        String firstString = "abcabcabc";
        String secondString = "ca";
        String thirdString = "dh";
        assertEquals(Strings.getIndexOfFirstEntry(firstString, secondString), 2);
        assertEquals(Strings.getIndexOfFirstEntry(firstString, thirdString), -1);
    }
    @Test
    public void testGetIndexOfFirstEntryInSecondPartOfFirstString(){
        String firstString = "abcabcabc";
        String secondString = "bc";
        String thirdString = "dh";
        assertEquals(Strings.getIndexOfFirstEntry(firstString, secondString), 1);
        assertEquals(Strings.getIndexOfFirstEntry(firstString, thirdString), -1);
    }
    @Test
    public void testGetIndexOfLastEntryInFirstPartOfFirstString(){
        String firstString = "abcabcabc";
        String secondString = "bc";
        String thirdString = "dh";
        assertEquals(Strings.getIndexOfFirstEntry(firstString, secondString), 1);
        assertEquals(Strings.getIndexOfFirstEntry(firstString, thirdString), -1);
    }
}