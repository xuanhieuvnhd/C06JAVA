package access_modifier;

public class Student {
    private String name = "John";
    private String classes = "C06";

    public Student() {
    }

    public void setName(String name) {
        this.name = name;
    }
    public String setName(){
        return name;
    }

    public void setClasses(String classes) {
        this.classes = classes;
    }
    public String setClasses(){
        return classes;
    }
}
