package testcode;

public class LongestPrefix {

    public static String longestPrefix(String [] inputStrings){
       for(int i =0; i<inputStrings[0].length(); i++){
           for(int j = 1; j<inputStrings.length; j++){
               if(inputStrings[j].length() <= i ||  inputStrings[j].charAt(i) != inputStrings[0].charAt(i)){
                   return inputStrings[0].substring(0,i);
               }
           }
       }
       return inputStrings[0];
    }

    public static void main(String[] args) {
        String [] inputArray = {"flower","flow","flight"};
        String prefix = longestPrefix(inputArray);
        System.out.println(prefix);
    }
}
