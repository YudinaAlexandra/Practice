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

    public static void stringComparison() {
        String firstString = "String for test method";
        String secondString = new String(firstString);
        System.out.println(firstString == secondString); //сравнивает ссылки - false
        System.out.println(firstString.equals(secondString)); //сравнивает значения - true
    }

    static public boolean checkPalindrome(String string) {
        int length = string.length();
        for (int i = 0; i < length; i++) {
            if (string.charAt(i) != string.charAt(length - i - 1)) {
                return false;
            }
        }
        return true;
    }

    public static int getIndexOfFirstEntry(String first, String second){
        return first.indexOf(second);
    }
    public static int getIndexOfFirstEntryInSecondPartOfFirstString(String first, String second){
        return first.indexOf(second, first.length()/2);
    }
    public static int getIndexOfLastEntryInFirstPartOfFirstString(String first, String second){
        return first.lastIndexOf(second, first.length()/2);
    }
    public static String replaceOccurrencesOf(String string, String regex, String replacement){
        for (int i=0; i<100 && string.contains(regex); i++){
            string = string.replaceAll(regex, replacement);
        }
        return string;
    }
}
