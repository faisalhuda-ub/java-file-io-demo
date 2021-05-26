import java.io.IOException;
import java.net.URL;
import java.nio.charset.MalformedInputException;
import java.util.Scanner;

public class ReadFromURL {
    public static void main(String[] args) {
        System.out.print("Masukkan URL : ");
        Scanner scanner = new Scanner(System.in);
        String urlString = scanner.next();
        scanner.close();

        try {
            URL url = new URL(urlString);
            int count = 0;
            Scanner input = new Scanner(url.openStream());

            while (input.hasNext()) {
                String line = input.nextLine();
                count += line.length();
            
            }
            
            System.out.println("Ukuran file adalah " + count + " karakter");
        } catch (MalformedInputException me) {
            System.out.println("URL tidak valid");
        }
        catch (IOException ex) {
            System.out.println("Eror I/O: tidak ada file tsb");
        }
    }
}
