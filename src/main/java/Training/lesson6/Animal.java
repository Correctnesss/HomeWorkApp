package Training.lesson6;

public class Animal {
    private String name;
    private int run;
    private int swim;
    private int quantity;


    public Animal(String name, int run, int swim) {
        this.run = run;
        this.swim = swim;
        this.name = name;
    }

    protected void run() {
        System.out.println("Животное" + name + " пробежал " + run + " м.");
    }

    protected void swim() {
        System.out.println("Животное " + name + " проплыл " + swim + " м.");
    }
    protected void amount(){
        System.out.println("Количество животных " + quantity);
    }

    public String getName() {
        return name;
    }

    public int getRun() {
        return run;
    }

    public int getSwim() {
        return swim;
    }
}
