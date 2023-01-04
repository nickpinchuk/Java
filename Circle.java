public class Circle implements GeometricFigure{
    private int radius;

    public Circle(int radius) {
        this.radius = radius;
    }

    @Override
    public int areaOfTheFigure() {
        int area = (int) Math.round(Math.PI * Math.pow(this.radius, 2));
        return area;
    }
}
