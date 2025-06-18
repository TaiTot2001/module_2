import java.io.*;
import java.util.Scanner;

public class CopyFileText {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Nhập đường dẫn tệp nguồn: ");
        String sourcePath = scanner.nextLine();
        System.out.print("Nhập đường dẫn tệp đích: ");
        String targetPath = scanner.nextLine();

        File sourceFile = new File(sourcePath);
        File targetFile = new File(targetPath);

        if (!sourceFile.exists()) {
            System.out.println("Tệp nguồn không tồn tại!");
            return;
        }

        if (targetFile.exists()) {
            System.out.println("Cảnh báo: Tệp đích đã tồn tại. Ghi đè lên tệp này? (yes/no)");
            String choice = scanner.nextLine();
            //equalsIgnoreCase so sánh hai chuỗi không phân biê chữ hoa hay thường. vd: YeS = yes...
            if (!choice.equalsIgnoreCase("yes")) {
                System.out.println("Hủy sao chép.");
                return;
            }
        }

        try (
                BufferedReader br = new BufferedReader(new FileReader(sourcePath));
                BufferedWriter bw = new BufferedWriter(new FileWriter(targetPath))
        ) {
            int charCount = 0;
            String line;

            while ((line = br.readLine()) != null) {
                charCount += line.length();
                bw.write(line);
            }

            System.out.println("Sao chép thành công. Tổng số ký tự: " + charCount);
        } catch (IOException e) {
            System.out.println("Đã xảy ra lỗi khi xử lý tệp: " + e.getMessage());
        }
    }
}

