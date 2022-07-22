import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;

public class FileReaderTryWithResources {
    public static void main(String[] args) {
        var file = new File("sample.txt");

        try(    FileReader reader = new FileReader(file);
                BufferedReader br = new BufferedReader(reader)
        ) {
            var text = br.readLine();
            System.out.println(text);
        } catch (Exception e) {
            e.printStackTrace();
        }

    }
}
