package Training3.lesson1;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class HomeWork2 <T> {
private T[] string;

    public HomeWork2(T... string) {
        this.string = string;
    }

    public List setArrayList(){
        return Arrays.asList(string);
    }

}

