package Training2.lesson1;

public class Robot implements Passing {
    private String name;

    public Robot(String name) {
        this.name = name;
    }

    public void run() {
        System.out.println("Робот умеет бегать");
    }

    public void jump() {
        System.out.println("Робот умеет прыгать");
    }
}
