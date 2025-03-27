package excercisepractice;

public class CheckPalindrome {
    public static void main(String[] args) {
        String A = "java";
        String reverseText = "";
        char ch;
        for(int i = 0; i<A.length(); i++){
            ch = A.charAt(i);
            reverseText = ch + reverseText;
        }
        if(A.equals(reverseText)){
            System.out.println("Yes");
        }else{
            System.out.println("No");
        }
    }
}
