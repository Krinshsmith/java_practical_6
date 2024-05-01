import java.io.File;
import java.io.FileWriter;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.BufferedReader;
import java.io.IOException;

public class Program-3 {
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
            String data = "This is the initial data in the new file.";
            FileWriter writer = new FileWriter("newFile.txt");
            BufferedWriter bufferedWriter = new BufferedWriter(writer);
            bufferedWriter.write(data);
            System.out.println("Data is written to the file.");
            bufferedWriter.close();
            data = "This is the modified data in the new file.";
            bufferedWriter = new BufferedWriter(new FileWriter("newFile.txt"));
            bufferedWriter.write(data);
            System.out.println("Data is modified in the file.");
            bufferedWriter.close();
            FileReader reader = new FileReader("newFile.txt");
            BufferedReader bufferedReader = new BufferedReader(reader);
            String line;
            while ((line = bufferedReader.readLine()) != null) {
                System.out.println(line);
            }
            bufferedReader.close();
        } catch (IOException e) {
            System.out.println("An error occurred.");
            e.printStackTrace();
        }
    }
}
