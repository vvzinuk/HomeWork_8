import java.util.Scanner;

public class Books {
    private int arraySize;
    private static int index = 0;
    private Book[] array;

    Books(int arraySize) {
        this.arraySize = arraySize;
        array = new Book[arraySize];
    }

    //method which use default constructor of Book
    public void addBook(Books b){
        if (index < b.array.length){
            array[index] = new Book(  );
            index ++;
        }else {
            System.out.println("We don't have enough space for this book!");
        }
    }

    static void addBook(Books b, String title, String author, String publisher,
                        int yearOfPublication, int numberOfPages, double price){
        if (index < b.array.length){
            b.array[index] = new Book(title, author, publisher, yearOfPublication, numberOfPages, price );
            index ++;
        }else {
            System.out.println("We don't have enough space for this book!");
        }
    }

    static void showAllBooks(Books b){
        if (b != null) {
            System.out.printf("%-3s%-35s%-20s%-14s%6s%6s%7s%n",
                    "ID","TITLE","AUTHOR","PUBLISHER","YEAR","PAGES","PRICE");
            for (Book element : b.array) {
                Book.view(element);
            }
        } else {
            System.out.println("Sorry, we can not find anything to print.");
        }
    }

    static void changePrice(Books b){
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the percentage: ");
        int percent = scanner.nextInt();
        if (percent > 0){
            for(Book element: b.array) {
                double price = element.getPrice();
                element.setPrice( price * ( 1 + (double)percent / 100) );
            }
        } else {
            for (Book element : b.array) {
                double price = element.getPrice();
                element.setPrice( price * ( 1 + (double)percent / 100) );
            }
        }
    }

    static Books findBooksByAuthor(Books b){
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter author name: ");
        String author = scanner.nextLine();
        int number = 0;
        for (Book element: b.array) {
            if (element.getAuthor().toLowerCase().contains(author.toLowerCase()))
                number++;
        }
        if (number == 0)
            System.out.println("Sorry, we didn't found any books written by this author in our library.");
        Books result = new Books(number);
        for (int i = 0, j = 0; i < b.array.length; i++, j++) {
            if (b.array[i].getAuthor().toLowerCase().contains(author.toLowerCase())){
                result.array[j] = b.array[i];
            } else {
                j--;
            }
        }
        return result;
    }

    static Books findBooksByYear(Books b){
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter minimum year of book publishing: ");
        int yearOfPublication = scanner.nextInt();
        int number = 0;
        for (Book element: b.array) {
            if ((element.getYearOfPublication() > yearOfPublication) && yearOfPublication > 0)
                number++;
        }
        if (number == 0){
            System.out.println("Sorry, we didn't found any books published after this year in our library.");
            return null;
        }
        Books result = new Books(number);
        for (int i = 0, j = 0; i < b.array.length; i++, j++) {
            if (b.array[i].getYearOfPublication() > yearOfPublication){
                result.array[j] = b.array[i];
            } else {
                j--;
            }
        }
        return result;
    }
}
