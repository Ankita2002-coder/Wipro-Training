package Day1;
 public class AreaPerimeter {
    public static void main(String[] args) {
        if (args.length < 2) {
            System.out.println("Please provide length and breadth.");
            return;
        }

        double length = Double.parseDouble(args[0]);
        double breadth = Double.parseDouble(args[1]);

        System.out.println("Area of Triangle: " + (0.5 * length * breadth));
        System.out.println("Area of Square: " + (length * length));
        System.out.println("Area of Rectangle: " + (length * breadth));
        System.out.println("Perimeter of Square: " + (4 * length));
        System.out.println("Perimeter of Rectangle: " + (2 * (length + breadth)));
    }
}
