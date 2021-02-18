package pl.cecherz.geocalc.procedural;

record Point(
        double x,
        double y
) {
    @Override
    public String toString() {
        return "x = " + x + ", y = " + y;
    }
}
