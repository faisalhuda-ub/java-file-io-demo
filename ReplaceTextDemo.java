import java.io.File;
import java.io.PrintWriter;
import java.util.Scanner;

public class ReplaceTextDemo {
    public static void main(String[] args) throws Exception {
        // Parameter penggunaan kode
        if (args.length != 4) {
            System.out.println("Penggunaan: java ReplaceTextDemo filesumber filetarget stringTarget stringBaru");
            System.exit(1);
        }

        // Cek file sumber apakah ada 
        File sourceFile = new File(args[0]);
        if (!sourceFile.exists()) {
            System.out.println("File sumber " + args[0] + " tidak ada");
            System.exit(2);
        }

        // Cek file target apakah sudah ada
        File targetFile = new File(args[1]);
        if (targetFile.exists()) {
            System.out.println("File target " + args[1] + " telah ada");
            System.exit(3);
        }

        try (
                // membuat file input dan output
                Scanner input = new Scanner(sourceFile);
                PrintWriter output = new PrintWriter(targetFile);
            ) 
        {
            while (input.hasNext()) {
                String s1 = input.nextLine();
                String s2 = s1.replaceAll(args[2], args[3]);
                output.println(s2);
            }
        }
    }
}
