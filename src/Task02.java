import java.util.ArrayList;
import java.util.List;

public class Task02 {

    public static void main(String[] args) {

        int[] number = {3, 5, 155, 11, 16, 20};

        List<Integer> list = toList(number);

        System.out.println(list);
    }

    public static List<Integer> toList(int[] number) {
        List<Integer> list = new ArrayList<>();
        for (int i : number) {
            list.add(i);
        }
        return list;
    }
}
