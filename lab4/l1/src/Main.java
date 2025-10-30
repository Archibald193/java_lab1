public class Main {
    public static void main(String[] args) {
        PrintedBook book1 = new PrintedBook("Война и мир", "Лев Николаевич Толстой", 1300);
        EBook book2 = new EBook("Гарри Поттер", "Джоан Роулинг", 5.5);
        PrintedBook book3 = new PrintedBook("Мастер и Маргарита", "Михаил Афанасьевич Булгаков", 480);
        EBook book4 = new EBook("Маленький принц", "Антуан де Сент-Экзюпери", 2.2);
        
        Library myLibrary = new Library();
        
        myLibrary.addBook(book1);
        myLibrary.addBook(book2);
        myLibrary.addBook(book3);
        myLibrary.addBook(book4);
        
        System.out.println("Библиотека");
        myLibrary.printAllBooksInfo();
        
        System.out.println("\nМинус последняя книга");
        myLibrary.removeBook();
        myLibrary.printAllBooksInfo();
    }
}