import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.util.Scanner;

public class FileReading {
    public static void main(String[] args) {
        System.out.println("Creating and Reading a file");
        FileReader reader = null; // local scope
        BufferedReader br = null; // local scope

        var file = new File("sample.txt");
        System.out.println("File Exists: " + file.exists());

        try {
            reader = new FileReader(file);
            br = new BufferedReader(reader);
            var text = br.readLine();
        } catch(Exception e) {
            e.printStackTrace();
        } finally {
            reader = null;
            br = null;
        }

//
//        Scanner input = new Scanner(System.in);
//        input.nextInt()


    }
}
