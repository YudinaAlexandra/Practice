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
    static public double[] quadraticEquationArray(double a, double b, double c){
        if (a == 0) {
            if (b == 0) {
                return new double[0];
            } else {
                double x = -c / b;
                return new double[]{x};
            }
        }
        double D = b * b - 4 * a * c;
        if (D == 0) {
            double x0 = -b / (2 * a);
            return new double[]{x0};
        } else if (D > 0) {
            double x1 = (-b - Math.sqrt(D)) / (2 * a);
            double x2 = (-b + Math.sqrt(D)) / (2 * a);
            return new double[]{x1, x2};


        } else {
            return new double[0];
        }
    }
    static int[] notDivisibleByThreeArray(int length) {
        int[] newArray = new int[length];
        int n = 1;
        for (int i = 0; i < length; i++) {
            if (n % 3 == 0) {
                n++;
            }
            newArray[i] = n++;
        }
        return newArray;
    }
    static double[] arithmeticProgressionArray(int length, double a1, double d){
     double[] newArray = new double[length];
     for(int i=0; i<length; i++){
         newArray[i]=a1+((i+1)-1)*d;
     }
     return newArray;
    }
}
