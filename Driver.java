public class Driver {
    public static void main(String[] args) {
    Triangle abc = new Triangle(0, 0, 3, 0, 0, 4);

    System.out.println(abc);
    System.out.println("\nPerimeter: " + abc.getPerimeter());

    System.out.println("\nVertices: " + abc.getVertex(0) + ", " + abc.getVertex(1) + ", " + abc.getVertex(1));

    abc.setVertex(0, new Point(1, 1));

    System.out.println("\nVertex A moved to " + abc.getVertex(0));

    System.out.println("New Perimeter: " + abc.getPerimeter());
  }
}
