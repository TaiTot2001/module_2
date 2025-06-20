package ProductManagement;

import java.io.*;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class ProductDemo {
    private static final String filePath = "ProductManagement/products2.dat";
    private static final Scanner scanner = new Scanner(System.in);
    private static List<Product> products;

    public static void main(String[] args) {
        products = readDataFromFile();
        System.out.println("======= Product Management ======");
        System.out.println("1. Add Product");
        System.out.println("2. Display All Products");
        System.out.println("3. Search Product");
        System.out.println("0. Exit Program");
        int choice;
        while (true) {
            System.out.println("Enter your choice: ");
            choice = Integer.parseInt(scanner.nextLine());
            switch (choice) {
                case 1:
                    addProduct();
                    break;
                case 2:
                    displayProduct();
                    break;
                case 3:
                    searchProduct();
                    break;
                case 0:
                    System.out.println("Goodbye!");
                    return;
                default:
                    System.out.println("Invalid choice!");
            }

        }
    }

    private static void searchProduct() {
        int quantity = 0;
        boolean foundProduct = false;
        System.out.println("Enter product name: ");
        String productName = scanner.nextLine();
        printHeader();
        for (Product product : products) {
            if (product.getName().equalsIgnoreCase(productName)) {
                quantity += 1;
                System.out.println(product);
                foundProduct = true;
            }

        }
        if (foundProduct) {
            System.out.println("Successfully found " + quantity + " products name \"" + productName + "\" !");
        } else {
            System.out.println("❌ Product not found !");
        }
    }

    private static void displayProduct() {
        if (products.isEmpty()) {
            System.out.println("No products available!");
        }
        printHeader();
//        List<Product> listProducts = readDataFromFile();
        for (Product product : products) {
            System.out.println(product);
        }
    }

    private static void printHeader() {
        System.out.println("--------------------- List of Products ----------------------");
        System.out.printf("%-10s %-10s %-10s %-15s %-10s\n", "code", "name", "price", "manufacturer", "description");
    }

    private static void addProduct() {
        System.out.println("Enter product code: ");
        String code = scanner.nextLine();
        System.out.println("Enter product name: ");
        String name = scanner.nextLine();
        System.out.println("Enter product price: ");
        double price = Double.parseDouble(scanner.nextLine());
        System.out.println("Enter product manufacturer: ");
        String manufacturer = scanner.nextLine();
        System.out.println("Enter product description: ");
        String description = scanner.nextLine();
        Product newProducts = new Product(code, name, price, manufacturer, description);
        products.add(newProducts);
        writeDataToFile(products);
        System.out.println("Product added successfully!");

    }

    public static void writeDataToFile(List<Product> products) {
        try {
            ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream(filePath));
            oos.writeObject(products);
            oos.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
    private static List<Product> readDataFromFile() {
        File file = new File(filePath);
        if (!file.exists()) {
            return new ArrayList<>();
        }
        try (ObjectInputStream ois = new ObjectInputStream(new FileInputStream(file))) {
            return (List<Product>) ois.readObject();
        } catch (IOException | ClassNotFoundException e) {
            e.printStackTrace();
            return new ArrayList<>();
        }
    }
}
