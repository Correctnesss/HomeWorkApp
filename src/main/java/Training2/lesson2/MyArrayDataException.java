package Training2.lesson2;

public class MyArrayDataException extends RuntimeException{
    public MyArrayDataException(int i, int j) {
        super("Неверный формат в ячейке " + i + ", " + j);
    }
}
