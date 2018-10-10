class Point {
  double x;
  double y;

  public Point(double x, double y) {
    this.x = x;
    this.y = y;
  }

  public Point(Point temp) {
    x = temp.x;
    y = temp.y;
  }

  public double getX() {
    return x;
  }

  public double getY() {
    return y;
  }

  public double distanceTo(Point other) {
    return Math.sqrt((this.x - x) * (this.x - x) + (this.y - y) * (this.y - y));
  }

  public static double distance(Point a, Point b) {
    return a.distanceTo(b);
  }

  public String toString() {
    return ("(" + x + ", " + y + ")");
  }
}
