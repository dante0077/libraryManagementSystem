package com.library.services;

import com.library.models.Patron;

import java.util.HashMap;
import java.util.Map;

public class PatronService {
    private final Map<String, Patron> patrons = new HashMap<>();

    // Add a new patron
    public void addPatron(Patron patron) {
        if (patrons.containsKey(patron.getPatronId())) {
            System.out.println("Patron already exists with ID: " + patron.getPatronId());
        } else {
            patrons.put(patron.getPatronId(), patron);
            System.out.println("Patron added: " + patron);
        }
    }

    // Update a patron
    public void updatePatron(String patronId, Patron updatedPatron) {
        if (patrons.containsKey(patronId)) {
            patrons.put(patronId, updatedPatron);
            System.out.println("Patron updated: " + updatedPatron);
        } else {
            System.out.println("No patron found with ID: " + patronId);
        }
    }

    // Get patron by ID
    public Patron getPatronById(String patronId) {
        return patrons.get(patronId);
    }

    // Print all patrons
    public void printAllPatrons() {
        for (Patron patron : patrons.values()) {
            System.out.println(patron);
        }
    }
}
