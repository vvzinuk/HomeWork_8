package com.epam.model;
import java.util.Arrays;
import java.util.Comparator;

public class Books implements Cloneable {
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
        StringBuilder result = new StringBuilder(  );
        for (Book element : array) {
         result.append( element.toString());
        }
        return result.toString();
    }

    public void changePrice(int percent){
        for(Book element: array) {
            double price = element.getPrice();
            element.setPrice( price * ( 1 + (double)percent / 100) );
        }
    }

    public Books findBooksByAuthor(String author){
        int capacity = findAmountByAuthor(author);
        if (capacity == 0)
            return null;
        Books result = new Books(capacity);
        int j = 0;
        for (Book element: this.array){
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
            if (element.getYearOfPublication() >= yearOfPublication){
                result.array[j] = element;
                j++;
            }
        }
        return result;
    }

    private int findAmountByYear(int year){
        int number = 0;
        for (Book element: array) {
            if ((element.getYearOfPublication() >= year))
                number++;
        }
        return number;
    }

    private Books makeCloneOfBooks()throws CloneNotSupportedException {
        Books temp = (Books) super.clone();
        temp.array = this.array.clone();
        return temp;
    }

    public Books sortByAuthorDesc() throws CloneNotSupportedException {
        Books temp = makeCloneOfBooks();
        Arrays.sort(temp.array, new Comparator<Book>(){
            @Override
            public int compare(Book o1, Book o2) {
                String author1 = o1.getAuthor();
                String author2 = o2.getAuthor();
                return author1.compareTo(author2);
            }
        });
        return temp;
    }

    public Books sortByPublisherDesc() throws CloneNotSupportedException {
        Books temp = makeCloneOfBooks();
        Arrays.sort(temp.array, new Comparator<Book>(){
            @Override
            public int compare(Book o1, Book o2) {
                String pub1 = o1.getPublisher();
                String pub2 = o2.getPublisher();
                return pub1.compareTo(pub2);
            }
        });
        return temp;
    }

    public Books sortByPriceAsc() throws CloneNotSupportedException {
        Books temp = makeCloneOfBooks();
        Arrays.sort(temp.array, new Comparator<Book>(){
            @Override
            public int compare(Book o1, Book o2) {
                double price1 = o1.getPrice();
                double price2 = o2.getPrice();
                return Double.compare(price2,price1);
            }
        });
        return temp;
    }
}
