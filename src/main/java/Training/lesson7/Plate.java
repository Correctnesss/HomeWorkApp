package Training.lesson7;

public class Plate {
    private int food;

    public Plate(int food) {
        this.food = food;
    }

    public void decreaseFood(int n) {

        if (food - n < 0) {
            System.out.println("Не хватает еды для кота");
        } else {
            food -= n;
        }

    }

    public void info() {
        System.out.println("plate: " + food);
    }
    public boolean satiety(int v){
        if (food - v > 0){
            return true;
        }
        return false;
    }

}
