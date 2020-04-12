package homework6;

import lecture_6.Author;
import lecture_6.Book;

public class Library {
    public static void main(String[] args) {
        Author ws = new Author("William", "Chakespeare");
        Author ws1 = new Author("William", "Chakespear");
        System.out.println(ws.equals(ws1));
        Book b = new Book("1", "Hamlet", ws, "1600", "some description", "123");
        Book b1 = new Book("2", "Romeo & Juliette", ws, "1595", "some description", "345345");
        System.out.println(b);
        System.out.println(b1);
    }
}
