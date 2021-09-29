public class Book {
    private int pages;
    private String author;

    public Book(int pages, String author) {
        this.pages = pages;
        this.author = author;
    }

    public int getPages() {
        return pages;
    }

    public void setPages(int pages) {
        this.pages = pages;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }
    public String toString() {
        return "Автор: " + this.author + ", количество страниц: " + this.pages;
    }
}
