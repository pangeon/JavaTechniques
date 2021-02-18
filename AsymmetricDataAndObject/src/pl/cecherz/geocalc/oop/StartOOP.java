package pl.cecherz.geocalc.oop;

public class StartOOP {
    public static void main(String[] args) {

        /* Square */
        double squareArea = new Square(4.09)
                .area();

        String squarePosition = new Square(
                new Point(7.4321, 9.986)
        ).shapePosition();

        /* Rectangle */
        double rectangleArea = new Rectangle(4.86, 9.7)
                .area();

        String rectanglePosition = new Rectangle(
                new Point(6.6, 9.3)
        ).shapePosition();

        /* Circle */
        double circleArea = new Circle(6.88)
                .area();

        String circlePosition = new Circle(
                new Point(9.12, 1.07)
        ).shapePosition();

        printInfoAboutFigure("square", squarePosition, squareArea);
        printInfoAboutFigure("rectangle", rectanglePosition, rectangleArea);
        printInfoAboutFigure("circle", circlePosition, circleArea);
    }

    private static void printInfoAboutFigure(String figureName, String position, double area) {
        System.out.println("Position of " + figureName + " " + position);
        System.out.println("Area of " + figureName + " " + area);
        System.out.println("-------");
    }
}
