package pl.cecherz.geocalc.procedural;

public class StartProcedural {
    public static void main(String[] args) {
        Geometry geometryCalculator = new Geometry();

        try {
            /* Square */
            String squarePosition = geometryCalculator.shapePosition(
                new Square(
                    new Point(4, 5)
                )
            );
            double squareArea = geometryCalculator.area(
                new Square(8)
            );

            /* Rectangle */
            String rectanglePosition = geometryCalculator.shapePosition(
                new Rectangle(
                    new Point(3.7, 7)
                )
            );
            double rectangleArea = geometryCalculator.area(
                new Rectangle(8, 5)
            );

            /* Circle */
            String circlePosition = geometryCalculator.shapePosition(
                new Circle(
                    new Point(9, 2.33)
                )
            );
            double circleArea = geometryCalculator.area(
                new Circle(8)
            );
            printInfoAboutFigure("square", squarePosition, squareArea);
            printInfoAboutFigure("rectangle", rectanglePosition, rectangleArea);
            printInfoAboutFigure("circle", circlePosition, circleArea);

        } catch (NoSuchShapeException e) {
            e.printStackTrace();
        }
    }

    private static void printInfoAboutFigure(String figureName, String position, double area) {
        System.out.println("Position of " + figureName + " " + position);
        System.out.println("Area of " + figureName + " " + area);
        System.out.println("-------");
    }
}
