package com.java8.interviews.bookreader;

/**
 * Created by Pavithra Sachidananda on 1/6/18.
 */
public class BookReaderSystem {

    private Library library;
    private Display display;

    private UserManager userManager;

    public BookReaderSystem() {
        this.userManager = new UserManager();
        this.library = new Library();
        this.display = new Display();
    }

    public Library getLibrary() {
        return library;
    }

    public void setLibrary(Library library) {
        this.library = library;
    }

    public Display getDisplay() {
        return display;
    }

    public void setDisplay(Display display) {
        this.display = display;
    }

    public UserManager getUserManager() {
        return userManager;
    }

    public void setUserManager(UserManager userManager) {
        this.userManager = userManager;
    }

    public void setActiveBook(Book book) {
        display.setActiveBook(book);
    }

    public void setActiveUser(User user) {

        display.setActiveUser(user);

    }


}
