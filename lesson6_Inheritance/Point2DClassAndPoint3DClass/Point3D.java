package Point2DClassAndPoint3DClass;

public class Point3D extends Point2D {
    private float z = 0.0f;

    public Point3D(float x, float y, float z) {
        super(x, y);
        this.z = z;
    }

    public Point3D() {
    }

    public float getZ() {
        return z;
    }

    public void setZ(float z) {
        this.z = z;
    }

    public void setXYZ(float x, float y, float z) {
        setX(x);
        setY(y);
        setZ(z);
    }

    public float[] getXYZ() {
        return new float[]{getX(), getY(), getZ()};
    }

    @Override
    public String toString() {
        return "(" + getX() + ", " + getY() + ", " + getZ() + ")";
    }

    public static void main(String[] args) {
        Point3D point3D = new Point3D();
        System.out.println(point3D);
        Point3D p = new Point3D(3, 4, 5);
        System.out.println(p);
        System.out.println(p.getX());
        System.out.println(p.getY());
        System.out.println(p.getZ());
        p.setXYZ(4, 5, 6);
        System.out.println(p);
        p.setXYZ(5, 6, 7);
        System.out.println(p);
        float[] coords = p.getXYZ();
        System.out.println("(" + coords[0] + ", " + coords[1] + ", " + coords[2] + ")");
        System.out.println(p.getX());
        System.out.println(p.getY());
        System.out.println("\n");

        Point2D point2D = new Point2D();
        System.out.println(point2D);
        point2D.setXY(2, 4);
        System.out.println(point2D);
        point2D.setXY(5,9);
        point2D.setY(10);
        float[] tempXY = point2D.getXY();
        System.out.println(tempXY[0] +" , "+tempXY[1]);
    }
}

