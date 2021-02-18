package pl.cecherz.geocalc.procedural;

record Square(
        Point topLeft,
        double side
)
{
    Square(Point topLeft) {
        this(topLeft, 0);
    }

    Square(double side) {
        this(null, side);
    }

}
