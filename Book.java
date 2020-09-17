package Book;
import java.lang.*;
public class Book {
    private String name;
    private String Author;
    private int pages;
    private int basePrice;

    public Book(String name, String author, int pages, int basePrice) {
        this.name = name;
        Author = author;
        this.pages = pages;
        this.basePrice = basePrice;
    }


    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAuthor() {
        return Author;
    }

    public void setAuthor(String author) {
        Author = author;
    }

    public int getPages() {
        return pages;
    }

    public void setPages(int pages) {
        this.pages = pages;
    }

    public int getBasePrice() {
        return basePrice;
    }

    public void setBasePrice(int basePrice) {
        this.basePrice = basePrice;
    }

    @Override
    public String toString() {
        return "Book{" +
                "name='" + name + '\'' +
                ", Author='" + Author + '\'' +
                ", pages=" + pages +
                ", basePrice=" + basePrice +
                '}';
    }
    public void GetPrice(){
        System.out.println(" Название книги: "+name+"   Автор: "+Author+"   Кол-во стр.: "+pages+"   Цена: "+basePrice);
    }
}