public class StudentAccessModifier {
    public String name = "John";
    public String classes = "CO2";

    StudentAccessModifier() {
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setClasses(String classes) {
        this.classes = classes;
    }
    void display() {
        System.out.println("Name: "+name);
        System.out.println("Classes: "+classes);
    }


    public static void main(String[] args) {
        StudentAccessModifier studentAccessModifier = new StudentAccessModifier();
//        System.out.print("Tên: "+studentAccessModifier.name);
//        System.out.println(", học lớp: "+studentAccessModifier.classes);
            studentAccessModifier.setName("Tài");
            studentAccessModifier.setClasses("JS103HN");
            studentAccessModifier.display();
    }
}
