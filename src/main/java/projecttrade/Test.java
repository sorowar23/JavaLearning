package projecttrade;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class Test {
    public static void main(String[] args) {
        String A = "hello";
        String B = "java";
        int stlenght = A.length() + B.length();
        System.out.println(stlenght);
        if(A.compareTo(B) >0){
            System.out.println("Yes");
        }else{
            System.out.println("No");
        }

        System.out.println(A.substring(0,1).toUpperCase()+ A.substring(1)+ " "+ B.substring(0,1).toUpperCase()+ B.substring(1));
    }
}
