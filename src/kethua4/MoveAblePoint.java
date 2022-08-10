package kethua4;

public class MoveAblePoint extends Point{
    private float xSpeed = 0;
    private float ySpeed = 0;


    public MoveAblePoint(float x, float y, float xSpeed, float ySpeed) {
        super(x, y);
        this.xSpeed = xSpeed;
        this.ySpeed = ySpeed;
    }

    public MoveAblePoint() {
    }

    public MoveAblePoint(float[] a) {
        super(a[0], a[1]);
    }

    public MoveAblePoint(float xSpeed, float ySpeed) {
        this.xSpeed = xSpeed;
        this.ySpeed = ySpeed;
    }

    public float getxSpeed() {
        return xSpeed;
    }

    public void setxSpeed(float xSpeed) {
        this.xSpeed = xSpeed;
    }

    public float getySpeed() {
        return ySpeed;
    }

    public void setySpeed(float ySpeed) {
        this.ySpeed = ySpeed;
    }

    public Point move() {
        this.setX(this.getX() + this.xSpeed);
        this.setY(this.getY() + this.ySpeed);
        return this;
    }

    public void setSpeed(float xSpeed, float ySpeed) {
        this.xSpeed = xSpeed;
        this.ySpeed = ySpeed;
    }

    public float[] getSpeed() {
        float[] out = {this.xSpeed, this.ySpeed};
        return out;
    }

    @Override
    public String toString() {
        return "MoveAblePoint{" +
                "xSpeed=" + xSpeed +
                ", ySpeed=" + ySpeed +
                '}';
    }
}
