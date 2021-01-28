package hash;

import hash.Book;

public class App {
    public static void main(String[] args) {
        Book book1 = new Book("Main kumpf", "Adolf Hitler", 1930);
        Book book2 = new Book("Humen revolution", "Adam Linkoln", 1820);

        System.out.println(book1.getInfo());
        System.out.println(book1.hashCode());
        System.out.println(book2.getInfo());
        System.out.println(book2.hashCode());
        if(book1.equals(book2)){
            System.out.println("Book1 equals book2");
        }
        else{
            System.out.println("Not equals\n");
        }
        book1 = book2;
        System.out.println(book1.getInfo());
        System.out.println(book1.hashCode());
        System.out.println(book2.getInfo());
        System.out.println(book2.hashCode());
        if(book1.equals(book2)){
            System.out.println("Book1 equals book2");
        }
    }
}
