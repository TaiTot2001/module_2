import java.io.*;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class ReadAndWriteFile {
    public List<Integer> readFile(String filePath) {
        List<Integer> numbers = new ArrayList<>();
        File file = new File(filePath);
        try {
            if (!file.exists()) {
                throw new FileNotFoundException();
            }
            BufferedReader br = new BufferedReader(new FileReader(file));
            String line;
            while ((line = br.readLine()) != null) {
                numbers.add(Integer.parseInt(line));
            }
            br.close();
        } catch (Exception e) {
            System.err.println("File không tồn tại hoặc bị lỗi !");
        }
        return numbers;
    }

    public void writeFile(String filePath, int max) {
        try {
            FileWriter writer = new FileWriter(filePath, true);
            BufferedWriter bw = new BufferedWriter(writer);
            bw.write("Giá trị lớn nhất là: " + max + "\n");
            bw.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public static int findMax(List<Integer> numbers) {
        int max = numbers.get(0);
        for (Integer number : numbers) {
            if (number > max) {
                max = number;
            }
        }
        return max;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhập vào đường dẫn của file: ");
        String filePath = sc.nextLine();
        ReadAndWriteFile readAndWriteFile = new ReadAndWriteFile();
        List<Integer> number = readAndWriteFile.readFile(filePath);
        int maxValue = findMax(number);
        readAndWriteFile.writeFile("file/result.txt", maxValue);


//        ReadAndWriteFile readAndWriteFile = new ReadAndWriteFile();
//        List<Integer> numbers = readAndWriteFile.readFile("file/number.txt");
//        int maxValue = findMax(numbers);
//        readAndWriteFile.writeFile("file/result.txt", maxValue);
    }
}
