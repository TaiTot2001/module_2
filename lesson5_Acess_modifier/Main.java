public class Main {
    public static void main(String[] args) {
        Student.change();
        Student student1= new Student(1,"Tài");
        Student student2= new Student(2,"Trúc");
        Student student3= new Student(3,"Thịnh");
        Student student4= new Student(4,"Tú");
        student1.display();
        student2.display();
        student3.display();
        student4.display();
    }
}

