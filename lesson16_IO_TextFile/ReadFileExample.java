import java.io.*;
import java.util.Scanner;

public class ReadFileExample {
    public void readFileText(String filePath) {
        try {
            File file = new File(filePath);
            if (!file.exists()) {
                throw new FileNotFoundException();
            }
            FileReader fr = new FileReader(file);
            BufferedReader br = new BufferedReader(fr);
            String line = "";
            int sum = 0;
            while ((line = br.readLine()) != null) {
                System.out.println(line);
                sum += Integer.parseInt(line);
            }
            br.close();
            System.out.println("Tổng = " + sum);
        } catch (Exception e) {
            System.err.println("File không tồn tại hoặc nội dung có lỗi!");
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Nhập đường dẫn file: ");
        String path = scanner.nextLine();
        ReadFileExample readfileEx = new ReadFileExample();
        readfileEx.readFileText(path);
    }
}
