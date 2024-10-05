package Training.lesson6;

public class Cat extends Animal {
    private static int quantityCat = 0;

    public Cat(String name, int run) {
        super(name, run, 0);
        quantityCat += 1;
    }

    @Override
    public void run() {
        if (this.getRun() > 200) {
            System.out.println("Кот по кличке " + this.getName() + " не может пробежать больше 200 м.");
        } else {
            System.out.println("Кот по кличке " + this.getName() + " пробежал " + this.getRun() + " м.");
        }
        System.out.println();
    }

    public void swim() {
//        if (this.getRun() > 200) {
//            System.out.println(this.getName() + " не может пробежать больше 200 м.");
//        } else {
//            System.out.println(this.getName() + " пробежал " + this.getRun() + " м.");
//        }
        System.out.println("Кот по кличке " + this.getName() + " не умеет плавать");
        System.out.println();
    }

    @Override
    public void amount() {
        System.out.println("Количество котиков: " + quantityCat);
    }
}
