public class ShapeCalculator {

    public static double calculateArea(Shape shape) {
        if (shape instanceof Rectangle) {
            return ((Rectangle) shape).getDimensionA() * ((Rectangle) shape).getDimensionB();
        } else {
            return Math.PI * Math.pow(((Circle) shape).getRadius(), 2);
        }
    }

    public static double calculatePerimeter(Shape shape) {
        if (shape instanceof Rectangle) {
            return (2 * ((Rectangle) shape).getDimensionA() + 2 * ((Rectangle) shape).getDimensionB());
        } else {
            return 2 * Math.PI * ((Circle) shape).getRadius();
        }
    }
}
