import java.io.BufferedInputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class BufferedInputDemo {
    public static void main(String[] args) {
        File file = new File("C://namaFi.txt");
        BufferedInputStream buffInput = null;
        FileInputStream fileInput = null;

        try {
            fileInput = new FileInputStream(file);

            buffInput = new BufferedInputStream(fileInput);

            while (buffInput.available() > 0) {
                System.out.println((char)buffInput.read());
            }
        } catch (FileNotFoundException fe) {
            System.out.println("File tidak ditemukan");
        }
        catch (IOException ie)
        {
            System.out.println("Terjadi eksepsi IO" + ie.getMessage());
        }
        finally 
        {
            try {
                if(buffInput != null && fileInput != null)
                {
                    fileInput.close();
                    buffInput.close();
                }
            } catch (IOException ie) {
                System.out.println("Terjadi eror ketika menutup filestream: " + ie.getMessage());
            }
        }
    }
}

