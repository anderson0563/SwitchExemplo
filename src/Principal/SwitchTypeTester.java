package Principal;

public class SwitchTypeTester {
    record Point(int x, int y) { }
    enum Color { RED, GREEN, BLUE }

    public void typeTester(Object obj) {
        switch (obj) {
            case null -> System.out.println("null");
            case String s -> System.out.println("String");
            case Color c -> System.out.println("Color with " +  c + " values");
            case Point p -> System.out.println("Record class: " + p);
            case int[] ia -> System.out.println("Array of int values of length " + ia.length);
            default -> System.out.println("Something else");
        }
    }

    public static void main(String[] args) {
        (new SwitchTypeTester()).typeTester(null);
        (new SwitchTypeTester()).typeTester("Testando com String");
        (new SwitchTypeTester()).typeTester(Color.RED);
        (new SwitchTypeTester()).typeTester(new Point(10,10));
        int[] a = {1, 2, 3, 4, 5};
        (new SwitchTypeTester()).typeTester(a);
        (new SwitchTypeTester()).typeTester(3.14);

    }
}
