import java.util.ArrayList;
import java.util.List;

public class Task04 {

    public static void main(String[] args) {

        List<String> list = new ArrayList<>();
        list.add("A");
        list.add("Greek");
        list.add("was");
        list.add("crossing");
        list.add("a");
        list.add("river");
        list.add("and");
        list.add("saw");
        list.add("a");
        list.add("Greek");
        list.add("in");
        list.add("the");
        list.add("river");
        list.add("with");
        list.add("a");
        list.add("crawfish");

        calcOccurance(list);

    }

    static void calcOccurance(List<String> list) {
        list.sort(null);
        int counter = 1;

        for (int i = 0; i < list.size() - 1; i++) {
            String current = list.get(i);
            String next = list.get(i + 1);
            if (current.equals(next)) {
                counter++;
            } else {
                System.out.println(list.get(i) + ": " + counter);
                counter = 1;
                continue;
            }
        }
    }
}