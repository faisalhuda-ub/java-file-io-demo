 import java.io.File;

public class CreateFile {
    public static void main(String[] args) {
        try {
            File file = new File("C:\\namaFile.txt");

            boolean result = file.createNewFile();

            if (result)
                System.out.println("File telah sukses terbuat");
            else
                System.out.println("File gagal terbuat");

        } catch (Exception e) {
            System.out.println("Terjadi eksepsi: " + e.getMessage());
            e.printStackTrace();
        }
    }
}
