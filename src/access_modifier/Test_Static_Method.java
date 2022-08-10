package access_modifier;

public class Test_Static_Method {
    public static void main(String[] args) {
        //gọi phương thức thay đổi
        Static_Method.change();
        //Tạo đối tượng
        Static_Method s1 = new Static_Method(1,"Hoang");
        Static_Method s2 = new Static_Method(2,"Hieu");
        Static_Method s3 = new Static_Method(3,"Bui");
        //Gọi phương thức hiển thị
        s1.display();
        s2.display();
        s3.display();
    }
}
