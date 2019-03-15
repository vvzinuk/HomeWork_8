public class Main {
    public static void main(String[] args) {
//creating new Books object
        Books library = new Books( 5 );
//explicit initialisation of elements inside Books object array field
        Books.addBook( library,"Animal Farm",                       "George Orwell",        "London", 1988,600,29.99);
        Books.addBook( library,"The Great Gatsby",                  "F. Scott Fitzgerald",  "Chicago",1988,600,29.99);
        Books.addBook( library,"To Kill a Mockingbird",             "Harper Lee",           "Seattle",1992,350,20);
        Books.addBook( library,"H. Potter and the Sorcerer's Stone","J.K. Rowling",         "London", 2003,320,15.5);
        Books.addBook( library,"1984",                              "George Orwell",        "Glasgow",1975,300,35);
//print all elements
        Books.showAllBooks(library);
//change value of price
        Books.changePrice(library);
        Books.showAllBooks(library);
//find books by author
        Books.showAllBooks(Books.findBooksByAuthor(library));
//find books by year
        Books.showAllBooks(Books.findBooksByYear(library));
    }
}
