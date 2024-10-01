package Exercises;

public class Course {
    static int MAXCAPACITY = 100;
    String courseName;
    int enrolledStudents;

    {
        MAXCAPACITY ++;
    }
    Course(String courseName, int enrolledStudents){
        this.courseName = courseName;
        this.enrolledStudents = enrolledStudents;
    }
    Course(int enrolledStudents){
        this("unknown", enrolledStudents);
    }

    void enrollStudent(String studentName){

    }
    void unenrollStudent(String studentName){

    }
    static void setMAXCAPACITY(){

    }
}
