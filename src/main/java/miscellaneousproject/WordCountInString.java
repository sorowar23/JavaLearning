package miscellaneousproject;

public class WordCountInString {
    public static void main(String[] args) {
      String  inputString = "GeeksforGeeks A computer science portal computer for geeks computer";
      String expectedWord = "computer";
      String[] stringArray = inputString.split(" ");
      int count = 0;
        for (String s : stringArray) {
            if (s.equals(expectedWord)) {
                count++;
            }
        }
        System.out.println(count);
    }
}
