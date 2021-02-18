package pl.cecherz.geocalc.procedural;

record Geometry() {
    private static final double PI = Math.PI;

    public double area(Object shape) throws NoSuchShapeException
    {
        if(shape instanceof Square s)
            return s.side() * s.side();

        else if(shape instanceof Rectangle r)
            return r.height() * r.width();

        else if(shape instanceof Circle c)
            return PI * c.radius() * c.radius();

        throw new NoSuchShapeException();
    }
    public String shapePosition(Object shape) throws NoSuchShapeException {
        if(shape instanceof Square s)
            return s.topLeft().toString();

        else if(shape instanceof Rectangle r)
            return r.topLeft().toString();

        else if(shape instanceof Circle c)
            return c.center().toString();

        throw new NoSuchShapeException();
    }
}
