package Training2.lesson1;

public class Cat implements Passing {
    private String name;

    public Cat(String name) {
        this.name = name;
    }

    public void run() {
        System.out.println("Кот умеет бегать");
    }

    public void jump() {
        System.out.println("Кот умеет прыгать");
    }
}
