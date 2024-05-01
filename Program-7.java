import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class Program-7 {
    public static void main(String[] args) {
        System.out.println("My Name Is Krinshsmith Kava ");
        System.out.println("Er_no :: 220130318102");

        try {
            FileReader fileReader = new FileReader("myFile.txt");
            BufferedReader bufferedReader = new BufferedReader(fileReader);
            String line;
            while ((line = bufferedReader.readLine()) != null) {
                System.out.println(line);
            }
            bufferedReader.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
