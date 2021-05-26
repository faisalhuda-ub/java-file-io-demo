import java.io.FileNotFoundException;
import java.io.IOException;

public class WriteDataDemo {
    public static void main(String[] args) throws FileNotFoundException 
        {
        java.io.File file = new java.io.File("scores.txt");
        
        if (file.exists()) 
        {
            System.out.println("File telah ada");
            System.exit(1);
        }

        java.io.PrintWriter output = new java.io.PrintWriter(file);

        output.print("Budi ");
        output.println(88);
        output.print("Cindy ");
        output.println(99);

        output.close();
    }
}
