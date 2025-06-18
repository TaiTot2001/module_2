package BT_ReadFile;


import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class Read_CSV_File {
    private final static List<Country> countris = new ArrayList<>();

    public static void main(String[] args) {
        try (FileReader fileReader = new FileReader("BT_ReadFile/CSV.txt");
             BufferedReader bufferedReader = new BufferedReader(fileReader)
        ) {
            String line;
            while((line = bufferedReader.readLine()) != null) {
                String[] tokens = line.split(",");
                int id = Integer.parseInt(tokens[0]);
                String code = tokens[1].replace("\"","  ");
                String name = tokens[2].replace("\""," ");
                Country country = new Country(id, code, name);
                countris.add(country);
            }
        }catch (FileNotFoundException e){
            e.printStackTrace();
        }
        catch (IOException e) {
            e.printStackTrace();
        }
        System.out.println("====Danh sách các quốc gia===");
        System.out.printf("%-5s%-10s%-10s\n", "ID", "Code", "Name");
        for (Country country : countris) {
            System.out.println(country);
        }
    }
}
