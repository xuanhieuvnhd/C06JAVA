package kethua;

public class Square extends Rectangle{
    private double side;
    public Square() {
    }

    public Square(double side) {
        super(side, side);
    }

    public Square(String color, boolean filed, double width, double length, double side) {
        super(color, filed, width, length);
        this.side = side;
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
        setSide(width);
    }

    @Override
    public void setLength(double length) {
        setSide(length);
    }

    @Override
    public String toString() {
        return "A Square with side="
                + getSide()
                + ", which is a subclass of "
                + super.toString();
    }
}

