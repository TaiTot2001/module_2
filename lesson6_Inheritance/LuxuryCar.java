public class LuxuryCar extends Car {

    public LuxuryCar(){
        System.out.println("Phhuowng thức khoi tạo l=không tham số");
    }
    public LuxuryCar (String name){
        setName(name);
    }
    public void massage(){
        System.out.println("LuxuryCar massage");
    }
    @Override
    public void driving(){
        System.out.println(super.getName()+" Đang chạy rồi nhưng chỉ còn 1 vạch xăng có màu "+super.getColor());;
    }
    @Override
    public String toString(){
        return "Đây là lớp LuxuryCar";
    }
}
