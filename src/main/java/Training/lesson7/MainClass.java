package Training.lesson7;

import java.util.Arrays;

public class MainClass {
    public static void main(String[] args) {
        {
            Cat cat = new Cat("Barsik", 5);
            Cat cat1 = new Cat("Snejok", 96);
            Cat cat2 = new Cat("Murfik", 80);
            Plate plate = new Plate(100);
            Cat[] cats = {cat, cat1, cat2};
            System.out.println();
            System.out.println(Arrays.toString(cats));
            for (Cat catss : cats) {
                System.out.println(catss);
            }
            plate.info();
            cat.satiety(plate);
            cat.eat(plate);
            cat.info();
            cat1.satiety(plate);
            cat1.eat(plate);
            cat1.info();
            cat2.satiety(plate);
            cat2.eat(plate);
            cat2.info();
            plate.info();
        }
    }
}