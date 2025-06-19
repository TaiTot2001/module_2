package CountryCSV;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class CountryDemo {
    public static final List<Country> countries = new ArrayList<>();

    public static void main(String[] args) {
        loadCountriesFromFile();
        System.out.println("========Danh sách quốc gia========");
        System.out.println("1. Danh sách quốc gia.");
        System.out.println("2. Thêm quốc gia.");
        System.out.println("3. Sửa quốc gia.");
        System.out.println("4. Xóa quốc gia.");
        System.out.println("5. Tìm kiếm quốc gia.");
        System.out.println("0. Exit.");
        Scanner scanner = new Scanner(System.in);
        int choice;
        while (true) {
            System.out.print("\nNhập vào lựa chọn của bạn: ");
            choice = Integer.parseInt(scanner.nextLine());
            switch (choice) {
                case 1:
                    displayCountry();
                    break;
                case 2:
                    addCountry();
                    break;
                case 3:
                    editCountry();
                    break;
                case 4:
                    deleteCountry();
                    break;
                case 5:
                    findCountry();
                    break;
                case 0:
                    System.out.println("Cảm ơn bạn đã sử dụng ứng dụng !!!!!");
                    return;
                default:
                    System.out.println("Lựa chọn không hợp lệ, vui lòng chọn lại!");

            }
        }
    }
    private static void loadCountriesFromFile() {
        try (BufferedReader bufferedReader = new BufferedReader(new FileReader("CountryCSV/country.csv"))) {
            String line;
            while ((line = bufferedReader.readLine()) != null) {
                String[] tokens = line.split(",");
                int id = Integer.parseInt(tokens[0]);
                String code = tokens[1];
                String name = tokens[2];
                countries.add(new Country(id, code, name));
            }
        } catch (IOException e) {
            System.out.println("Lỗi đọc file: " + e.getMessage());
        }
    }


    private static void findCountry() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Nhập tên quốc gia bạn muốn tìm kiếm: ");
        String findName = scanner.nextLine();
        boolean found = false;
        for (Country country : countries) {
            if (country.getName().equalsIgnoreCase(findName)) {
                System.out.println("----Kết quả----");
                System.out.printf("%-3s %-5s %-5s\n", "ID", "Code", "Name");
                System.out.println(country);
                found = true;
            }
        }
        if (!found) {
            System.out.println("Quốc gia \"" + findName + "\" không tồn tại !");
        }
    }


    private static void displayCountry() {
        System.out.println("------Danh sách quốc gia------");
        System.out.printf("%-1s %-6s %-5s\n", "ID", "Code", "Name");
        for (Country country : countries) {
            System.out.println(country);
        }
    }

    private static void addCountry() {
        Country country = inputCountry();
        countries.add(country);
        System.out.println("Chúc mừng bạn đã thêm quốc gia mới thành công!");

    }
    private static Country inputCountry() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Nhập ID của quốc gia: ");
        int id = Integer.parseInt(scanner.nextLine());
        System.out.print("Nhập CODE của quốc gia: ");
        String code = scanner.nextLine();
        System.out.print("Nhập NAME của quốc gia: ");
        String name = scanner.nextLine();
        return new Country(id, code, name);
    }


    private static void editCountry() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Nhập vào ID quốc gia bạn cần sửa: ");
        int idToEdit = Integer.parseInt(scanner.nextLine());
        if (idToEdit > 0 && idToEdit <= countries.size()) {
            Country country = inputCountry();
            countries.set(idToEdit - 1, country);
            System.out.println("Bạn đã sửa thành công !!");
        } else {
            System.out.println("❌ Không tìm thấy quốc gia với ID đã nhập.");
        }
    }

    private static void deleteCountry() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Nhập ID quốc gia bạn muốn xóa: ");
        int idToDelete = Integer.parseInt(scanner.nextLine());
        if (idToDelete > 0 && idToDelete <= countries.size()) {
            System.out.println("Bạn có chắc chắn muốn xóa quốc gia \"" + countries.get(idToDelete - 1).getName() + "\" không? (Yes/No)");
            String choice = scanner.nextLine();
            if (!choice.equalsIgnoreCase("Yes")) {
                System.out.println("❌Đã hủy xóa !");
                return;
            }
            System.out.println("Đã xóa thành công quốc gia \"" + countries.get(idToDelete - 1).getName() + "\"");
            countries.remove(idToDelete - 1);
        }
    }
}

