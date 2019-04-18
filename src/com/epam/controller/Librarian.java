package com.epam.controller;

import com.epam.model.*;
import com.epam.view.*;

import java.util.Scanner;

public class Librarian {
    private Books model = new Books(5);
    private Messenger view = new Messenger();
    private boolean status = true;
    private Scanner scanner = new Scanner(System.in);

    public void run(){

        model.addBook("Animal Farm",                       "George Orwell",        "London", 1988,600,29.99);
        model.addBook("The Great Gatsby",                  "F. Scott Fitzgerald",  "Chicago",1988,600,29.99);
        model.addBook("To Kill a Mockingbird",             "Harper Lee",           "Seattle",1992,350,20);
        model.addBook("H. Potter and the Sorcerer's Stone","J.K. Rowling",         "London", 2003,320,15.5);
        model.addBook("1984",                              "George Orwell",        "Glasgow",1975,300,35);


        while(status) {
            view.printMessage( Messages.MENU );
            switcher( InputUtility.inputIntValueWithScanner(view) );
        }
    }

    private void switcher (int position){
        switch (position){
            case 1:
                view.printTitles();
                System.out.println(model.toString());
                break;
            case 2:
                view.printMessage(Messages.INPUT_PERCENT);
                model.changePrice(InputUtility.inputIntValueWithScanner(view));
                view.printTitles();
                view.printMessage(model.toString());
                break;
            case 3:
                view.printMessage(Messages.INPUT_AUTHOR);
                view.printTitles();
                view.printMessage(model.findBooksByAuthor(InputUtility.inputStringValueWithScanner(view)).toString());
                break;
            case 4:
                view.printMessage(Messages.INPUT_YEAR);
                view.printTitles();
                view.printMessage(model.findBooksByYear(InputUtility.inputIntValueWithScanner(view)).toString());
                break;
            case 5:
                try {
                    view.printTitles();
                    view.printMessage(model.sortByAuthorDesc().toString());
                } catch (CloneNotSupportedException e) {
                    e.printStackTrace();
                }
                break;
            case 6:
                try {
                    view.printTitles();
                    view.printMessage(model.sortByPublisherDesc().toString());
                } catch (CloneNotSupportedException e) {
                    e.printStackTrace();
                }
                break;
            case 7:
                try {
                    view.printTitles();
                    view.printMessage(model.sortByPriceAsc().toString());
                } catch (CloneNotSupportedException e) {
                    e.printStackTrace();
                }
                break;
            case 8:
                status = false;
        }
    }
}
