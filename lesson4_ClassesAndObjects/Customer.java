public class Customer {
    private int id;
    private String name;
    private String email;
    private String phone;
    private String joinDate;
    private double totalPurchases;

    public Customer() {
    }

    public Customer(String name) {
        this.name = name;
    }

    public Customer(String name,String email, String phone) {
        this.name = name;
        this.email = email;
        this.phone = phone;
    }

    public Customer(int id, String name, String email, String phone, String joinDate, double totalPurchases) {
        this.id = id;
        this.name = name;
        this.email = email;
        this.phone = phone;
        this.joinDate = joinDate;
        this.totalPurchases = totalPurchases;

    }
    public int getId() {
        return id;
    }
    public void setId(int id) {
        this.id = id;
    }
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    public String getEmail() {
        return email;
    }
    public void setEmail(String email) {
        this.email = email;
    }
    public String getPhone() {
        return phone;
    }
    public void setPhone(String phone) {
        this.phone = phone;
    }
    public String getJoinDate() {
        return joinDate;
    }
    public void setJoinDate(String joinDate) {
        this.joinDate = joinDate;
    }
    public double getTotalPurchases() {
        return totalPurchases;
    }
    public void setTotalPurchases(double amount) {
        this.totalPurchases = amount;
    }
    public void makePurchase(double amount) {
        this.totalPurchases += amount;
    }
    public void displayInfo() {
        System.out.println("id: "+ getId());
        System.out.println("Name: " + getName());
        System.out.println("Email: " + getEmail());
        System.out.println("Phone: " + getPhone());
        System.out.println("Join Date: " + getJoinDate());
        System.out.println("Total Purchases: " + getTotalPurchases());

    }
    public boolean isVIP(){
        return this.totalPurchases > 5000000;
    }
}
