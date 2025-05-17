public class Demo {
    public static void main(String[] args) {
//        Person son = new Person("Tai",24);
//        Person daughter = new Person("Truc",22);
//        System.out.println(son.name);
//        System.out.println(daughter.age);
//        System.out.println(son.speak());
//        son.age=16;
//        System.out.println(son.age );
        Customer customer = new Customer(1,"Tai","taia@gmail.com","098472644","10/04/2001",600.0);
        customer.displayInfo();
        customer.isVIP();
        System.out.println("Khách hàng có id =1 có là thành viên vip k: "+customer.isVIP());


        customer.setId(2);
        customer.setName("Trúc");
        customer.setEmail("truc@gmail.com");
        customer.setPhone("016000300");
        customer.setJoinDate("28/05/03");
        customer.setTotalPurchases(60000000.0);
        customer.displayInfo();
        customer.makePurchase(15);
        System.out.println(customer.getTotalPurchases());
        customer.isVIP();
        System.out.println("Khách hàng thân thiết: "+customer.isVIP());


    }
}
