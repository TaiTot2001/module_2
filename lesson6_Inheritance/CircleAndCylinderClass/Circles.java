package CircleAndCylinderClass;

public class Circles {
    private double radius=1.0;
    private String color="Green";
    public Circles(){}
    public Circles(double radius){
        this.radius=radius;
    }
    public Circles(double radius, String color) {
        this.radius = radius;
        this.color = color;
    }
    public double getRadius() {
        return radius;
    }
    public void setRadius(double radius) {
        this.radius = radius;
    }
    public String getColor() {
        return color;
    }
    public void setColor(String color) {
        this.color = color;
    }
    public double getArea() {
        return Math.PI * radius * radius;
    }

    @Override
    public String toString() {
        return "Hình tròn : Bán kính "+ radius+ ", Diện tích là "+ getArea()+ " và Tô màu "+color;
    }
}
