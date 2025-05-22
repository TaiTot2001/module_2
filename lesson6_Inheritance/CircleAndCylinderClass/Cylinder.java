package CircleAndCylinderClass;

public class Cylinder extends Circles {
    private double height = 2.0;
    public Cylinder() {}
    public Cylinder(double radius, double height) {
        super(radius);
        this.height = height;
    }
    public Cylinder(double radius, String color, double height) {
        super(radius, color);
        this.height = height;
    }
    public double getHeight() {
        return height;
    }
    public void setHeight(double height) {
        this.height = height;
    }
    public double getVolume() {
        return getArea()*height;
    }

    @Override
    public String toString() {
        return "Hình trụ:\n[\nChiều cao là "+ getHeight()
                +",\nĐáy là " + super.toString()+"\nThể tích: "+getVolume()+"\n]";

    }

    public static void main(String[] args) {
        Cylinder c = new Cylinder();
        System.out.println(c);
        Cylinder c1 = new Cylinder(3.0, "Red", 4.0);
        c1.setColor("Blue");
        c1.setHeight(5.0);
        System.out.println(c1);

        Cylinder c2 = new Cylinder(3.0, 4.0);
        System.out.println(c2);
    }
}
