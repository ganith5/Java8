package com.java8.interviews.bookreader;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * Created by Pavithra Sachidananda on 1/6/18.
 */
public class Library {

    private Map<String, Book> books;

    public Library() {
        books = new HashMap();
    }

    public void addBook(Book book) {
        books.put(book.getTitle(), book);
    }

    public Book getBook(String title) {
        return books.get(title);
    }

    public void removeBook(String title) {
        books.remove(title);
    }
}
