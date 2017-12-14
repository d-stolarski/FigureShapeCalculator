public class ShapeCalculator {

    public static double caclculateRectangleArea(Rectangle rectangle){
        return rectangle.getDimensionA() * rectangle.getDimensionB();
    }

    public static double calculateRectanglePerimeter(Rectangle rectangle){
        return (2 * rectangle.getDimensionA() + 2 * rectangle.getDimensionB());
    }

    public static double calculateCircleArea(Circle circle){
        return Math.PI * Math.pow(circle.getRadius(), 2);
    }

    public static double calculateCirclePerimeter(Circle circle){
        return 2 * Math.PI * circle.getRadius();
    }
}
