package access_modifier;

public class Static_Method {
    private int rollno;
    private String name;
    private static String college = "BBDIT";

    //Hàm khởi tạo biến
    Static_Method(int r, String n) {
        rollno = r;
        name = n;
    }
    //phương thức static để thay đổi giá trị của biến static
    static void change() {
        college = "CODEGYM";
    }
    //phương thức hiển thị giá trị
    void display() {
        System.out.println(rollno + " " + name + " " + college);
    }
}
