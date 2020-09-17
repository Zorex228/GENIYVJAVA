package Book;
import java.lang.*;
public class TestBook {
    public static void main(String[] args) {
        Book b1 = new Book("Война и мир","Л.Н.ТОЛСТОЙ",1300,150);
        Book b2 = new Book("Преступление и наказание","Ф.М.ДОСТОЕВСКИЙ",300,120);
        Book b3 = new Book("Евгений Онегин","А.С.ПУШКИН",250,100);
        Book b4 = new Book("Великий Гэтсби","С.Ф.Фицджеральд",300,300);
        System.out.println(b1);
        b1.GetPrice();
        b2.GetPrice();
        b3.GetPrice();
        b4.GetPrice();
    }
}
