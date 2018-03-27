package com.java8.interviews.bookreader;

/**
 * Created by Pavithra Sachidananda on 1/6/18.
 */
public class Display {

    public Display() {

    }

    private User activeUser;

    private Book activeBook;

    private int currentPage;

    public User getActiveUser() {
        return activeUser;
    }

    public void setActiveUser(User activeUser) {
        this.activeUser = activeUser;
    }

    public Book getActiveBook() {
        return activeBook;
    }

    public void setActiveBook(Book activeBook) {
        this.activeBook = activeBook;
    }

    public int getCurrentPage() {
        return currentPage;
    }

    public void setCurrentPage(int currentPage) {
        this.currentPage = currentPage;
    }

    public void turnPageForward() {
        currentPage++;
    }

    public void turnPageBackward() {
        currentPage--;
    }
}
