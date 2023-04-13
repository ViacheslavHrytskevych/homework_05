import java.util.ArrayList;
import java.util.List;

public class Task02 {

    public static void main(String[] args) {

        int[] numbers = {3, 5, 155, 11, 16, 20};

        List<Integer> number = toList(numbers);

        System.out.println(number);
    }

    public static List<Integer> toList(int[] numbers) {
        List<Integer> number = new ArrayList<>();
        for (int record : numbers) {
            number.add(record);
        }
        return number;
    }

}
