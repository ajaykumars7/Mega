package com.filewriter;

import java.io.FileWriter;
import java.io.IOException;

public class FileWriter3 {
    public static void main(String[] args) {
        FileWriter writer = null;
        try{
            writer = new FileWriter("example3");
            writer.write("i write and read the file by my own");
        }catch(IOException e){
            e.printStackTrace();
        }finally{
            try{
                if(writer != null){
                    writer.close();
                }
            }catch (IOException e){
                e.printStackTrace();
            }
        }
    }
}
