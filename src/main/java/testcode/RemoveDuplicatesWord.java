package testcode;

import java.util.Arrays;
import java.util.LinkedHashSet;

public class RemoveDuplicatesWord {

    public static String removeDuplicates(String text){

        if(text.isEmpty())
            return text;
        String [] words = text.split("\\s+");
        LinkedHashSet<String> uniqueWords = new LinkedHashSet<>(Arrays.asList(words));

        return String.join(" ",uniqueWords);
    }

    public static void main(String[] args) {
        String str1 = "Reya is is the best the the best player in eye eye game.";
        String result = removeDuplicates(str1);
        System.out.println(result);
    }
}
