package miscellaneousproject;

public class CharCountOccuuencesInString {
    public static void main(String[] args) {
        String inputString = "sometextinput";
        char expectedChar = 't';
        int count = 0;

        for(int i =0; i<inputString.length(); i++){
            if(inputString.charAt(i) == expectedChar){
                count++;
            }
        }

        System.out.println(count);
    }
}
