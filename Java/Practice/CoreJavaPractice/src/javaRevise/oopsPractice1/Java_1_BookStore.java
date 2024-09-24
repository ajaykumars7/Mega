package javaRevise.oopsPractice1;

public class Java_1_BookStore {

    public static class Books{
        String title;
        String author;
        int isbn;

        static int totalbooks;

        int borrowBook(){
            totalbooks++;
            return totalbooks;
        }
        int returnBook(){
            totalbooks--;
            return totalbooks;
        }
        static void getTotalBooks(){
            System.out.println(totalbooks);
        }

    }
    public static void main(String[] args) {

    }
}
