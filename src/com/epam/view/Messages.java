package com.epam.view;

public interface Messages {
    String LIBRARY_IS_EMPTY = "Library is empty.";
    String YEAR_SEARCH_EMPTY = "We don't have any books written in this year and after\n";
    String AUTHOR_SEARCH_EMPTY = "We don't have any books written by thi  author\n";
    String INPUT_PERCENT = "Enter the percent: ";
    String INPUT_AUTHOR = "Enter author name: ";
    String INPUT_YEAR = "Enter minimal year of book publishing: ";
    String WRONG_INPUT_INT_DATA = "Wrong input! Repeat please! ";
    String MENU = "Choose action: \n" +
            "1. Show all books\n" +
            "2. Change price\n" +
            "3. Find books by author\n" +
            "4. Find books by year\n" +
            "5. Sort by Author's name (Desc)\n" +
            "6. Sort by Publisher (Desc)\n" +
            "7. Sort by Price (Asc)\n" +
            "8. Close program\n";
}
