package product;
import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        ProductManager manager = new ProductManager();
        Scanner scanner = new Scanner(System.in);

        while (true) {
            System.out.println("\n--- MENU ---");
            System.out.println("1. Thêm sản phẩm");
            System.out.println("2. Sửa sản phẩm theo id");
            System.out.println("3. Xoá sản phẩm theo id");
            System.out.println("4. Hiển thị sản phẩm");
            System.out.println("5. Tìm kiếm sản phẩm theo tên");
            System.out.println("6. Sắp xếp tăng dần theo giá");
            System.out.println("7. Sắp xếp giảm dần theo giá");
            System.out.println("0. Thoát");

            System.out.print("Chọn chức năng: ");
            int choice = scanner.nextInt();
            scanner.nextLine(); // bỏ dòng trống

            switch (choice) {
                case 1 -> {
                    System.out.print("Nhập id: ");
                    int id = scanner.nextInt();
                    scanner.nextLine();
                    System.out.print("Nhập tên: ");
                    String name = scanner.nextLine();
                    System.out.print("Nhập giá: ");
                    double price = scanner.nextDouble();
                    manager.addProduct(new Product(id, name, price));
                }
                case 2 -> {
                    System.out.print("Nhập id cần sửa: ");
                    int id = scanner.nextInt();
                    scanner.nextLine();
                    System.out.print("Tên mới: ");
                    String name = scanner.nextLine();
                    System.out.print("Giá mới: ");
                    double price = scanner.nextDouble();
                    boolean updated = manager.updateProduct(id, name, price);
                    if (!updated) System.out.println("Không tìm thấy sản phẩm.");
                }
                case 3 -> {
                    System.out.print("Nhập id cần xoá: ");
                    int id = scanner.nextInt();
                    if (!manager.removeProduct(id)) {
                        System.out.println("Không tìm thấy sản phẩm.");
                    }
                }
                case 4 -> manager.displayProducts();
                case 5 -> {
                    System.out.print("Nhập tên cần tìm: ");
                    String keyword = scanner.nextLine();
                    for (Product p : manager.searchByName(keyword)) {
                        System.out.println(p);
                    }
                }
                case 6 -> {
                    manager.sortAscendingByPrice();
                    System.out.println("Danh sách đã sắp xếp tăng dần:");
                    manager.displayProducts();
                }
                case 7 -> {
                    manager.sortDescendingByPrice();
                    System.out.println("Danh sách đã sắp xếp giảm dần:");
                    manager.displayProducts();
                }
                case 0 -> {
                    System.out.println("Thoát chương trình.");
                    return;
                }
                default -> System.out.println("Chức năng không hợp lệ.");
            }
        }
    }
}
