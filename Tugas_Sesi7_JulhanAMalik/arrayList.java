
import java.util.ArrayList;

/**
 *
 * @author Julhan
 */
public class arrayList {
    public static void main(String[] args) {

        ArrayList<Integer> numbers = new ArrayList<>();

        numbers.add(10);
        numbers.add(20);
        numbers.add(30);

        System.out.println("Isi ArrayList:");
        for (int num : numbers) {
            System.out.println(num);
        }
    }
}
