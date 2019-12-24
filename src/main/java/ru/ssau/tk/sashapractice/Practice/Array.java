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
            newArray[i] = i * i;
        }
        return newArray;
    }

    static public double[] quadraticEquationArray(double a, double b, double c) {
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

    static double[] arithmeticProgressionArray(int length, double a1, double d) {
        double[] newArray = new double[length];
        for (int i = 0; i < length; i++) {
            newArray[i] = a1 + ((i + 1) - 1) * d;
        }
        return newArray;
    }

    static double[] geometryProgressionArray(int length, double b1, double q) {
        double[] newArray = new double[length];
        newArray[0] = b1;
        for (int i = 1; i < length; i++) {
            newArray[i] = newArray[i - 1] * q;
        }
        return newArray;
    }

    static int[] symmetricArray(int length) {
        var newArray = new int[length];
        int j = 1;
        for (int i = 0; i < Math.ceil(((double) length) / 2); i++) {
            newArray[i] = j++;
            newArray[length - i - 1] = newArray[i];
        }
        return newArray;
    }

    static void oppositeArray(double[] array) {
        for (int i = 0; i < array.length; i++) {
            array[i] = -array[i];
        }
    }

    static boolean containedInArray(double[] array, double a) {
        for (int i = 0; i < array.length; i++) {
            if (array[i] == a) {
                return true;
            }
        }
        return false;
    }

    static boolean containedNullInArray(Integer[] array) {
        for (int i = 0; i < array.length; i++) {
            if (array[i] == null) {
                return true;
            }
        }
        return false;
    }

    static int evenNumberInArray(double[] array) {
        int count = 0;
        for (int i = 0; i < array.length; i++) {
            if (array[i] % 2 == 0) {
                count++;
            }
        }
        return count;
    }

    static Integer maxElementInArray(Integer[] array) {
        Integer max = 0;
        if (array.length == 0) {
            return null;
        } else {
            for (int i = 0; i < array.length; i++) {
                if (array[i] > max) {
                    max = array[i];
                }
            }
        }
        return max;
    }

    static double sumOfEvenInArray(double[] array) {
        double sum = 0;
        for (int i = 0; i < array.length; i++) {
            if (i % 2 == 0) {
                sum = sum + array[i];
            }
        }
        return sum;
    }

    static boolean firstDividedMoreElementsThanLast(int[] array) {
        int dividedByFirst = 0;
        int dividedByLast = 0;
        for (int i = 0; i < array.length; i++) {
            if (array[i] % array[0] == 0) {
                dividedByFirst = dividedByFirst + 1;
            }
            if (array[i] % array[array.length - 1] == 0) {
                dividedByLast = dividedByLast + 1;
            }
        }
        if (dividedByFirst > dividedByLast) {
            return true;
        } else {
            return false;
        }
    }

    static double elementOccursMostOften(double[] array) {
        double element = array[0];
        int maxNumberOfEntry = 0;
        for (int i = 0; i < array.length; i++) {
            int count = 1;
            for (int j = 0; j < array.length; j++) {
                if (array[j] == array[i]) {
                    count++;
                }
                if (count > maxNumberOfEntry) {
                    element = array[j];
                    maxNumberOfEntry = count;
                }
            }
        }
        return element;
    }

    static double firstEqualToInputNumber(double[] array, double number) {
        for (int i = 0; i < array.length; i++) {
            if (array[i] == number) {
                return i;
            }
        }
        return -1;
    }

    static void changeMinAndMax(double[] array) {
        double firstMaxNumber = Double.MIN_VALUE;
        double firstMinNumber = Double.MAX_VALUE;
        int indexOfMax = 0;
        int indexOfMin = 0;
        for (int i = 0; i < array.length; i++) {
            if (array[i] > firstMaxNumber) {
                firstMaxNumber = array[i];
                indexOfMax = i;
            }
            if (array[i] < firstMinNumber) {
                firstMinNumber = array[i];
                indexOfMin = i;
            }
        }
        array[indexOfMax] = firstMinNumber;
        array[indexOfMin] = firstMaxNumber;
    }

    static void getBitNegation(int[] array) {
        for (int i = 0; i < array.length; i++) {
            array[i] = ~array[i];
        }
    }
    static int[] getNegationArray(int[] array) {
        int[] negationArray = new int[array.length];
        for (int i = 0; i < array.length; i++) {
            negationArray[i] = ~array[i];
        }
        return negationArray;
    }
    static int[] getSumOfNear(int[] array) {
        int[] arrayOfSumOfNear;
        if (array.length % 2 == 0) {
            arrayOfSumOfNear = new int[array.length / 2];
            for (int i = 0; i < arrayOfSumOfNear.length; i++) {
                arrayOfSumOfNear[i] = array[2 * i] + array[2 * i + 1];
            }
        } else {
            arrayOfSumOfNear = new int[array.length / 2 + 1];
            for (int i = 0; i < arrayOfSumOfNear.length - 1; i++) {
                arrayOfSumOfNear[i] = array[2 * i] + array[2 * i + 1];
            }
            arrayOfSumOfNear[arrayOfSumOfNear.length - 1] = array[array.length - 1];
        }
        return arrayOfSumOfNear;
    }
    static boolean[] getTrueOrFalse(int[] array) {
        boolean[] arrayGetTrueOrFalse = new boolean[array.length];
        for (int i = 0; i < array.length; i++) {
            if (array[i] % 2 == 0) {
                arrayGetTrueOrFalse[i] = true;
            } else {
                arrayGetTrueOrFalse[i] = false;
            }
        }
        return arrayGetTrueOrFalse;
    }
}
