package Training2.lesson1;

import java.util.Arrays;

public class App {


    public static void main(String[] args) {
//        Cat cat1 = new Cat("Барсик");
//        Human human = new Human("Валера");
//        Robot robot = new Robot("Cyrax");

        Passing[] passings = new Passing[3];
        passings[0] = new Cat("Барсик");
        passings[1] = new Human("Валера");
        passings[2] = new Robot("Cyrax");
        Barrier[] barriers = new Barrier[6];
        for (int i = 0; i < barriers.length; i++) {
            if (i % 2 == 0) {
                barriers[i] = new Treadmill();
            } else {
                barriers[i] = new Wall();
            }

        }
        for (int i = 0; i < passings.length; i++) {
            for (int j = 0; j < barriers.length; j++) {
                barriers[j].moving(passings[i]);
            }
        }
    }
//        String[] arrays = {cat1.toString(),human.toString(),robot.toString()};
//        System.out.println(arrays);
//        for (int i = 0; i < arrays.length; i++) {
//            swim
//        }
}

