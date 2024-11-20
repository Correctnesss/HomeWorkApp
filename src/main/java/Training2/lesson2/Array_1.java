package Training2.lesson2;

public class Array_1 {
    public static void main(String[] args) {
        String[][] array1 = new String[4][4];
        try {
            Array(array1);
        } catch (MyArraySizeException ma) {
//            ma.printStackTrace();
            System.out.println(ma.getMessage());
        } catch (MyArrayDataException de) {
//            de.printStackTrace();
            System.out.println(de.getMessage());
        }
    }

    private static String[][] Array(String[][] array) throws MyArraySizeException {
        if (array.length != 4 && array[0].length != 4) {
            throw new MyArraySizeException(array);
        }
        int sum = 0;
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[i].length; j++) {
                array[i][j] = "1";
                try {
                    sum += Integer.parseInt(array[i][j]);
                } catch (NumberFormatException nf) {
                    throw new MyArrayDataException(i, j);
                }
            }

        }
        System.out.println(sum);


        return array;
    }

}
