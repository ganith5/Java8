package com.java8.interviews.bookreader;

/**
 * Created by Pavithra Sachidananda on 1/6/18.
 */
public class Book {

    private long bookId;

    private String title;

    private String description;

    private String category;

    public Book(long id, String title, String description) {
        this.bookId = id;
        this.title = title;
        this.description = description;
    }

    public Long getBookId() {
        return bookId;
    }

    public void setBookId(Long bookId) {
        this.bookId = bookId;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getCategory() {
        return category;
    }

    public void setCategory(String category) {
        this.category = category;
    }
}
