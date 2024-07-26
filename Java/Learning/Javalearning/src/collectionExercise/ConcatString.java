package collectionExercise;

public class ConcatString {
 public static String concatenate(String... strs){
     StringBuilder sb = new StringBuilder();
     for(String str: strs){


         sb.append(str).append(" ");

     }
     return sb.toString();
 }
}
