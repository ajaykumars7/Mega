package Exercises;

public class Course {
    static int MAXCAPACITY;
    String courseName;
    int enrolledStudents;

    static{
        MAXCAPACITY = 0;
    }
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
