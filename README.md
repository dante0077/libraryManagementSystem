# Library Management System

## Overview

This project is a **Library Management System** implemented in Java. It helps librarians efficiently manage books, patrons, and lending processes through a simple console-based application following Object-Oriented Programming principles and SOLID design.

---

## Features

- **Book Management**:  
  Add, remove, update books and search by title, author, or ISBN.

- **Patron Management**:  
  Add new patrons, update their information, and track borrowing history.

- **Lending Process**:  
  Checkout and return books, with inventory tracking of available and borrowed copies.

---

## Design Principles

- Applied **OOP concepts**: encapsulation, inheritance, abstraction, and polymorphism.
- Followed **SOLID principles** to keep the code modular and extensible.
- Used **design patterns**:
    - **Factory Pattern** for creating instances (e.g., BookFactory, PatronFactory).
    - **Observer Pattern** for notifying system components of lending events.
- Utilized Java collections (`List`, `Map`) for data management.

---

## Project Structure

```plaintext
library-management-system/
├── src/
│   ├── main/
│   │   ├── java/
│   │   │   └── com/
│   │   │       └── library/
│   │   │           ├── model/
│   │   │           │   ├── Book.java
│   │   │           │   ├── Patron.java
│   │   │           │   └── Lending.java
│   │   │           ├── service/
│   │   │           │   ├── BookService.java
│   │   │           │   ├── PatronService.java
│   │   │           │   └── LendingService.java
│   │   │           └── Main.java
└── README.md
```

---

## Class Diagram

![Class Diagram](https://uml.planttext.com/plantuml/svg/XLHDJuD04BtpApQSq4gZLs9CHG-ID4rZlNXSbhNTbEusor3J6F-xmtuK5ffu0URDrvkProuQe1hQGnsncZODoPNQav-8a9I0W9fdP0DQoAr1Q0ixfGEesEIh03YsPIqO1Q7a9wSOB2IWOqQs73wwYicDDvzDkTxkQlNMEYo4Zj_8aLnJq4ewcgBoFL8YwI5ap9G4og2GNoh0IwMr-aRhJJIWz3aZI_nuN79P8VXqOLJrV5POkxTU-i8Ef5ML-whld2bT9JMMjHK7v1tYsDVMAWP3b7Y2p1p2BjGCcxcXXqcl573QxcbGpQ7LSWJYUQ5j1hFF2DjnjbSjEDushMitN75dRxW-2SODKpSV1fMMcqy-g1Ctk6XAwVjOPtkiaCOqgS5pibrdvsShYK1gqo0db51-qp2Zdv36I3AJYIoS7FrwXyIl-_3s-KWyYJsHk-7qr65Nltwx5tmK0yPtP5HhTA5_ux6t-tN43p59KnBVp-UtyKLrsKJwaNVPX2VpDkgxvd0gNA2h-zFu0m00)

*The class diagram above illustrates the relationships between the core classes in the system.*

---

## Clone the repository:
   ```bash
   git@github.com:dante0077/libraryManagementSystem.git
