public class Main {
    public static void main(String[] args) {
        Point p1 = new Point(1, 1);
        Point p2 = new Point(5, 1);
        Point p3 = new Point(3, 4);
        
        System.out.println("Вершины треугольника: " + p1 + ", " + p2 + ", " + p3);
        double s = Point.triangleS(p1, p2, p3);
        System.out.println("Площадь треугольника: " + s);
        
        Point3D p3d_1 = new Point3D(0, 0, 0);
        Point3D p3d_2 = new Point3D(3, 0, 0);
        Point3D p3d_3 = new Point3D(0, 4, 0);
        Point3D p3d_4 = new Point3D(0, 0, 5);
        
        System.out.println("Вершины тетраэдра: " + p3d_1 + ", " + p3d_2 + ", " + p3d_3 + ", " + p3d_4);
        double v = Point3D.tetraedorV(p3d_1, p3d_2, p3d_3, p3d_4);
        System.out.println("Объем тетраэдра: " + v);
    }
}