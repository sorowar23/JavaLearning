package javalearning.exceptions;
//Exception types - i) Runtime Exception / Unchecked Exception
// ii) Checked Exception

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class ExceptionEx {
    public static void main(String[] args) {
        try {
            FileReader file = new FileReader("/a.txt");
            BufferedReader fileInput = new BufferedReader(file);
            try {
                //List<Integer> list = new ArrayList<>(10);
                //list.add(10);
               // Integer a = list.get(100);
               // System.out.println("Print Item: "+ a);
                int arr[] = {1,2,34,6};
                System.out.println(arr[10]);
            }
            catch (ArrayIndexOutOfBoundsException ex)
            {
                System.err.println("ArrayIndexOutOfBoundsException: " + ex.getMessage());
                throw ex;
            }
          }
          catch (FileNotFoundException e) {
              System.err.println("FileNotFoundException: " + e.getMessage());
          }
        finally {
            System.out.println("Inside Finally block!");
            //out.close()
            //used to use to close files, DB connection, print write
        }
    }
}
