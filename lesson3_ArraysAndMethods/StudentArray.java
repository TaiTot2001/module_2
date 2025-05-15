import java.util.Scanner;

public class StudentArray {
    public static void main(String[] args) {
        String[] StudentList = {"Tài", "Đoan", "Trọng", "Cầm", "Linh", "Trúc"};
        Scanner sc = new Scanner(System.in);
        System.out.print("Bạn muốn tìm vị trí của sinh viên nào trong danh sách: ");
        String input_name = sc.nextLine();
        boolean isExist = false;
        for (int i = 0; i < StudentList.length; i++) {
            if (StudentList[i].equals(input_name)) {
                System.out.println("Đã tìm thấy sinh viên có tên (" + input_name + ") ở vị trí số " + (i + 1) + " trong đanh sách");
                isExist = true;
                break;
            }
        }
        if (!isExist) {
            System.out.println("Không tìm thấy sinh viên có tên " + input_name + " có tên trong danh sách");
        }
    }
}
