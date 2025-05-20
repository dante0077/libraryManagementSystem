package com.library.services;

import com.library.models.Book;
import com.library.models.Patron;

import java.util.HashSet;
import java.util.Set;

public class LendingService {
    private final BookService bookService;
    private final PatronService patronService;

    private final Set<String> borrowedIsbns = new HashSet<>();

    public LendingService(BookService bookService, PatronService patronService) {
        this.bookService = bookService;
        this.patronService = patronService;
    }

    // Checkout a book
    public void checkoutBook(String isbn, String patronId) {
        Book book = bookService.getBookByIsbn(isbn);
        Patron patron = patronService.getPatronById(patronId);

        if (book == null) {
            System.out.println("Book not found.");
            return;
        }
        if (patron == null) {
            System.out.println("Patron not found.");
            return;
        }
        if (borrowedIsbns.contains(isbn)) {
            System.out.println("Book is already borrowed.");
            return;
        }

        patron.borrowBook(book);
        borrowedIsbns.add(isbn);
        System.out.println("Book checked out: " + book.getTitle() + " to " + patron.getName());
    }

    // Return a book
    public void returnBook(String isbn, String patronId) {
        Patron patron = patronService.getPatronById(patronId);
        if (patron == null) {
            System.out.println("Patron not found.");
            return;
        }

        Book bookToReturn = null;
        for (Book book : patron.getBorrowedBooks()) {
            if (book.getIsbn().equals(isbn)) {
                bookToReturn = book;
                break;
            }
        }

        if (bookToReturn != null) {
            patron.returnBook(bookToReturn);
            borrowedIsbns.remove(isbn);
            System.out.println("Book returned: " + bookToReturn.getTitle() + " by " + patron.getName());
        } else {
            System.out.println("Book not found in patron's borrowed list.");
        }
    }
}
