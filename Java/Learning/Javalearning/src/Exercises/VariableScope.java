package Exercises;

public class VariableScope {
    int Age = 1000;
    String Name = "Vikranth";
    static void nameAge(){
        int Age = 200;
        String Name = "Srikanth";
        System.out.println(Age);
        System.out.println(Name);
    }

    public static void main(String[] args) {
        VariableScope.nameAge();
    }
}
