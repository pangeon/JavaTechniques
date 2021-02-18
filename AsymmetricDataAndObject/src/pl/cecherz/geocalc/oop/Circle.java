package pl.cecherz.geocalc.oop;

record Circle(Point center,
              double radius) implements Shape
{

    Circle(Point center) {
        this(center, 0);
    }
    Circle(double radius) {
        this(null, radius);
    }

    @Override
    public String shapePosition() {
        return center.toString();
    }

    @Override
    public double area() {
        return PI*radius*radius;
    }
}
