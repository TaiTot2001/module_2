public class Rectangle extends Shape {
    private double length = 1.0;
    private double width = 1.0;

    public Rectangle() {
    }

    public Rectangle(double length, double width) {
        this.length = length;
        this.width = width;
    }
    public Rectangle(double length, double width, String color, boolean filled) {
        super(color, filled);
        this.length = length;
        this.width = width;
    }
    public double getWidth() {
        return width;
    }
    public void setWidth(double width) {
        this.width = width;
    }
    public double getLength() {
        return length;
    }
    public void setLength(double length) {
        this.length = length;
    }
    public double getArea() {
        return length * width;
    }
    public double getPerimeter() {
        return 2*(width+ this.length);
    }
    @Override
    public String toString() {
        return "A Rectangle with width= "+ getWidth()
                + " and length= " + getLength()
                +", which is a subclass of "
                + super.toString();
    }

    public static void main(String[] args) {
        Rectangle rectangle = new Rectangle();
        System.out.println(rectangle);
        rectangle = new Rectangle(5.8,2.3 );
        System.out.println(rectangle);
        rectangle = new Rectangle(3.8,2.5,"orange",true);
        System.out.println(rectangle);
    }
}