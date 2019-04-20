package com.epam.controller;

import com.epam.model.*;
import com.epam.validator.Validator;
import com.epam.view.*;

public class Librarian {
    private Books model = new Books(5);
    private Messenger view = new Messenger();
    private boolean status = true;

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
                view.printMessage( model );
                break;
            case 2:
                view.printMessage(Messages.INPUT_PERCENT);
                int percent;
                try {
                    percent = Validator.checkPercent( InputUtility.inputIntValueWithScanner(view) );
                    model.changePrice(percent);
                    view.printTitles();
                    view.printMessage(model);
                } catch (Validator.WrongPercentException e) {
                    view.printMessage( e.getMessage() );
                }
                break;
            case 3:
                view.printMessage(Messages.INPUT_AUTHOR);
                try {
                    String author = Validator.checkAuthor( InputUtility.inputStringValueWithScanner(view) );
                    view.printTitles();
                    view.printMessage(model.findBooksByAuthor(author));
                } catch (Validator.WrongAuthorException e) {
                    view.printMessage( e.getMessage() );
                } catch (NullPointerException e){
                    view.printMessage( Messages.AUTHOR_SEARCH_EMPTY );
                }
                break;
            case 4:
                view.printMessage(Messages.INPUT_YEAR);
                int year;
                try {
                    year = Validator.checkYear( InputUtility.inputIntValueWithScanner(view) );
                    view.printTitles();
                    view.printMessage(model.findBooksByYear(year));
                } catch (Validator.WrongYearException e) {
                    view.printMessage(  e.getMessage() );
                } catch (NullPointerException e){
                    view.printMessage( Messages.YEAR_SEARCH_EMPTY );
                }
                break;
            case 5:
                try {
                    view.printTitles();
                    view.printMessage(model.sortByAuthorDesc());
                } catch (CloneNotSupportedException e) {
                    view.printMessage( e.getMessage() );
                }
                break;
            case 6:
                try {
                    view.printTitles();
                    view.printMessage(model.sortByPublisherDesc());
                } catch (CloneNotSupportedException e) {
                    view.printMessage( e.getMessage() );
                }
                break;
            case 7:
                try {
                    view.printTitles();
                    view.printMessage(model.sortByPriceAsc());
                } catch (CloneNotSupportedException e) {
                    view.printMessage( e.getMessage() );
                }
                break;
            case 8:
                status = false;
        }
    }
}
