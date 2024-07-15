package com.filewriter;
import java.io.FileWriter;
import java.io.IOException;

public class FileWriter2 {
    public static void main(String[] args) {
        FileWriter writer = null;
        try{
            writer = new FileWriter("example2");
            writer.write("this is written by AJAY");
        }catch (IOException e){
            e.printStackTrace();
        }finally {
            try{
                if (writer != null){
                    writer.close();
                }
            }catch (IOException e){
                e.printStackTrace();
            }
        }


    }
}
