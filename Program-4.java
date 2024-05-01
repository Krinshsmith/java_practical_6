import java.io.FileWriter;
import java.io.IOException;

public class Program-4 {
    public static void main(String[] args) {
        System.out.println("My Name Is Krinshsmith Kava");
        System.out.println("Er_no :: 220130318102");

        try {
            FileWriter writer = new FileWriter("myFile.txt");
            String data = "Hello World!\njava.";
            writer.write(data);
            System.out.println("Data is written to the file.");
            writer.close();
        } catch (IOException e) {
            System.out.println("An error occurred.");
            e.printStackTrace();
        }
    }
}
