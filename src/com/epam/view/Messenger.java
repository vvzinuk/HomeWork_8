package com.epam.view;

public class Messenger {
    public static final String LIBRARY_IS_FULL = "We don't have enough space for this book!";
    public static final String LIBRARY_IS_EMPTY = "Library is empty.";
    public static final String INPUT_PERCENT = "Enter the percent: ";
    public static final String INPUT_AUTHOR = "Enter author name: ";
    public static final String INPUT_YEAR = "Enter minimum year of book publishing: ";
    public static final String WRONG_INPUT_DATA = "Wrong input! Repeat please! ";
    public static final String WRONG_INPUT_INT_DATA = "Wrong input! Repeat please! ";

    public void printMessage(String message) {
        System.out.print(message);
    }

    public void printTitles(){
        System.out.printf("%-3s%-35s%-20s%-14s%6s%6s%7s%n", "ID","TITLE","AUTHOR","PUBLISHER","YEAR","PAGES","PRICE");
    }
}
