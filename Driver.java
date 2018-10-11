public class Driver {
    public static void main(String[] args) {
    Triangle abc = new Triangle(0.0, 0.0, 3.0, 0.0, 0.0, 4.0);

    System.out.println(abc);
    System.out.println("\nPerimeter: " + abc.getPerimeter());

    System.out.println("\nVertices: " + abc.getVertex(0).toString() + ", " + abc.getVertex(1).toString() + ", " + abc.getVertex(1).toString());
  }
}
