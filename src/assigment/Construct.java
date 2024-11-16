package assigment;

//Define the Book class
public class Construct {
 // Private instance variables
 private String title;
 private String author;
 private int price;

 // Default constructor
 public Construct() {
     // Initialize title to "Unknown"
     this.title = "Unknown";
     // Initialize author to "Unknown"
     this.author = "Unknown";
     // Initialize price to 0.0
     this.price = 0;
 }

 // Parameterized constructor (title, author)
 public Construct(String title, String author) {
     // Initialize title with the provided parameter
     this.title = title;
     // Initialize author with the provided parameter
     this.author = author;
     // Initialize price to 0.0
     this.price = 0;
 }

 // Parameterized constructor (title, author, price)
 public Construct(String title, String author, int price) {
     // Initialize title with the provided parameter
     this.title = title;
     // Initialize author with the provided parameter
     this.author = author;
     // Initialize price with the provided parameter
     this.price = price;
 }

 // Main method to test the Book class
 public static void main(String[] args) {
     // Create a new Book object using the default constructor
     Construct book1 = new Construct();
     // Print the values of the instance variables for book1
     System.out.println("Book1 Title: " + book1.title);
     System.out.println("Book1 Author: " + book1.author);
     System.out.println("Book1 Price: " + book1.price);

     // Create a new Book object using the parameterized constructor (title, author)
     Construct book2 = new Construct("Amatka", "Karin Tidbeck");
     // Print the values of the instance variables for book2
     System.out.println("Book2 Title: " + book2.title);
     System.out.println("Book2 Author: " + book2.author);
     System.out.println("Book2 Price: " + book2.price);

     // Create a new Book object using the parameterized constructor (title, author, price)
     Construct book3 = new Construct("Altered Carbon", "Richard K. Morgan", 18);
     // Print the values of the instance variables for book3
     System.out.println("Book3 Title: " + book3.title);
     System.out.println("Book3 Author: " + book3.author);
     System.out.println("Book3 Price: " + book3.price);
 }
}