import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class Program-11 {

    public static void main(String[] args) {
        System.out.println("My Name IS Krinshsmith Kava");
        System.out.println("Er_no :: 220130318102");

        String csvFile = "myData.csv";
        String line;
        String cvsSplitBy = ",";

        try (BufferedReader br = new BufferedReader(new FileReader(csvFile))) {
            while ((line = br.readLine()) != null) {
                String[] data = line.split(cvsSplitBy);
                System.out.println("Name: " + data[0] + ", Age: " + data[1]);
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
