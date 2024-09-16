package oops.second;





abstract class Abs{
    int abs = 6;
}

class Workout extends Abs{
    String exercise = "full body";
}

class abstractionPractice{
    public static void main(String[] args) {
        Workout exer = new Workout();
//        Abs sixpack = new Abs();
        System.out.println(exer.exercise);
        System.out.println(exer.abs);


    }
}
