package lop_doituong;

import java.util.Scanner;

public class Rectangle {
    double width, height;
    public Rectangle() {
    }
    public Rectangle(double width, double height) {
        this.width = width;
        this.height = height;
    }
    public double getArea() {
        return this.width * this.height;
    }
    public double getPerimeter() {
        return (this.width + this.height) * 2;
    }
    public String display() {
        return "Rectangle{" + "width=" + width + ", height=" + height + "}";
    }

    @Override
    public String toString() {
        return "Rectangle{" +
                "width=" + width +
                ", height=" + height +
                '}';
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Nhap chieu rong :");
        double width = scanner.nextDouble();
        System.out.print("Nhap chieu dai:");
        double height = scanner.nextDouble();
        Rectangle rectangle = new Rectangle(width,height);
        System.out.println("Hinh chu nhat cua ban \n"+ rectangle.display());
        System.out.println("Chu vi hinh chu nhat: "+ rectangle.getPerimeter());
        System.out.println("Dien tich hinh chu nhat: "+ rectangle.getArea());
        //Phương thức ghi đè Override
        System.out.println(rectangle.toString());
    }
}
