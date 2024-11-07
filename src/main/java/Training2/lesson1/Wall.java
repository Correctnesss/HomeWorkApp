package Training2.lesson1;

public class Wall extends Barrier {
    @Override
    boolean moving(Passing passing) {
        passing.jump();
        return false;
    }
}
