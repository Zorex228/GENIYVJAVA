package lab1.suyan;
import java.lang.*;
public class DOG {
    private String name;
    private int age;

    public DOG(String n, int a){
        name = n;
        age = a;
    }

    public DOG(String n) {
        name = n;
        age = 0;
    }
    public DOG(){
        name = "песик";
        age = 0;
    }

    public String getName(String name) {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    @Override
    public String toString() {
        return "DOG{" +
                "name='" + name + '\'' +
                ", age=" + age +
                '}';
    }
    public void intoHumanAge(){
        System.out.println(name+" 'Возраст в человеских годах " +age*7+ " лет");
    }
}
