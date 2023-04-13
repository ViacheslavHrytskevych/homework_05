import java.util.ArrayList;
import java.util.List;

public class Task04 {

    public static void main(String[] args) {

        List<String> word = new ArrayList<>();
        word.add("A");
        word.add("Greek");
        word.add("was");
        word.add("crossing");
        word.add("a");
        word.add("river");
        word.add("and");
        word.add("saw");
        word.add("a");
        word.add("Greek");
        word.add("in");
        word.add("the");
        word.add("river");
        word.add("with");
        word.add("a");
        word.add("crawfish");

        calcOccurance(word);

    }

    static void calcOccurance(List<String> word) {
        word.sort(null);
        int counter = 1;

        for (int i = 0; i < word.size() - 1; i++) {
            String current = word.get(i);
            String next = word.get(i + 1);
            if (current.equals(next)) {
                counter++;
            } else {
                System.out.println(word.get(i) + ": " + counter);
                counter = 1;
                continue;
            }
        }
    }
}