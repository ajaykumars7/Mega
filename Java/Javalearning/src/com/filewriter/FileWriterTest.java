package com.filewriter;

import java.io.File;
import java.io.IOException;
import java.io.FileWriter;
public class FileWriterTest {
    public static void main(String[] args) {
        FileWriter writer = null;
        try {
            writer = new FileWriter("example.txt");
            writer.write("Hello, world!");
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            try {
                if (writer != null) {
                    writer.close();
                }
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }
}