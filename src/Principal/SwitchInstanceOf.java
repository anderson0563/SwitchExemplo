package Principal;

public class SwitchInstanceOf {
    public static double getPerimeter(Shape shape) throws IllegalArgumentException {
        return switch (shape) {
            case Rectangle r -> 2 * r.length() + 2 * r.width();
            case Circle c -> 2 * c.radius() * Math.PI;
            default -> throw new
                    IllegalArgumentException("Unrecognized shape"); };
    }
    public void exemplo(){
        System.out.println(getPerimeter(new Rectangle(10,10)));
        System.out.println(getPerimeter(new Circle(10)));

    }
    public static void main(String[] args) {
        (new SwitchInstanceOf()).exemplo();
    }
}

interface Shape { }
record Rectangle(double length, double width) implements Shape { }
record Circle(double radius) implements Shape { }
