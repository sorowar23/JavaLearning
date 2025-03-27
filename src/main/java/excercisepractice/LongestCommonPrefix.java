package excercisepractice;
//Input=> ["cardboard", "cart", "carrot", "carbon"]
public class LongestCommonPrefix {
    public static String longestCommonPrefix(String[] strs){
        for(int i = 0; i<strs[0].length(); i++ ){
            for(int j = 1; j<strs.length; j++){
                if(strs[j].length() <= i || strs[j].charAt(i) != strs[0].charAt(i)){
                    return strs[0].substring(0,i);
                }
            }
        }
        return strs[0];
    }

    public static void main(String[] args) {
        String [] inputArray = {"cardboard", "cart", "carrot", "carbon"};
        String pre =  longestCommonPrefix(inputArray);
        System.out.println(pre);
    }
}
