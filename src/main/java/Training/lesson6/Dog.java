package Training.lesson6;

public class Dog extends Animal {
    int quantity;

    public Dog(String name, int run, int swim) {
        super(name, run, swim);
        if (run > 500) {
            System.out.println(name + " не может пробежать больше 500 м.");
        } else {
            System.out.println(name + " пробежал " + run + " м.");
        }
        if (swim > 10) {
            System.out.println(name + " не может проплыть больше 10 м.");
        } else {
            System.out.println(name + " проплыл " + swim + " м. ");
        }
        System.out.println();
        quantity += 1;
    }

    public void AmountDog() {
        System.out.println("Количество котиков: " + quantity);
    }
}
