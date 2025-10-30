import java.util.Arrays;

public class Library {
    private Book[] books;

    public Library() {
        this.books = new Book[0];
    }

    public void addBook(Book bookToAdd) {
        Book[] newBooks = Arrays.copyOf(this.books, this.books.length + 1);
        newBooks[newBooks.length - 1] = bookToAdd;
        this.books = newBooks;
    }

    public void removeBook() {
        if (this.books.length > 0) {
            Book[] newBooks = Arrays.copyOf(this.books, this.books.length - 1);
            this.books = newBooks;
        } else {
            System.out.println("Библиотека пустая");
        }
    }

    public void printAllBooksInfo() {
        System.out.println("Содержимое библиотеки:");
        if (books.length == 0) {
            System.out.println("(пусто)");
            return;
        }
        
        for (Book book : this.books) {
            System.out.println(" - " + book.toString());
        }
    }
}