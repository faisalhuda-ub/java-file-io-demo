import java.io.File;

public class AutoCloseDemo {
    public static void main(String[] args) throws Exception{
        File file = new File("scores.txt");

        if (file.exists()) 
        {
            System.out.println("File telah ada");
            System.exit(1);
        }

        try (java.io.PrintWriter output = new java.io.PrintWriter(file);)
        {
            output.print("Budi ");
            output.println(88);
            output.print("Cindy ");
            output.println(99);
        }
    }
}
