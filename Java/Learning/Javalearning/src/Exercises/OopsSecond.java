package Exercises;
import com.sun.source.tree.ReturnTree;

import java.util.Scanner;

public class OopsSecond {
    // creating a class
    static class account{
        String Name;
        int Age;
        String Position;

        int setAge(){
            if(Age >= 0){
                return Age;
            }else{
                System.out.println("Age is undefined");
            }
        }
        String setname(){

        }
        String getPosition(){

        }
        int getAge(){
            return Age;
        }
        String getname(){
            return Name;
        }
        String setPosition(){
            return Position;
        }

        public static void main(String[] args) {

        }
    }
}
