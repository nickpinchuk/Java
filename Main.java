public class Main {
    public static void main(String[] args) {
        GeometricFigure [] squares = {new Circle(15), new Triangle(21,31), new Quadrate( 25)};

        //System.out.println(squares[0].areaOfTheFigure());

        System.out.println("Square all = " +area(squares));
    }
    public static int area (GeometricFigure [] squares) {
        int areA = 0;
        for (GeometricFigure square : squares) {
            areA += square.areaOfTheFigure();
        }
        return areA;
    }
}
