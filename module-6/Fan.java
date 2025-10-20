/* 
Name: Madilyn Carpenter
Date: 10/19/2025
Assignment 6
Purpose: Model a fan with adjustable speed, power state, size, and color, and provide a description of its current state.
*/

public class Fan {
    public static final int STOPPED = 0;
    public static final int SLOW = 1;
    public static final int MEDIUM = 2;
    public static final int FAST = 3;

    private int speed;
    private boolean on;
    private double radius;
    private String color;

    // default values
    public Fan() {
        this.speed = STOPPED;
        this.on = false;
        this.radius = 6.0;
        this.color = "white";
    }

    public Fan(int speed, boolean on, double radius, String color) {
        this.speed = speed;
        this.on = on;
        this.radius = radius;
        this.color = color;
    }

    // Getter's and Setter's
    public int getSpeed() {
        return speed;
    }

    public void setSpeed(int speed) {
        if (speed >= STOPPED && speed <= FAST) {
            this.speed = speed;
        } else {
            System.out.println("Invalid speed value. Must be 0-3.");
        }
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
        if (radius > 0) {
            this.radius = radius;
        } else {
            System.out.println("Radius must be positive.");
        }
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    @Override
    public String toString() {
        if (on) {
            return "Fan is on. Speed: " + speed + ", Color: " + color + ", Radius: " + radius;
        } else {
            return "Fan is off. Color: " + color + ", Radius: " + radius;
        }
    }

    // Test code
    public static void main(String[] args) {
        Fan fan1 = new Fan();
        System.out.println("Fan 1: " + fan1);

        Fan fan2 = new Fan(Fan.FAST, true, 10, "blue");
        System.out.println("Fan 2: " + fan2);

        fan1.setOn(true);
        fan1.setSpeed(Fan.MEDIUM);
        fan1.setRadius(8);
        fan1.setColor("yellow");

        System.out.println("After updating Fan 1:");
        System.out.println("Speed: " + fan1.getSpeed());
        System.out.println("On: " + fan1.isOn());
        System.out.println("Radius: " + fan1.getRadius());
        System.out.println("Color: " + fan1.getColor());
        System.out.println(fan1);
    }
}
