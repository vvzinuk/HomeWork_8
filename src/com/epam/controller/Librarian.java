package com.epam.controller;

import com.epam.model.*;
import com.epam.view.*;

public class Librarian {
    private Books model;
    private Messenger view;

    public Librarian (Books model){
        this.model = model;
        this.view = new Messenger();
    }

    public void showAllBooks () {
        if (model.checkIsNull()){
            view.printMessage(Messenger.LIBRARY_IS_EMPTY);
        } else {
            view.printTitles();
            model.showAllBooks();
        }
    }

    public void changePrice(){
        if (model.checkIsNull()){
            view.printMessage(Messenger.LIBRARY_IS_EMPTY);
        } else {
            model.changePrice(InputUtility.inputIntValueWithScanner(view, Messenger.INPUT_PERCENT));
            showAllBooks();
        }
    }

    public void findBooksByAuthor(){
        if (model.checkIsNull()){
            view.printMessage(Messenger.LIBRARY_IS_EMPTY);
        } else {
            model.findBooksByAuthor(InputUtility.inputStringValueWithScanner(view)).showAllBooks();
        }
    }

    public void findBooksByYear(){
        if (model.checkIsNull()){
            view.printMessage(Messenger.LIBRARY_IS_EMPTY);
        } else {
            model.findBooksByYear(InputUtility.inputIntValueWithScanner(view, Messenger.INPUT_YEAR)).showAllBooks();
        }
    }
}
