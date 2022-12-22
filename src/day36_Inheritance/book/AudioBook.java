package day36_Inheritance.book;

public class AudioBook extends Book{

    public int length;
    public boolean narrator;

    public void setInfo(String title, String type, String author, double price, int length, boolean narrator) {
        this.length = length;
        this.narrator = narrator;
    }
    public void listen(){

        System.out.println(author+" is listening ");
    }

    public String toString() {
        return "AudioBook{" +
                "length=" + length +
                ", narrator=" + narrator +
                ", title='" + title + '\'' +
                ", type='" + type + '\'' +
                ", author='" + author + '\'' +
                ", price=" + price +
                '}';
    }
}
