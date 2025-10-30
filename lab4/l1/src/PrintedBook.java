public class PrintedBook extends Book {
    private int pageCount;
    public PrintedBook(String title, String author, int pageCount) {
        super(title, author);
        this.pageCount = pageCount;
    }

    public int getPageCount() {
        return pageCount;
    }
    public void setPageCount(int pageCount) {
        this.pageCount = pageCount;
    }

    @Override
    public String toString() {
        return "Печатная книга [Название: '" + getTitle() + "', Автор: '" + getAuthor() + "', Страниц: " + pageCount + "]";
    }
}