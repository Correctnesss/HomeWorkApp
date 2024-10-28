package Training.lesson7;

public class Cat {
    private String name;
    private int appetite;
    private boolean satiety;

    public Cat(String name, int appetite) {
        this.name = name;
        this.appetite = appetite;
    }

    public void eat(Plate p) {
        p.decreaseFood(this);
    }

    public int getAppetite() {
        return appetite;
    }

    public String getName() {
        return name;
    }

    public void satiety(Plate s) {
        if (s.satiety(appetite)) {
            satiety = true;
        } else satiety = false;
    }

    public void info() {
        if (satiety) {
            System.out.println("Сытость кота " + name + " " + true);
        } else {
            System.out.println("Сытость кота " + name + " " + false);
        }
    }

    public void cats(Cat[] cats) {
        for (Cat cat : cats) {
            if (satiety) {
                System.out.println("Сытость кота " + name + true);
            } else {
                System.out.println("Сытость кота " + name + false);
            }
        }
    }

    @Override
    public String toString() {
        return name + " " + satiety;
    }


}
