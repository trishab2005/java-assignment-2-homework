//@author: Trisha Basak


  import javax.swing.*;

  class Book {
      private String title;
      private String author;
      private String ISBN;
  
       // Getters&Setters
      public String getTitle() {
          return this.title;
      }
      public void setTitle(String title) {
          this.title = title;
      }
      
      
      public String getAuthor() {
          return this.author;
      }
      public void setAuthor(String author) {
          this.author = author;
      }
      
      public String getISBN() {
          return this.ISBN;
      }
      public void setISBN(String ISBN) {
          this.ISBN = ISBN;
      }
  
     
    
  
     
      // Method to display book details
      public void displayBook() {
          System.out.println("Title: " + title + ", Author: " + author + ", ISBN: " + ISBN);
      }
  }
  
  class BookManager {
      private static Book[] books = new Book[5]; // Fixed-size array for books
      private static int count = 0; // Tracks the number of books
  
      public static void addBook(String title, String author, String ISBN) {
          if (count < books.length) {
              Book book = new Book();
              book.setTitle(title);
              book.setAuthor(author);
              book.setISBN(ISBN);
              books[count++] = book;
              JOptionPane.showMessageDialog(null, "Book added successfully!");
          } else {
              JOptionPane.showMessageDialog(null, "Book list is full!");
          }
      }
  
      public static void removeBook(String ISBN) {
          for (int i = 0; i < count; i++) {
              if (books[i].getISBN().equals(ISBN)) {
                  // Shift the remaining books to fill the gap
                  for (int j = i; j < count - 1; j++) {
                      books[j] = books[j + 1];
                  }
                  books[--count] = null;
                  JOptionPane.showMessageDialog(null, "Book removed successfully!");
                  return;
              }
          }
          JOptionPane.showMessageDialog(null, "Book with ISBN " + ISBN + " not found!");
      }
  
      public static void displayBooks() {
          if (count == 0) {
              System.out.println("No books available.");
              return;
          }
          System.out.println("Books in the library:");
          for (int i = 0; i < count; i++) {
              books[i].displayBook();
          }
      }
  
      public static void main(String[] args) {
          while (true) {
              String[] options = {"Add Book", "Remove Book", "Display Books", "Exit"};
              int choice = JOptionPane.showOptionDialog(null, "Choose an option", "Book Management",
                      JOptionPane.DEFAULT_OPTION, JOptionPane.INFORMATION_MESSAGE, null, options, options[0]);
  
              if (choice == 0) { // Add book
                  String title = JOptionPane.showInputDialog("Enter Book Title:");
                  String author = JOptionPane.showInputDialog("Enter Book Author:");
                  String ISBN = JOptionPane.showInputDialog("Enter Book ISBN:");
                  addBook(title, author, ISBN);
              } else if (choice == 1) { // Remove book
                  String ISBN = JOptionPane.showInputDialog("Enter ISBN of Book to Remove:");
                  removeBook(ISBN);
              } else if (choice == 2) { // Display books
                  displayBooks();
              } else { // Exit
                  break;
              }
          }
      }
  }