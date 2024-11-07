package Training2.lesson1;

public class Human implements Passing {
    private String name;

    public Human(String name) {
        this.name = name;
    }

    public void run() {
        System.out.println("Человек умеет бегать");
    }

    public void jump() {
        System.out.println("Человек умеет прыгать");
    }
}
