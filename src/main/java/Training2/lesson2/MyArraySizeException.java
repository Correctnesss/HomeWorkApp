package Training2.lesson2;

public class MyArraySizeException extends RuntimeException {
    public MyArraySizeException(String[][] array) {
        super("Массив должен быть 4x4");
    }
}
