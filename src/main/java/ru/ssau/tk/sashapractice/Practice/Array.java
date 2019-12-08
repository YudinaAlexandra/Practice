package ru.ssau.tk.sashapractice.Practice;



public class Array {
    static public double[] newArray(int length) {
        double[] newArray = new double[length];
        for (int i = 0; i < length; i++) {
            newArray[i] = i + 1;
        }
        return newArray;
    }

    static public double[] newArrayOneTwo(int lenght) {
        double[] newArray = new double[lenght];
        newArray[0] = 2;
        newArray[lenght - 1] = 2;
        for (int i = 1; i < lenght - 1; i++) {
            newArray[i] = 1;
        }
        return newArray;
    }

    static public double[] oddNumberArray(int lenght) {
        double[] newArray = new double[lenght];
        for (int i = 0; i < lenght; i++) {
            newArray[i] = (2 * i) + 1;
        }
        return newArray;
    }

    static public double[] evenNumberArray(int lenght) {
        double[] newArray = new double[lenght];
        for (int i = 0; i < lenght; i++) {
            newArray[i] = (lenght - i) * 2;
        }
        return newArray;
    }

    static public double[] fibonacciNumberArray(int lenght) {
        double[] newArray = new double[lenght];
        newArray[0] = 1;
        newArray[1] = 1;
        for (int i = 2; i < lenght; i++) {
            newArray[i] = newArray[i - 1] + newArray[i - 2];
        }
        return newArray;
    }

    static public double[] indexSquareArray(int lenght) {
        double[] newArray = new double[lenght];
        for (int i = 0; i < lenght; i++) {
            newArray[i] = i*i;
        }
        return newArray;
    }
}
