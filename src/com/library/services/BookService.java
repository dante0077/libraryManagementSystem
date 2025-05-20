package com.library.services;

import com.library.models.Book;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class BookService {
    private final Map<String, Book> bookInventory = new HashMap<>();

    // Add a book
    public void addBook(Book book) {
        if (bookInventory.containsKey(book.getIsbn())) {
            System.out.println("Book with ISBN already exists.");
        } else {
            bookInventory.put(book.getIsbn(), book);
            System.out.println("Book added:" + book);
        }
    }

    // Remove a book
    public void removeBook(String isbn) {
        if (bookInventory.containsKey(isbn)) {
            Book removed = bookInventory.remove(isbn);
            System.out.println("Book removed: " + removed);
        } else {
            System.out.println("No book found with ISBN: " + isbn);
        }
    }

    // Update a book
    public void updateBook(String isbn, Book updatedBook) {
        if (bookInventory.containsKey(isbn)) {
            bookInventory.put(isbn, updatedBook);
            System.out.println("Book updated: " + updatedBook);
        } else {
            System.out.println("No book found with ISBN: " + isbn);
        }
    }

    // Get a book by ISBN
    public Book getBookByIsbn(String isbn) {
        return bookInventory.get(isbn);
    }

    // Search books by title
    public List<Book> searchByTitle(String title) {
        List<Book> result = new ArrayList<>();
        for (Book book : bookInventory.values()) {
            if (book.getTitle().toLowerCase().contains(title.toLowerCase())) {
                result.add(book);
            }
        }
        return result;
    }

    // Search books by author
    public List<Book> searchByAuthor(String author) {
        List<Book> result = new ArrayList<>();
        for (Book book : bookInventory.values()) {
            if (book.getAuthor().toLowerCase().contains(author.toLowerCase())) {
                result.add(book);
            }
        }
        return result;
    }

    // Print all books
    public void printAllBooks() {
        for (Book book : bookInventory.values()) {
            System.out.println(book);
        }
    }
}
