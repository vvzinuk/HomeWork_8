public class Main {
    public static void main(String[] args) {
        Books library = new Books( 4 );
        library.addBook( library,"The Great Gatsby","F. Scott Fitzgerald", "unknown",1988,600,29.99);
        library.addBook( library,"To Kill a Mockingbird","Harper Lee", "unknown", 1992, 350,20 );
        library.addBook( library,"Harry Potter and the Sorcerer's Stone", "J.K. Rowling","unknown",2003,320,15.5 );
        library.addBook( library,"1984", "George Orwell", "unknown", 1975, 300, 35 );

        library.showAllBooks( library );

    }
}
