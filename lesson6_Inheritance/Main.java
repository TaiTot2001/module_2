public class Main {
    public static void main(String[] args) {
//        LuxuryCar luxuryCar = new LuxuryCar("Lexus");
//        luxuryCar.massage();
//        luxuryCar.driving();
//        System.out.println(luxuryCar.getColor());
//        System.out.println(luxuryCar.getName());
//        Car vin1 = new Car();
//        vin1.setName("VF5");
//        vin1.setColor("Red");
//        System.out.println("\n"+vin1.getName()+" "+ vin1.getColor());
//        vin1.driving();
        LuxuryCar luxuryCar = new LuxuryCar("Lexus");
        luxuryCar.driving();
        System.out.println(luxuryCar.toString());
        Car vios = new Car("Vios", "White");
        System.out.println(vios.toString());

    }
}
