package kr.bit;
// 책을 설계
public class Book {

    private String title;
    private String publisher;
    private int price;
    private int pages;

    public Book(String title, String publisher, int price, int pages) {
        this.title = title;
        this.publisher = publisher;
        this.price = price;
        this.pages = pages;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getPublisher() {
        return publisher;
    }

    public void setPublisher(String publisher) {
        this.publisher = publisher;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public int getPages() {
        return pages;
    }

    public void setPages(int pages) {
        this.pages = pages;
    }
}
