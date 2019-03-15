public class Books {
    int arraySize;
    static int index = 0;
    Book[] array;

    public Books(int arraySize) {
        this.arraySize = arraySize;
        array = new Book[arraySize];
    }

    public void addBook(Books myLibrary){
        if (index < array.length){
            array[index] = new Book(  );
            index ++;
        }else {
            System.out.println("We don't have enough space for this book!");
        }
    }

    public void addBook(Books myLibrary, String title, String author, String publisher, int yearOfPublication, int numberOfPages, double price){
        if (index < myLibrary.array.length){
            array[index] = new Book(title, author, publisher, yearOfPublication, numberOfPages, price );
            index ++;
        }else {
            System.out.println("We don't have enough space for this book!");
        }
    }


    public void showAllBooks(Books b){
        for(Book element: b.array) {
            Book.view( element );
        }
    }

    public void changePrice(Books b, int percent){
        for(Book element: b.array) {
            double price = element.getPrice();
            element.setPrice( price *  );
        }
    }

    public void findBooksByAuthor(){

    }

    public void findBooksByYear(){

    }
}
