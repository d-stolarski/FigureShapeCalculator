public class CalculatorTest {
    public static void main(String[] args) {

        Rectangle rectangle = new Rectangle(5, 10);
        Circle circle = new Circle(10);

        System.out.printf("Pole prostokąta o bokach %.1f, %.1f wynosi %.1f", rectangle.getDimensionA(), rectangle.getDimensionB(),
                ShapeCalculator.caclculateRectangleArea(rectangle));
        System.out.printf("\nObwód prostokąta o bokach %.1f, %.1f wynosi %.1f", rectangle.getDimensionA(), rectangle.getDimensionB(),
                ShapeCalculator.calculateRectanglePerimeter(rectangle));
        System.out.printf("\nPole koła o promieniu %.1f wynosi %.1f", circle.getRadius(),
                ShapeCalculator.calculateCircleArea(circle));
        System.out.printf("\nObwód koła o promieniu %.1f wynosi %.1f", circle.getRadius(),
                ShapeCalculator.calculateCirclePerimeter(circle));
    }
}
