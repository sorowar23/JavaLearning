package javalearning.strings;

import java.nio.charset.StandardCharsets;

public class StringEx {
    public static void main(String[] args) {
        String name = "James";
        String name1 = new String("James");
        String name2 = "JAMES";
        String stringText = "In New York City, living cost expensive.  ";
        System.out.println(name);
        System.out.println(name1);
        System.out.println(name2.length());
        System.out.println(name == name1);
        System.out.println(name.equals(name1));
        System.out.println(name.equalsIgnoreCase(name2));
        System.out.println(stringText.getBytes(StandardCharsets.UTF_8));
        System.out.println(stringText.getBytes());
        System.out.println(stringText.concat(" and difficult to adjust."));
        System.out.println(stringText.charAt(3));
        System.out.println(name.compareTo(name1));
        System.out.println(name.compareTo(name2));
        System.out.println(name.contains("m"));
        System.out.println(name.repeat(5));
        System.out.println(name.intern());
        // commas (,), spaces (\\s), and periods (\\.)
        String regex = "[,\\s\\.]";
        String arr[] = stringText.split(regex);

       for(String s: arr){
           System.out.println(s.strip());
       }
        System.out.println(stringText.isBlank());
        System.out.println(stringText.isEmpty());
        System.out.println(stringText.strip());
        String str1 =  stringText.substring(3, 16);
        System.out.println(str1);

        // Convert the string to a character array
        char[] arr1 = stringText.toCharArray();

        for (char ch : arr1) {
            System.out.println(ch);
        }
        //convert a character array to a string
       //String str2 = new String(arr1);
       //System.out.println(str2);
        // convert a character array to a string is to use the valueOf()
        System.out.println(String.valueOf(arr1));
    }


}
