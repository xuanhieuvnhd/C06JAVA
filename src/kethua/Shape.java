package kethua;

public class Shape {
    private String color = "green";
    private boolean filed = true;

    public Shape(String color, boolean filed) {
        this.color = color;
        this.filed = filed;
    }

    public Shape() {
    super();
    }
    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public boolean isFiled() {
        return filed;
    }

    public void setFiled(boolean filed) {
        this.filed = filed;
    }

    @Override
    public String toString() {
        return "A Shape with color of: "
                + getColor()
                + " and "
                +" filled: "  +(isFiled() + ", not filled");
    }
}


