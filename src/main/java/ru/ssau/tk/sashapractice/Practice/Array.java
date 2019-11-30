package ru.ssau.tk.sashapractice.Practice;

public class Array {
    static public double[] newArray(int length) {
        double[] newArray = new double[length];
        for (int i = 0; i < length; i++) {
            newArray[i] = i + 1;
        }
        return newArray;
    }
}
