package ArrayList;

import java.util.ArrayList;
import java.util.Collections;

public class ReverseArrayList {
    public static void main(String[] args) {
        ArrayList<String> words = new ArrayList<>();

        words.add("Java");
        words.add("is");
        words.add("fun");

        System.out.println("Original List: " + words);

        reverseList(words);

        System.out.println("Reversed List: " + words);
    }

    public static void reverseList(ArrayList<String> list) {

        Collections.reverse(list);

    }
}
