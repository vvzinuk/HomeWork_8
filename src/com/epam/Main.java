package com.epam;
import com.epam.model.*;
import com.epam.controller.Librarian;

public class Main {
    public static void main(String[] args) {
//creating new com.epam.model.Books object
        Books library = new Books( 5 );
//explicit initialisation of elements inside com.epam.model.Books object array field
        library.addBook("Animal Farm",                       "George Orwell",        "London", 1988,600,29.99);
        library.addBook("The Great Gatsby",                  "F. Scott Fitzgerald",  "Chicago",1988,600,29.99);
        library.addBook("To Kill a Mockingbird",             "Harper Lee",           "Seattle",1992,350,20);
        library.addBook("H. Potter and the Sorcerer's Stone","J.K. Rowling",         "London", 2003,320,15.5);
        library.addBook("1984",                              "George Orwell",        "Glasgow",1975,300,35);

        Librarian mrJones = new Librarian(library);
        mrJones.showAllBooks();
        mrJones.changePrice();
        mrJones.findBooksByAuthor();
        mrJones.findBooksByYear();
    }
}
