import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

/**
 *
 * @author julha
 */

public class CSVWriter {
    public static void main(String[] args) {
        String csvFile = "D:\\Nusa Putra University\\Mata Kuliah Semester 4\\Pemrograman Berbasis Objek - Alun Sujjada, S.Kom, M.T\\Sesi ke 11 - File Handling\\new_students.csv";
        
        Scanner input = new Scanner(System.in);
        boolean addMoreData = true;

        try (BufferedWriter bw = new BufferedWriter(new FileWriter(csvFile))) {
            while (addMoreData) {
                System.out.print("Masukkan data diri [NIM,Nama,Umur,PRODI]: ");
                String data_student = input.nextLine();

                // Menulis data ke file CSV
                bw.write(data_student);
                bw.newLine();

                // Menanyakan apakah ingin menambah data lagi
                System.out.print("Apakah ingin menambahkan lagi? (ya/tidak): ");
                String response = input.nextLine();
                if (!response.equalsIgnoreCase("ya")) {
                    addMoreData = false;
                }
            }
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            input.close();
        }
    }
}
