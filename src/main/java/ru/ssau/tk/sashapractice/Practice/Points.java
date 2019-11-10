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
    public static Point enlarge(Point point1, double number) {
        Point enlargePoint = new Point(point1.x * number, point1.y * number, point1.z * number);
        return enlargePoint;
    }
    public static Point opposite(Point point1){
        Point oppositePoint = new Point(point1.x*(-1),point1.y*(-1),point1.z*(-1));
        return oppositePoint;
    }
    public static Point inverse(Point point1){
        Point inversePoint = new Point(1/point1.x, 1/point1.y, 1/point1.z);
        return inversePoint;
    }
    public static Point scalarProduct(Point point1, Point point2){
        Point scalarProductPoint = new Point(point1.x*point2.x, point1.y*point2.y,point1.z*point2.z);
        return scalarProductPoint;
    }
    public static Point vectorProduct(Point point1, Point point2){
        Point vectorProductPoint = new Point(point1.y * point2.z - point2.y * point1.z, point2.x * point1.z - point1.x * point2.z, point1.x * point2.y - point2.x * point1.y);
        return vectorProductPoint;
    }
}
