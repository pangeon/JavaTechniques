package pl.cecherz.geocalc.procedural;

record Rectangle(
    Point topLeft,
    double height,
    double width
)
{
    Rectangle(Point topLeft) {
        this(topLeft, 0, 0);
    }

    Rectangle(double height, double width) {
        this(null, height, width);
    }
}
