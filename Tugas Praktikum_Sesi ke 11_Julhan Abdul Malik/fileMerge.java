
import java.io.*;

/**
 *
 * @author julhan
 */

public class fileMerge {

    public static void main(String[] args) {

        String[] files = {"D:\\Nusa Putra University\\Mata Kuliah Semester 4\\Pemrograman Berbasis Objek - Alun Sujjada, S.Kom, M.T\\Sesi ke 11 - File Handling\\students.csv", 
            "D:\\Nusa Putra University\\Mata Kuliah Semester 4\\Pemrograman Berbasis Objek - Alun Sujjada, S.Kom, M.T\\Sesi ke 11 - File Handling\\new_students.csv"};
        String mergedFile = "D:\\Nusa Putra University\\Mata Kuliah Semester 4\\Pemrograman Berbasis Objek - Alun Sujjada, S.Kom, M.T\\Sesi ke 11 - File Handling\\mergeCSV.csv";
 
        try (BufferedWriter bw = new BufferedWriter(new FileWriter(mergedFile))) {

            for (String file : files) {
                try (BufferedReader br = new BufferedReader(new FileReader(file))) {
                    String line;
                    while ((line = br.readLine()) != null) {
                        bw.newLine();
                        bw.write(line);
                    }
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
