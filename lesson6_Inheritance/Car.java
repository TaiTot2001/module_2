public class Car {
    public Car(){
        System.out.println("Phương thức khởi tạo k tham số của lớp cha được gọi");
    }
    public Car(String name,String color){
        setName(name);
        setColor(color);

    }
    private String color="green";
    private String name="Car";
    public  void driving(){
        System.out.println("Car driving");
    }
    public String getColor() {
        return color;
    }
    public void setColor(String color) {
        this.color = color;
    }
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
