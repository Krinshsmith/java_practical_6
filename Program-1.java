import java.io.File;
import java.io.FileWriter;
import java.io.FileReader;
import java.io.IOException;

public class Program-6 {
    public static void main(String[] args) {
        System.out.println("My Name Is Krinshsmith Kava");
        System.out.println("Er_no :: 220130318102");

        try {
            File file = new File("newFile.txt");
            if (file.createNewFile()) {
                System.out.println("The new file is created.");
            } else {
                System.out.println("The file already exists.");
            }

            String data = "This is the data in the new file.";
            FileWriter writer = new FileWriter("newFile.txt");
            writer.write(data);
            System.out.println("Data is written to the file.");
            writer.close();

            FileReader reader = new FileReader("newFile.txt");
            int character;
            while ((character = reader.read()) != -1) {
                System.out.print((char) character);
            }
            reader.close();
        } catch (IOException e) {
            System.out.println("An error occurred.");
            e.printStackTrace();
        }
    }
}
