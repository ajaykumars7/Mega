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
                return 0;
            }
        }
        String setname(){
            return Name;
        }
        String getPosition(){
            return Position;
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
