public class EBook extends Book {
    private double fileSizeMB;

    public EBook(String title, String author, double fileSizeMB) {
        super(title, author);
        this.fileSizeMB = fileSizeMB;
    }

    public double getFileSizeMB() {
        return fileSizeMB;
    }
    public void setFileSizeMB(double fileSizeMB) {
        this.fileSizeMB = fileSizeMB;
    }

    @Override
    public String toString() {
        return "Электронная книга [Название: '" + getTitle() + "', Автор: '" + getAuthor() + "', Размер: " + fileSizeMB + " МБ]";
    }
}