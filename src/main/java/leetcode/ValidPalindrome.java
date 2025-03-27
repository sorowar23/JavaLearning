package leetcode;

public class ValidPalindrome {
    public static void main(String[] args) {
        String stringText = "A man, a plan, a canal: Panama";
        //remove non-alphanumeric characters from a string
        stringText = stringText.replaceAll("[^a-zA-Z0-9]", "").toLowerCase();
        String reverseText = "";
        char ch;

        for(int i = 0; i<stringText.length(); i++){
            ch = stringText.charAt(i);
            reverseText = ch + reverseText;
        }
        if(stringText.equals(reverseText)){
            System.out.println("Palindrome");
        }else{
            System.out.println("NOT a Palindrome");
        }

    }
}
