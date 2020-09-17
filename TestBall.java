package Ball;
import java.lang.*;
public class TestBall {
    public static void main(String[] args) {
    Ball b1 = new Ball(100,100);
    Ball b2 = new Ball(0,0);
    Ball b3 = new Ball(1110,550);
    Ball b4 = new Ball(350,600);
    System.out.println(b1);
    System.out.println(b2);
    System.out.println(b3);
    System.out.println(b4);
    b1.move(250,400);
    b2.move(666,399);
    b3.move(222,666);
    b4.move(645,454);
    System.out.println(b1);
    System.out.println(b2);
    System.out.println(b3);
    System.out.println(b4);
    }
}
