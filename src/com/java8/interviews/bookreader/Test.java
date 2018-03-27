package com.java8.interviews.bookreader;

import java.math.BigDecimal;

/**
 * Created by Pavithra Sachidananda on 1/6/18.
 */
public class Test {

    public static void main(String[] args) {
        BookReaderSystem bookReaderSystem = new BookReaderSystem();

        BigDecimal.valueOf(1.2);

        User user1 = new  User(1, "Pavi", "user1");
        bookReaderSystem.getUserManager().createUser(user1);
        User user2 = new User(2, "Abhi", "user2");
        bookReaderSystem.getUserManager().createUser(user2);

        Book book1 = new Book(1, "title1", "desc1");
        Book book2 = new Book(2, "title2", "desc2");
        bookReaderSystem.getLibrary().addBook(book1);
        bookReaderSystem.getLibrary().addBook(book2);

        bookReaderSystem.getDisplay().setActiveBook(book1);
        bookReaderSystem.getDisplay().setActiveUser(user1);

        bookReaderSystem.getDisplay().turnPageForward();
        bookReaderSystem.getDisplay().turnPageForward();


        System.out.println("Current page = " + bookReaderSystem.getDisplay().getCurrentPage());


    }
}
