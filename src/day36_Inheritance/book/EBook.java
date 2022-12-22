package day36_Inheritance.book;

public class EBook extends Book{
    public String size;
    public int pages;

    public void setInfo(String title, String type, String author, double price, String size, int pages) {
        this.size = size;
        this.pages = pages;
    }

    public void readBokk(){

        System.out.println("reading "+title);
    }

    public String toString() {
        return "EBook{" +
                "size='" + size + '\'' +
                ", pages=" + pages +
                ", title='" + title + '\'' +
                ", type='" + type + '\'' +
                ", author='" + author + '\'' +
                ", price=" + price +
                '}';
    }
}
