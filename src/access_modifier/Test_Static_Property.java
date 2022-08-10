package access_modifier;

public class Test_Static_Property {
    public static void main(String[] args) {
        Static_Property p1= new Static_Property("Drema","2 xi lanh");
        System.out.println("Loai xe: "+Static_Property.numberOfCars);
        Static_Property p2 = new Static_Property("Yamaha","3 xi lanh");
        System.out.println("Loai xe: "+Static_Property.numberOfCars);
    }
}
