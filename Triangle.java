public class Triangle implements GeometricFigure{
    private int base;
    private int height;

    public Triangle(int base, int height) {
        this.base = base;
        this.height = height;
    }

    @Override
    public int areaOfTheFigure() {
        int area = (this.base*this.height)/2;
        return area;
    }
}
