public class CalculatorTest {
    public static void main(String[] args) {

        Shape[] shapes = new Shape[4];

        shapes[0] = new Rectangle(5, 10);
        shapes[1] = new Circle(10);
        shapes[2] = new Rectangle(3, 5);
        shapes[3] = new Circle(12);

        System.out.printf("Pole prostokąta o bokach %.1f i %.1f wynosi %.1f", ((Rectangle) shapes[0]).getDimensionA(),
                ((Rectangle) shapes[0]).getDimensionB(), ShapeCalculator.calculateArea((shapes[0])));
        System.out.printf("\nObwód prostokąta o bokach %.1f i %.1f wynosi %.1f", ((Rectangle) shapes[0]).getDimensionA(),
                ((Rectangle) shapes[0]).getDimensionB(), ShapeCalculator.calculatePerimeter(shapes[0]));

        System.out.printf("\nPole koła o promieniu %.1f wynosi %.1f", ((Circle) shapes[1]).getRadius(),
                ShapeCalculator.calculateArea((Circle) shapes[1]));
        System.out.printf("\nObwód koła o promieniu %.1f wynosi %.1f", ((Circle) shapes[1]).getRadius(),
                ShapeCalculator.calculatePerimeter((Circle) shapes[1]));

        System.out.printf("\nPole prostokąta o bokach %.1f i %.1f wynosi %.1f", ((Rectangle) shapes[2]).getDimensionA(),
                ((Rectangle) shapes[2]).getDimensionB(), ShapeCalculator.calculateArea(shapes[2]));
        System.out.printf("\nObwód prostokąta o bokach %.1f i %.1f wynosi %.1f", ((Rectangle) shapes[2]).getDimensionA(),
                ((Rectangle) shapes[2]).getDimensionB(), ShapeCalculator.calculatePerimeter(shapes[2]));

        System.out.printf("\nPole koła o promieniu %.1f wynosi %.1f", ((Circle) shapes[3]).getRadius(),
                ShapeCalculator.calculateArea(shapes[3]));
        System.out.printf("\nObwód koła o promieniu %.1f wynosi %.1f", ((Circle) shapes[3]).getRadius(),
                ShapeCalculator.calculatePerimeter(shapes[3]));
    }
}
