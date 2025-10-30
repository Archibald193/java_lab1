public class Point3D extends Point {
    private int z;

    public Point3D() {
        super();
        this.z = 0;
    }

    public Point3D(int x, int y, int z) {
        super(x, y);
        this.z = z;
    }

    public int getZ() {
        return z;
    }

    public void setLocation(int x, int y, int z) {
        super.setLocation(x, y);
        this.z = z;
    }

    @Override
    public String toString() {
        return "(" + x + "," + y + "," + z + ")";
    }

    @Override
    public double distanceFromOrigin() {
        return Math.sqrt(x * x + y * y + z * z);
    }
    
    public double distance(Point3D other) {
        int dx = this.x - other.getX();
        int dy = this.y - other.getY();
        int dz = this.z - other.getZ();
        return Math.sqrt(dx * dx + dy * dy + dz * dz);
    }

    public boolean isInBox(Point3D corner1, Point3D corner2) {
        int minX = Math.min(corner1.getX(), corner2.getX());
        int maxX = Math.max(corner1.getX(), corner2.getX());
        int minY = Math.min(corner1.getY(), corner2.getY());
        int maxY = Math.max(corner1.getY(), corner2.getY());
        int minZ = Math.min(corner1.getZ(), corner2.getZ());
        int maxZ = Math.max(corner1.getZ(), corner2.getZ());

        return (this.x >= minX && this.x <= maxX && this.y >= minY && this.y <= maxY && this.z >= minZ && this.z <= maxZ);
    }
    
    public boolean isInSphere(Point3D center, double radius) {
        return this.distance(center) <= radius;
    }

    public static double tetraedorV(Point3D p1, Point3D p2, Point3D p3, Point3D p4) {
        int v1x = p1.getX() - p4.getX();
        int v1y = p1.getY() - p4.getY();
        int v1z = p1.getZ() - p4.getZ();
        
        int v2x = p2.getX() - p4.getX();
        int v2y = p2.getY() - p4.getY();
        int v2z = p2.getZ() - p4.getZ();

        int v3x = p3.getX() - p4.getX();
        int v3y = p3.getY() - p4.getY();
        int v3z = p3.getZ() - p4.getZ();
        
        double v = v1x * (v2y * v3z - v3y * v2z) - v1y * (v2x * v3z - v3x * v2z) + v1z * (v2x * v3y - v3x * v2y);
        return Math.abs(v) / 6.0;
    }
}