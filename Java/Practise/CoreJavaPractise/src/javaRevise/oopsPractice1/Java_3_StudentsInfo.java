package javaRevise.oopsPractice1;

public class Java_3_StudentsInfo  {
        // Properties
        String name;
        int age;
        char grade;

        // Constructor to initialize student details
        public Java_3_StudentsInfo(String name, int age, char grade) {
            this.name = name;
            this.age = age;
            this.grade = grade;
        }

        // Method to display student information
        public void displayInfo() {
            System.out.println("Name: " + name + ", Age: " + age + ", Grade: " + grade);
        }
    }

     class Main {
        public static void main(String[] args) {
            // Creating student objects
            Java_3_StudentsInfo student1 = new Java_3_StudentsInfo("Alice", 20, 'A');
            Java_3_StudentsInfo student2 = new Java_3_StudentsInfo("Bob", 22, 'B');

            // Displaying student information
            student1.displayInfo();
            student2.displayInfo();
        }
    }

