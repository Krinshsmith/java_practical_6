import java.io.FileWriter;
import java.io.IOException;

public class Program-9 {
    public static void main(String[] args) {
        System.out.println("My Name Is Krinshsmith Kava ");
        System.out.println("Er_no :: 220130318102");

        try {
            FileWriter writer = new FileWriter("myData.csv");
            writer.write("Name, Age, Gender\n");
            writer.write("John Doe, 25, Male\n");
            writer.write("John Smith, 30, Female\n");
            writer.write("David Lee, 20, Male\n");
            writer.close();
            System.out.println("Data is written to the file.");
        } catch (IOException e) {
            System.out.println("An error occurred.");
            e.printStackTrace();
        }
    }
}
