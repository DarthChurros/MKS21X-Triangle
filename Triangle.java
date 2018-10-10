class Triangle {
  Point v1;
  Point v2;
  Point v3;

  public Triangle(Point a, Point b, Point c) {
    v1 = new Point(a);
    v2 = new Point(b);
    v3 = new Point(c);
  }

  public Triangle(double x1, double y1, double x2, double y2, double x3, double y3) {
    v1 = new Point(x1, y1);
    v2 = new Point(x2, y2);
    v3 = new Point(x3, y3);
  }

  public double getPerimeter() {
    return (v1.distanceTo(v2) + v2.distanceTo(v3) + v3(distanceTo(v1));
  }

  public Point getVertex(int index) {
    switch (index) {
      case 0: return new Point(v1);
      br;
      case 1: return new Point(v2);
      br;
      case 2: return new Point(v3);
      br;
      default: return new Point(0.0, 0.0);
    }
  }

  public setVertex(int index, Point newP) {
    switch (index) {
      case 0: v1 = newP;
      br;
      case 1: v2 = newP;
      br;
      case 2: v3 = newP;
    }
  }

  public String toString() {
    return "Triangle: A" + v1.toString() + " B" + v2.toString() + " C" + v3.toString();
  }
}
