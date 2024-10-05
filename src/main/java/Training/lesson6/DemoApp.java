package Training.lesson6;

public class DemoApp {

    public static void main(String[] args) {
//        int quantityCat = 0;
//        int quantityDog = 0;

        Animal cat = new Cat("Маркет", 50);
        Animal dog = new Dog("Бобик", 499, 11);
        Animal dog1 = new Dog("Бобикарий", 25, 3);
        Animal cat1 = new Cat("Маркерий", 2000);

        cat.run();
        cat.swim();
        dog.run();
        dog1.swim();
        dog1.swim();
        cat1.swim();

//        Animal[] animals = {cat, dog, dog1, cat1};
//        for (Animal c : animals) {
//            if (c instanceof Cat) {
//                quantityCat += 1;
//            } else {
//                quantityDog += 1;
//            }
//        }

        cat.amount();
        dog.amount();

//        System.out.println("Количество котов: " + quantityCat);
//        System.out.println("Количество собак: " + quantityDog);
    }
}
