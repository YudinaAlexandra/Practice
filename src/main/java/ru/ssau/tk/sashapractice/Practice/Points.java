package ru.ssau.tk.sashapractice.Practice;

public class Points {
    private static double ACCURACY = 0.00005;
    public static Point sum(Point point1, Point point2) {
        Point sumPoints = new Point(point1.x + point2.x, point1.y + point2.y, point1.z + point2.z);
        return sumPoints;
    }
    public static Point subtruct(Point point1, Point point2) {
        Point subtructPoints = new Point(point1.x - point2.x, point1.y - point2.y, point1.z - point2.z);
        return subtructPoints;
    }
    public static Point multiply(Point point1, Point point2) {
        Point multiplyPoints = new Point(point1.x * point2.x, point1.y * point2.y, point1.z * point2.z);
        return multiplyPoints;
    }
    public static Point divide(Point point1, Point point2) {
        Point dividePoints = new Point(point1.x / point2.x, point1.y / point2.y, point1.z / point2.z);
        return dividePoints;
    }
    private Points(){

    }
}
