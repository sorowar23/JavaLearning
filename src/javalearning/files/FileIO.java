package javalearning.files;

import java.io.*;

public class FileIO {
    public static void main(String[] args) {
     String names[] =  {"Jone", "Jahan", "Jane"};
        try {
            BufferedWriter writer = new BufferedWriter(new FileWriter("output.txt"));
            writer.write("Writing to a file...");
            writer.write("\nWriting another line.");
            for(String name: names){
                writer.write("\n"+ name);
            }
            writer.close();
        }catch (IOException e){
            e.printStackTrace();
        }

        try {
            BufferedReader reader = new BufferedReader(new FileReader("output.txt"));
            String line;
            while((line = reader.readLine()) != null){
                System.out.println(line);
            }
            reader.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
