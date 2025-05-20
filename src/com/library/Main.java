package com.library;

import com.library.models.Book;
import com.library.services.BookService;

import com.library.models.Patron;
import com.library.services.PatronService;

import com.library.services.LendingService;

public class Main {
    public static void main(String[] args) {
        BookService bookService = new BookService();

        // Add books
        Book book1 = new Book("Clean Code", "Robert C. Martin", "1234567890", 2008);
        Book book2 = new Book("Effective Java", "Joshua Bloch", "0987654321", 2018);

        bookService.addBook(book1);
        bookService.addBook(book2);

        // Print all books
        System.out.println("\nAll books:");
        bookService.printAllBooks();

        // Search by author
        System.out.println("\nSearch by author 'Martin':");
        bookService.searchByAuthor("Martin").forEach(System.out::println);

        // Update book
        Book updatedBook = new Book("Clean Code (Updated)", "Robert C. Martin", "1234567890", 2010);
        bookService.updateBook("1234567890", updatedBook);

        // Remove book
        bookService.removeBook("0987654321");

        // Final book list
        System.out.println("\nFinal book list:");
        bookService.printAllBooks();


        // ---- Patron Management ----
        PatronService patronService = new PatronService();

        // Add patrons
        Patron patron1 = new Patron("P001", "Alice Johnson", "alice@example.com");
        Patron patron2 = new Patron("P002", "Bob Smith", "bob@example.com");

        patronService.addPatron(patron1);
        patronService.addPatron(patron2);

        // Print all patrons
        System.out.println("\nAll patrons:");
        patronService.printAllPatrons();

        // Update a patron
        Patron updatedPatron = new Patron("P001", "Alice J.", "alice.j@example.com");
        patronService.updatePatron("P001", updatedPatron);

        // Get and display updated patron
        System.out.println("\nUpdated patron:");
        System.out.println(patronService.getPatronById("P001"));

        // ---- Lending Process ----
        LendingService lendingService = new LendingService(bookService, patronService);

        // Checkout a book
        System.out.println("\n-- Checking out book --");
        lendingService.checkoutBook("1234567890", "P001");

        // Try to checkout the same book again (should fail)
        lendingService.checkoutBook("1234567890", "P002");

        // Return the book
        System.out.println("\n-- Returning book --");
        lendingService.returnBook("1234567890", "P001");

        // Try to return it again (should fail)
        lendingService.returnBook("1234567890", "P001");
    }
}
