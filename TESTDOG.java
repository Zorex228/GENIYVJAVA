package lab1.suyan;
import java.lang.*;
public class TESTDOG {
    public static void main(String[] args) {
     DOG d1 = new DOG("Миша",3);
     DOG d2 = new DOG("Гаврик", 8);
     DOG d3 = new DOG("Бобик");
     DOG d4 = new DOG("Петька");
     d4.setAge(10);
     d3.setAge(3);
     System.out.println(d1);
     d1.intoHumanAge();
     d2.intoHumanAge();
     d3.intoHumanAge();
     d4.intoHumanAge();
    }
}
