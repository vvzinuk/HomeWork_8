package com.epam.view;

public interface Messages {
    String LIBRARY_IS_FULL = "We don't have enough space for this book!";
    String LIBRARY_IS_EMPTY = "Library is empty.";
    String INPUT_PERCENT = "Enter the percent: ";
    String INPUT_AUTHOR = "Enter author name: ";
    String INPUT_YEAR = "Enter minimal year of book publishing: ";
    String WRONG_INPUT_INT_DATA = "Wrong input! Repeat please! ";
    String MENU = "Choose action: \n" +
            "1. Show all books\n" +
            "2. Change price\n" +
            "3. Find books by author\n" +
            "4. Find books by year\n" +
            "5. Close program\n";
}
