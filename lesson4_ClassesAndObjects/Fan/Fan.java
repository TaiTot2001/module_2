package Fan;

public class Fan {
    // Hằng số tốc độ
    public static final int SLOW = 1;
    public static final int MEDIUM = 2;
    public static final int FAST = 3;

    // Thuộc tính
    private int speed;
    private boolean on;
    private double radius;
    private String color;

    // Constructor không tham số
    public Fan() {
        this.speed = SLOW;
        this.on = false;
        this.radius = 5;
        this.color = "blue";
    }

    // Getter và Setter
    public int getSpeed() {
        return speed;
    }

    public void setSpeed(int speed) {
        this.speed = speed;
    }

    public boolean isOn() {
        return on;
    }

    public void setOn(boolean on) {
        this.on = on;
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

    // Phương thức toString
    @Override
    public String toString() {
        if (on) {
            return "Fan is on - Speed: " + speed + ", Color: " + color + ", Radius: " + radius;
        } else {
            return "Fan is off - Color: " + color + ", Radius: " + radius;
        }
    }
}
