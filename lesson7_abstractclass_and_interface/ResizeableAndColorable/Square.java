package ImplementTheResizeableInterFaceForGeometryClasses;

public  class Square extends Rectangle implements Resizeable, Colorable {
    public Square() {
    }

    public Square(double side) {
        super(side, side);
    }

    public Square(double side, String color, Boolean isFilled) {
        super(side, side, color, isFilled);
    }

    public double getSide() {
        return getWidth();
    }

    public void setSide(double side) {
        setWidth(side);
        setLength(side);
    }

    @Override
    public void setWidth(double width) {
        super.setWidth(width);
        super.setLength(width);
    }

    @Override
    public void setLength(double length) {
        super.setLength(length);
        super.setWidth(length);
    }

    @Override
    public void resize(double percent) {
        setSide(getSide() + getSide() * percent / 100);
    }

    @Override
    public String toString() {
        return "A Square with side=" + getSide() + ", which is a subclass of " + super.toString();
    }
    @Override
    public void howToColor() {
        System.out.println("Color all four sides.");
    }
}
