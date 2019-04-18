package com.epam.controller;

import com.epam.model.*;
import com.epam.view.*;

import java.util.Scanner;

public class Librarian {
    private Books model = new Books(5);
    private Messenger view = new Messenger();
    private boolean status = true;
    private Scanner scanner = new Scanner(System.in);

    public Librarian (){
    }

    public void showAllBooks () {
        if (model.checkIsNull()){
            view.printMessage(Messages.LIBRARY_IS_EMPTY);
        } else {
            view.printTitles();
            view.printMessage(model.toString());
        }
    }

    public void changePrice(){
        if (model.checkIsNull()){
            view.printMessage(Messages.LIBRARY_IS_EMPTY);
        } else {
            model.changePrice(InputUtility.inputIntValueWithScanner(view));
            showAllBooks();
        }
    }

    public void findBooksByAuthor(){
        if (model.checkIsNull()){
            view.printMessage(Messages.LIBRARY_IS_EMPTY);
        } else {
            Books temp = model.findBooksByAuthor(InputUtility.inputStringValueWithScanner(view));
            view.printMessage(temp.toString());
        }
    }

    public void findBooksByYear(){
        if (model.checkIsNull()){
            view.printMessage(Messages.LIBRARY_IS_EMPTY);
        } else {
            view.printMessage(model.findBooksByYear(InputUtility.inputIntValueWithScanner(view)).toString());
        }
    }

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
                view.printMessage(model.findBooksByAuthor(scanner.nextLine()).toString());
                break;
//            case 3:
//                view.printWithLabel( CIRCLE_TOTAL, Shape.roundDouble(Shapes.calcTotalAreaByShapes()[0] ));
//                view.printWithLabel( RECTANGLES_TOTAL, Shape.roundDouble(Shapes.calcTotalAreaByShapes()[1] ));
//                view.printWithLabel( TRIANGLES_TOTAL, Shape.roundDouble(Shapes.calcTotalAreaByShapes()[2] ));
//                break;
            case 4:
                status = false;
        }
    }
}
