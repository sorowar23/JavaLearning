package excercisepractice;

public class StringToken {
    public static void main(String[] args) {
        String inputString = "He is a very very good boy, isn't he?";
        String [] strArray = inputString.split("[ !.;,?_'@]+");
        int count = strArray.length;
        System.out.println(count);
        for(String str: strArray)
            System.out.println(str);
    }
}
