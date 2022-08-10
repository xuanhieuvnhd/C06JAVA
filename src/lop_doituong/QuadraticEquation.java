package lop_doituong;

import java.util.Scanner;

public class QuadraticEquation {
    private double a,b,c;

    public QuadraticEquation() {
    }

    public QuadraticEquation(double a, double b, double c) {
        this.a = a;
        this.b = b;
        this.c = c;
    }

    public double getA() {
        return a;
    }

    public double getB() {
        return b;
    }

    public double getC() {
        return c;
    }

    public double getDiscriminant(){
        return b*b-4*a*c;
    }

    public double getRoot1(){
        if(this.getDiscriminant()<0) return 0;
        return ((-b+Math.sqrt(this.getDiscriminant()))/(2*a));
    }

    public double getRoot2(){
        if(this.getDiscriminant()<0) return 0;
        return ((-b-Math.sqrt(this.getDiscriminant()))/(2*a));
    }
    public static void main(String[] args) {
        double a,b,c;
        Scanner scanner = new Scanner(System.in);
        System.out.print("Nhap vao a: ");
        a = scanner.nextDouble();
        System.out.print("Nhap vao b: ");
        b= scanner.nextDouble();
        System.out.print("Nhap vao c: ");
        c = scanner.nextDouble();
        QuadraticEquation qe = new QuadraticEquation(a, b, c);
        if(qe.getDiscriminant()<0) System.out.println("Phuong trinh vo nghiem");
        else if(qe.getDiscriminant()==0) System.out.println("Phuong trinh co mot nghiem: "+qe.getRoot1());
        else{
            System.out.println("Phuong trinh co hai nghiem: ");
            System.out.println("Denta la: "+qe.getDiscriminant());
            System.out.println("Nghiem 1 la: "+qe.getRoot1());
            System.out.println("Nghiem 2 la: "+qe.getRoot2());
        }
    }
}
