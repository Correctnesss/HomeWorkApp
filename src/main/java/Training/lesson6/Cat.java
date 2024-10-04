package Training.lesson6;

public class Cat extends Animal {
    int quantity;

    public Cat(String name, int run, int swim) {
        super(name, run, swim);
        if (run > 500) {
            System.out.println(name + " не может пробежать больше 500 м.");
        } else {
            System.out.println(name + " пробежал " + run + " м.");
        }
        System.out.println(name + " не умеет плавать ");
        System.out.println();
        quantity+=1;
    }
    public void AmountCat(){
        System.out.println("Количество котиков: " + quantity);
    }
}
