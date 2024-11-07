package Training2.lesson1;

public class Treadmill extends Barrier{
    @Override
    boolean moving(Passing passing) {
        passing.run();
        return false;
    }
}
