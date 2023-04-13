import java.util.ArrayList;
import java.util.List;

public class Task01 {


    public static void main(String[] args) {

        String comparison = "Greek";

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

        countOccurance(word, comparison);
    }

    public static void countOccurance(List<String> word, String comparison) {
        int counter = 0;
        for (String record : word) {
            if (record.equals(comparison)) {
                counter++;
            }
        }
        System.out.println("The word '" + comparison + "' occurs " + counter + " times in the sentence.");
    }
}
