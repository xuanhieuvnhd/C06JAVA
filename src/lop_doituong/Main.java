package lop_doituong;

public class Main {
    public static void main(String[] args) {
    //tất cả các lớp dc tạo ra mặc định có 1 contructor rỗng
        Student hieu = new Student();
        //contructor là phương thức khởi tạo ra đối tượng thuộc lớp đó
        //trùng với tên lớp
        //có thể tạo ra nhiều contructor khác nhau
        //khi thêm contructor có tham số thì contructor rỗng sẽ bị đè
        Student trung = new Student("Trung",172,83,23);
        System.out.println(trung.getBMI());
        System.out.println(trung.toString());
        System.out.println(hieu.toString());
    }
}
