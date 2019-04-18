package com.epam.view;

public class Messenger {

    public void printMessage(String message) {
        System.out.print(message);
    }

    public void printTitles(){
        System.out.printf("%-3s%-35s%-20s%-14s%6s%6s%7s%n", "ID","TITLE","AUTHOR","PUBLISHER","YEAR","PAGES","PRICE");
    }
}
