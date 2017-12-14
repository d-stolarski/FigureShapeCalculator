public class Rectangle extends Shape {

    private double dimensionA;
    private double dimensionB;

    public Rectangle(double dimensionA, double dimensionB) {
        super();
        this.dimensionA = dimensionA;
        this.dimensionB = dimensionB;
    }

    public double getDimensionA() {
        return dimensionA;
    }

    public void setDimensionA(double dimensionA) {
        this.dimensionA = dimensionA;
    }

    public double getDimensionB() {
        return dimensionB;
    }

    public void setDimensionB(double dimensionB) {
        this.dimensionB = dimensionB;
    }
}
