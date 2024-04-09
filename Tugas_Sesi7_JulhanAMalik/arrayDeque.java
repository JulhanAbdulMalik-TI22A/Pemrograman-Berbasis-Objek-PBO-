
import java.util.ArrayDeque;

/**
 *
 * @author Julhan
 */
public class arrayDeque {
    public static void main(String[] args) {

        ArrayDeque<String> students = new ArrayDeque<>();

        students.offer("Julhan");
        students.offer("Abdul");
        students.offer("Malik");

        System.out.println("Isi ArrayDeque:");
        while (!students.isEmpty()) {
            System.out.println(students.poll());
        }
    }
}
