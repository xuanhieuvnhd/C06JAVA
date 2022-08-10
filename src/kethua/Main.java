package kethua;

public class Main {
    public static void main(String[] args) {
        //Chạy thử Square
        Square square = new Square();
        System.out.println(square);
        square = new Square(2.3);
        System.out.println(square);
        square = new Square("red",true,6.5,6.9,6.9);
        System.out.println(square);
        //Chạy thử Rectangle
        Rectangle rectangle = new Rectangle();
        System.out.println(rectangle);
        rectangle = new Rectangle(6.8,5.6);
        System.out.println(rectangle);
        rectangle = new Rectangle("Green",true,5.4,4.2);
        System.out.println(rectangle);
        //Chạy kiểm thử Cicle
        Cricle cricle = new Cricle();
        System.out.println(cricle);
        cricle = new Cricle(4.6);
        System.out.println(cricle);
        cricle = new Cricle("Blue",true,4.8);
        //Chạy  kiểm thử Shape
        Shape shape = new Shape();
        System.out.println(shape);
        shape = new Shape("Red",true);
    }
}
