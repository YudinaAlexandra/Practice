package ru.ssau.tk.sashapractice.Practice;

public class Strings {
    public static char[] outputSymbol(String string) {
        char[] symbol = new char[string.length()];
        for (int i = 0; i < string.length(); i++) {
            symbol[i] = string.charAt(i);
        }
        return symbol;
    }

    public static void outputBytes(String string) {
        byte[] bytes = string.getBytes();
        for (int i = 0; i < string.length(); i++) {
            System.out.println(bytes[i]);
        }
    }
}
