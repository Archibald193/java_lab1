public class Point {
    protected int x;
    protected int y;

    public Point() {
        this.x = 0;
        this.y = 0;
    }

    public Point(int x, int y) {
        this.x = x;
        this.y = y;
    }

    public int getX() {
        return x;
    }
    public int getY() {
        return y;
    }

    public void setLocation(int x, int y) {
        this.x = x;
        this.y = y;
    }

    @Override
    public String toString() {
        return "(" + x + "," + y + ")";
    }

    public double distanceFromOrigin() {
        return Math.sqrt(x * x + y * y);
    }
    
    public double distance(Point other) {
        int dx = this.x - other.x;
        int dy = this.y - other.y;
        return Math.sqrt(dx * dx + dy * dy);
    }
    
    public boolean isInRectangle(Point top_left, Point bottom_right) {
        return (this.x >= top_left.getX() && this.x <= bottom_right.getX() &&
                this.y >= top_left.getY() && this.y <= bottom_right.getY());
    }

    public boolean isInCircle(Point center, double radius) {
        return this.distance(center) <= radius;
    }
    
    public static double triangleS(Point p1, Point p2, Point p3) {
        double s = 0.5 * Math.abs(p1.getX() * (p2.getY() - p3.getY()) + p2.getX() * (p3.getY() - p1.getY()) + p3.getX() * (p1.getY() - p2.getY()));
        return s;
    }
}