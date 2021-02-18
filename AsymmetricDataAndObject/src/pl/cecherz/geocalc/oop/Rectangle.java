package pl.cecherz.geocalc.oop;

record Rectangle(
    Point topLeft,
    double height,
    double width
) implements Shape
{
    Rectangle(Point topLeft) {
        this(topLeft, 0, 0);
    }

    Rectangle(double height, double width) {
        this(null, height, width);
    }

    @Override
    public String shapePosition() {
        return topLeft.toString();
    }

    @Override
    public double area() {
        return height*width;
    }
}
