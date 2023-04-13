import java.util.ArrayList;
import java.util.List;

public class Task05 {

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

        List<Word> occurance = calcOccurance(word);

        for (Word record : occurance) {
            System.out.println(record.toString());
        }
    }

    static List<Word> calcOccurance(List<String> word) {
        word.sort(null);
        int counter = 1;
        List<Word> occurance = new ArrayList<>();

        for (int i = 0; i < word.size() - 1; i++) {
            String current = word.get(i);
            String next = word.get(i + 1);
            if (current.equals(next)) {
                counter++;
            } else {
                occurance.add(new Word(current, counter));
                counter = 1;
            }
        }
        String last = word.get(word.size() - 1);
        occurance.add(new Word(last, counter));
        return occurance;
    }
}
