package ru.ssau.tk.sashapractice.Practice;

public class NamedPoint extends Point {
    private String name;

    String getName() {
        return name;
    }

    void setName(String name) {
        this.name = name;
    }

    public NamedPoint(double x, double y, double z) {
        super(x, y, z);
    }

    public NamedPoint(double x, double y, double z, String name) {
        super(x, y, z);
        this.name = name;
    }

    public NamedPoint() {
        super(0, 0, 0);
        this.name = "Origin";
    }
}
