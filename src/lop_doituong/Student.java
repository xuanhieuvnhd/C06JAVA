package lop_doituong;

public class Student {
    private String name;
    private double height;
    private int weight;
    private int age;

    public Student(String name, double height, int weight, int age) {
        this.name = name;
        this.height = height;
        this.weight = weight;
        this.age = age;
    }

    @Override
    public String toString() {
        return "Student{" +
                "name='" + name + '\'' +
                ", height=" + height +
                ", weight=" + weight +
                ", age=" + age +
                '}';
    }

    public Student(String name) {
        this.name = name;
    }

    public Student(int age) {
        this.age = age;
    }

    public Student() {
        this.name = "Ronaldo";
    }
    public double getBMI(){
        double h1 = height/100;
        double bmi = weight/(h1*h1);
        return bmi;
    }
}