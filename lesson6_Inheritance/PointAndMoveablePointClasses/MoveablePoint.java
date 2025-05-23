package PointAndMoveablePointClasses;

import java.util.Arrays;

public class MoveablePoint extends Point {
    private float xSpeed = 0.0f;
    private float ySpeed = 0.0f;

    public MoveablePoint() {
    }

    public MoveablePoint(float x, float y, float xSpeed, float ySpeed) {
        super(x, y);
        this.xSpeed = xSpeed;
        this.ySpeed = ySpeed;
    }

    public MoveablePoint(float xSpeed, float ySpeed) {
        this.xSpeed = xSpeed;
        this.ySpeed = ySpeed;
    }

    public void setXSpeed(float xSpeed) {
        this.xSpeed = xSpeed;
    }

    public float getXSpeed() {
        return xSpeed;
    }

    public void setYSpeed(float ySpeed) {
        this.ySpeed = ySpeed;
    }

    public float getYSpeed() {
        return ySpeed;
    }

    public void setSpeed(float xSpeed, float ySpeed) {
        this.xSpeed = xSpeed;
        this.ySpeed = ySpeed;
    }

    public float[] getSpeed() {
        return new float[]{xSpeed, ySpeed};
    }

    @Override
    public String toString() {
        return "(" + getX() + "," + getY() + "), speed = ("
                + getXSpeed() + "," + getYSpeed() + ")";
    }

    public MoveablePoint move() {
        setX(getX() + xSpeed);
        setY(getY() + ySpeed);
        return this;
    }

    public static void main(String[] args) {
        MoveablePoint moveablePoint = new MoveablePoint();
        System.out.println(moveablePoint);

        MoveablePoint moveablePoint1 = new MoveablePoint(1, 1, 2, 2);
        System.out.println(moveablePoint1);

        moveablePoint.setXSpeed(3);
        moveablePoint.setYSpeed(3);
        System.out.println(moveablePoint);


        System.out.println(moveablePoint1.getX() + "," + moveablePoint1.getY());
        System.out.println(moveablePoint1.getXSpeed() + "," + moveablePoint1.getYSpeed());
        System.out.println(moveablePoint1.move());
        moveablePoint1.setXSpeed(4);
        System.out.println("Xspeed  = " + moveablePoint1.getXSpeed());
        moveablePoint1.setYSpeed(5);
        System.out.println("Yspeed  = " + moveablePoint1.getYSpeed());
        System.out.println(moveablePoint1.move());


        MoveablePoint moveablePoint2 = new MoveablePoint(10, 10);
        System.out.println(moveablePoint2);
        moveablePoint2.setSpeed(5, 5);
        System.out.println(Arrays.toString(moveablePoint2.getSpeed()));

        Point point = new Point();
        System.out.println("\n"+point);
        point.setXY(9,9);
        System.out.println(Arrays.toString(point.getXY()));


    }
}
