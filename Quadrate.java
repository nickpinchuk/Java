public class Quadrate implements GeometricFigure{
    private int a;



    public Quadrate(int a) {
        this.a = a;
    }

    @Override
    public int areaOfTheFigure() {
        int area = this.a * this.a;
        return area;

    }

}
