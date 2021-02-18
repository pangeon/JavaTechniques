package pl.cecherz.geocalc.procedural;

record Circle(
   Point center,
   double radius
)
{
    Circle(Point center) {
        this(center, 0);
    }
    Circle(double radius) {
        this(null, radius);
    }
}
