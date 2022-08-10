package lop_doituong;

public class Fan {
    private final int SLOW = 1;
    private final int MEDIUM = 2;
    private final int FAST = 3;
    private int speed = 1;
    private boolean on = false;
    private String color = "Mau den";
    private double radius = 5;

    public Fan() {
    }
    public int getSLOW() {
        return SLOW;
    }

    public int getMEDIUM() {
        return MEDIUM;
    }

    public int getFAST() {
        return FAST;
    }

    public int getSpeed() {
        return speed;
    }

    public boolean isOn() {
        return on;
    }

    public String getColor() {
        return color;
    }

    public double getRadius() {
        return radius;
    }

    public void setSpeed(int speed) {
        this.speed = speed;
    }

    public void setOn(boolean on) {
        this.on = on;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }

    public Fan(int speed, boolean on, String color, double radius) {
        this.speed = speed;
        this.on = on;
        this.color = color;
        this.radius = radius;
    }

    @Override
    public String toString() {
        String state = "";
        if (this.isOn()) {
            state += ("-----------------------\nQuat dang duoc bat\n");
            state += ("Toc do: " + this.speed + "\n");
        } else {
            state += ("Quat da tat\n");
        }
        state += ("Mau sac: " + this.color + "\n");
        state += ("Ban kinh: " + this.radius + " cm\n---------------------------\n");
        return state;
    }

    public static void main(String[] args) {
        Fan fan1 = new Fan(5, true, "Mau xanh la cay", 20);
        Fan fan2 = new Fan(10, false, "Mau do", 30);
        System.out.println(fan1.toString());
        System.out.println(fan2.toString());
    }
}
