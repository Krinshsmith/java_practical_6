import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;

public class Program-6 {
    public static void main(String[] args) {
        System.out.println("My Name Is Krinshsmith Kava");
        System.out.println("Er_no :: 220130318102");

        try {
            FileWriter fileWriter = new FileWriter("myFile.txt", true);
            BufferedWriter bufferedWriter = new BufferedWriter(fileWriter);
            String newLine = "Java Programming is awesome! java\n";
            bufferedWriter.write(newLine);
            bufferedWriter.close();
            System.out.println("New line is appended to the file.");
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
