package BT_ThucHanh_ReadAndWriteStudent;

import java.io.*;
import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void writeDataToFile(String path, List<Student> students)  {
        try {
            ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream(path));
            oos.writeObject(students);
            oos.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public static List<Student> readDataFromFile(String path) throws IOException, ClassNotFoundException {
            ObjectInputStream ois = new ObjectInputStream(new FileInputStream(path));
        return (List<Student>) ois.readObject();
    }

    public static void main(String[] args) throws IOException, ClassNotFoundException {
        //Ghi dữ liệu vào file Students.txt
        List<Student> students = new ArrayList<>();
        students.add(new Student(1, "Nguyễn Trọng Tài", "Nam Định"));
        students.add(new Student(2, "Mai Thanh Trúc", "Nam Định"));
        students.add(new Student(3, "Bùi Thanh Trọng", "Nam Định"));
        students.add(new Student(4, "Nguyễn Văn Trường", "Ninh Bình"));
        writeDataToFile("Students.txt", students);
        // Đọc file Students.txt sau khi ghi
        List<Student> studentDataFromFile = readDataFromFile("Students.txt");
        System.out.printf("%-10s %-15s %-10s\n", "ID", "NAME", "ADDRESS");
        for (Student student : studentDataFromFile) {
            System.out.println(student);
        }
    }
}
