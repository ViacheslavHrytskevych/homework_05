import java.util.ArrayList;
import java.util.List;

public class Task03 {

    public static void main(String[] args) {

        List<Integer> numbers = new ArrayList<>();
        numbers.add(2);
        numbers.add(22);
        numbers.add(3);
        numbers.add(23);
        numbers.add(5);
        numbers.add(10);
        numbers.add(2);
        numbers.add(3);
        numbers.add(22);
        numbers.add(7);
        numbers.add(8);

        List<Integer> unique = findUnique(numbers);

        System.out.println(unique);
    }


    static List<Integer> findUnique(List<Integer> numbers) {
        List<Integer> unique = new ArrayList<>();

        for (int i = 0; i < numbers.size(); i++) {
            int currentNumber = numbers.get(i);
            boolean isUnique = true;

            for (int j = 0; j < unique.size(); j++) {
                if (currentNumber == unique.get(j)) {
                    isUnique = false;
                    break;
                }
            }
            if (isUnique) {
                unique.add(currentNumber);
            }
        }
        return unique;
    }
}