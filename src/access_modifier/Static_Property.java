package access_modifier;

public class Static_Property {
    private String name;
    private String engine;
    public static int numberOfCars;

    public Static_Property(String name, String engine) {
        this.name = name;
        this.engine = engine;
        numberOfCars++;
    }
}
