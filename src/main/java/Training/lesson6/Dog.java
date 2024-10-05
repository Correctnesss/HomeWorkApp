package Training.lesson6;

public class Dog extends Animal {
    private static int quantityDog;

    public Dog(String name, int run, int swim) {
        super(name, run, swim);
//        if (run > 500) {
//            System.out.println(name + " не может пробежать больше 500 м.");
//        } else {
//            System.out.println(name + " пробежал " + run + " м.");
//        }
//        if (swim > 10) {
//            System.out.println(name + " не может проплыть больше 10 м.");
//        } else {
//            System.out.println(name + " проплыл " + swim + " м. ");
//        }
//        System.out.println();
        quantityDog += 1;
    }

    @Override
    public void run() {
        if (this.getRun() > 200) {
            System.out.println("Собака по кличке " + this.getName() + " не может пробежать больше 200 м.");
        } else {
            System.out.println("Собака по кличке " + this.getName() + " пробежал " + this.getRun() + " м.");
        }
        System.out.println();
    }

    public void swim() {
        if (this.getSwim() > 10) {
            System.out.println("Собака по кличке " + this.getName() + " не может проплыть больше 10 м.");
        } else {
            System.out.println("Собака по кличке " + this.getName() + " проплыл " + this.getRun() + " м.");
        }
        System.out.println();
    }

    public void amount() {
        System.out.println("Количество собачек: " + quantityDog);
    }
}
