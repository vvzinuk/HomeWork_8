package com.epam.model;

public class Books {
    private int arraySize;
    private static int index = 0;
    private Book[] array;


    public Books(int arraySize) {
        this.arraySize = arraySize;
        this.array = new Book[arraySize];
    }

    public void addBook(String title, String author, String publisher, int yearOfPublication, int numberOfPages, double price){
        if (index < array.length){
            array[index] = new Book(title, author, publisher, yearOfPublication, numberOfPages, price );
            index ++;
        }
    }

    @Override
    public String toString(){
        String result = "";
        for (Book element : array) {
         result += element.toString();
        }
        return result;
    }

    public void changePrice(int percent){
        for(Book element: array) {
            double price = element.getPrice();
            element.setPrice( price * ( 1 + (double)percent / 100) );
        }
    }

    public Books findBooksByAuthor(String author){
        if (findAmountByAuthor(author) == 0)
            return null;
        int capacity = findAmountByAuthor(author);
        Books result = new Books(capacity);
        int j = 0;
        for (Book element: result.array){
            if (element.getAuthor().toLowerCase().contains(author.toLowerCase())){
                result.array[j] = element;
                j++;
            }
        }
        return result;
    }

    private int findAmountByAuthor(String author){
        int number = 0;
        for (Book element: array) {
            if (element.getAuthor().toLowerCase().contains(author.toLowerCase()))
                number++;
        }
        return number;
    }

    public Books findBooksByYear(int yearOfPublication){
        if (findAmountByYear(yearOfPublication) == 0){
            return null;
        }
        Books result = new Books(findAmountByYear(yearOfPublication));
        int j = 0;
        for (Book element: array){
            if (element.getYearOfPublication() > yearOfPublication){
                result.array[j] = element;
                j++;
            }
        }
        return result;
    }

    private int findAmountByYear(int year){
        int number = 0;
        for (Book element: array) {
            if ((element.getYearOfPublication() > year) && year > 0)
                number++;
        }
        return number;
    }

    public boolean checkIsNull (){
        if (arraySize == 0){
            return true;
        } else {
            return false;
        }
    }
}
