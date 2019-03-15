public class Book {
    private static  int counter = 1;
    private int id;
    private String title;
    private String author;
    private String publisher;
    private int yearOfPublication;
    private int numberOfPages;
    private double price;

    public int getId() {
        return id;
    }
    public String getTitle() {
        return title;
    }
    public String getAuthor() {
        return author;
    }
    public String getPublisher() {
        return publisher;
    }
    public int getYearOfPublication() {
        return yearOfPublication;
    }
    public int getNumberOfPages() {
        return numberOfPages;
    }
    public double getPrice() {
        return price;
    }

    public void setId(int id) {
        this.id = id;
    }
    public void setTitle(String title) {
        this.title = title;
    }
    public void setAuthor(String author) {
        this.author = author;
    }
    public void setPublisher(String publisher) {
        this.publisher = publisher;
    }
    public void setYearOfPublication(int yearOfPublication) {
        this.yearOfPublication = yearOfPublication;
    }
    public void setNumberOfPages(int numberOfPages) {
        this.numberOfPages = numberOfPages;
    }
    public void setPrice(double price) {
        this.price = price;
    }

    public Book() {
        this.id = counter;
        counter++;
    }

    public Book(String title, String author, String publisher, int yearOfPublication, int numberOfPages, double price) {
        this.id = counter;
        this.title = title;
        this.author = author;
        this.publisher = publisher;
        this.yearOfPublication = yearOfPublication;
        this.numberOfPages = numberOfPages;
        this.price = price;
        counter++;
    }

    public static void view(Book b){
        System.out.printf("%-3d%-35s%-20s%-14s%6d%6d%7.2f%n",
                b.id,b.title,b.author,b.publisher,b.yearOfPublication,b.numberOfPages,b.price);
    }
}
