package com.filereader;

import java.io.FileReader;
import java.io.IOException;

public class FileReader2 {
    public static void main(String[] args) {
        FileReader reader = null;
        try{
            reader = new FileReader("example3");

            //--------------------------------------------------------------
//            int character = 0;
//            while((character = reader.read()) != -1){
//                System.out.println((char)character);
//            }

//            while((reader = character)  != -1){



//                System.out.println((char) character);
//            }

//            do {
//                System.out.println(reader.read());
//            }while(((char) character) != -1);
            //-------------------------------------------------------------------------------

            int character;
            while((character = reader.read()) != -1){
                System.out.print((char) character);
            }


        }catch(IOException e){
            e.printStackTrace();
        }finally{
            try{
                if (reader != null){
                    reader.close();
                }
            }catch (IOException e){
                e.printStackTrace();
            }
        }
    }
}
