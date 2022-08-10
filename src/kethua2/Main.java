package kethua2;

public class Main {
    public static void main(String[] args) {
        //Mã kiểm thử lớp Circle
        Circle circle = new Circle();
        circle.setRadius(2);
        System.out.println("Area circle: " + circle.getArea());
        //Mã kiểm thử lớp Cylinder
        Cylinder cylinder = new Cylinder(circle.getRadius(),circle.getColor(),4);
        System.out.println("Total is: "+cylinder.getTotalArea());
    }
}
