package pl.cecherz.geocalc.oop;

record Square(
        Point topLeft,
        double side
) implements Shape
{
    Square(Point topLeft) {
        this(topLeft, 0);
    }

    Square(double side) {
        this(null, side);
    }

    @Override
    public String shapePosition() {
        return topLeft.toString();
    }

    @Override
    public double area() {
        return side*side;
    }
}
