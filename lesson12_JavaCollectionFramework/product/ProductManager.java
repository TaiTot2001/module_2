package product;
import java.util.*;
public class ProductManager {
    private final List<Product> productList = new LinkedList<>();

    // Thêm sản phẩm
    public void addProduct(Product product) {
        productList.add(product);
    }

    // Sửa thông tin sản phẩm theo id
    public boolean updateProduct(int id, String newName, double newPrice) {
        for (Product p : productList) {
            if (p.getId() == id) {
                p.setName(newName);
                p.setPrice(newPrice);
                return true;
            }
        }
        return false;
    }

    // Xoá sản phẩm theo id
    public boolean removeProduct(int id) {
        return productList.removeIf(p -> p.getId() == id);
    }

    // Hiển thị danh sách sản phẩm
    public void displayProducts() {
        for (Product p : productList) {
            System.out.println(p);
        }
    }

    // Tìm kiếm theo tên
    public List<Product> searchByName(String keyword) {
        List<Product> result = new ArrayList<>();
        for (Product p : productList) {
            if (p.getName().toLowerCase().contains(keyword.toLowerCase())) {
                result.add(p);
            }
        }
        return result;
    }

    // Sắp xếp tăng dần theo giá
    public void sortAscendingByPrice() {
        productList.sort(Comparator.comparingDouble(Product::getPrice));
    }

    // Sắp xếp giảm dần theo giá
    public void sortDescendingByPrice() {
        productList.sort((p1, p2) -> Double.compare(p2.getPrice(), p1.getPrice()));
    }
}
