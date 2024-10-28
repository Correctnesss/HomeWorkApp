package Training.lesson7;

public class Plate {
    private int food;

    public Plate(int food) {
        this.food = food;
    }

    public void decreaseFood(Cat cat) {

        if (food - cat.getAppetite() < 0) {
            System.out.println("Не хватает еды для кота по кличке " + cat.getName());
        } else {
            food -= cat.getAppetite();
            System.out.println("Кот по кличке " + cat.getName() + " поел");
        }

    }

    public void info() {
        System.out.println("plate: " + food);
    }

    public boolean satiety(int v) {
        if (food - v > 0) {
            return true;
        }
        return false;
    }

    public void increaseFood(int a) {
        food += a;
    }



}
