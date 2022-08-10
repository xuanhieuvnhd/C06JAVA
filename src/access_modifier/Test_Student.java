package access_modifier;

public class Test_Student {
    public static void main(String[] args) {
        Student student = new Student();
        System.out.println("Ho va ten sinh vien: "+student.setName());
        System.out.println("Lop: "+student.setClasses());
    }
}