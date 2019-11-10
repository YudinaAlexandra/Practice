package ru.ssau.tk.sashapractice.Practice;

abstract class Operation {
    abstract double apply(double number);
    double applyTriple(double number) {
        return apply(apply(apply(number)));
    }
}
