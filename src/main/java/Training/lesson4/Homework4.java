package Training.lesson4;

import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class Homework4 {
    public static char[][] map;

    public static final int SIZE = 3;

    public static final int DOTS_TO_WIN = 2;

    public static char DOT_EMPTY = '*';
    public static char DOT_O = 'O';
    public static char DOT_X = 'X';

    public static final Scanner SCANNER = new Scanner(System.in);

    public static final Random RANDOM = new Random();

    public static void initMap() {
        map = new char[SIZE][SIZE];
        for (int i = 0; i < map.length; i++) {
            Arrays.fill(map[i], DOT_EMPTY);
        }
    }

    public static void printMap() {
        for (int i = 0; i <= map.length; i++) {
            System.out.print(i + " ");
        }
        System.out.println();
        for (int i = 0; i < map.length; i++) {
            System.out.print((i + 1) + " ");
            for (int j = 0; j < map[i].length; j++) {
                System.out.print(map[i][j] + " ");
            }
            System.out.println();
        }
    }

    public static void humanTurn() {
        int x, y;
        do {
            System.out.println("Введите координаты в формате X Y");
            x = SCANNER.nextInt() - 1;
            y = SCANNER.nextInt() - 1;
        } while (!isCellValid(x, y));
        map[y][x] = DOT_X;
    }

    public static boolean isCellValid(int x, int y) {
        if (x < 0 || y < 0 || x >= SIZE || y >= SIZE) {
            return false;
        }
        if (map[y][x] != DOT_EMPTY) {
            return false;
        }
        return true;
    }

    public static void aiTurn() {
        int x, y;
        do {
            x = RANDOM.nextInt(SIZE);
            y = RANDOM.nextInt(SIZE);
        } while (!isCellValid(x, y));
        System.out.println("Робот делает ход в " + (x + 1) + " " + (y + 1));
        map[y][x] = DOT_O;
    }

    public static boolean isMapFull() {
        for (int i = 0; i < map.length; i++) {
            for (int j = 0; j < map.length; j++) {
                if (map[i][j] == DOT_EMPTY) {
                    return false;
                }
            }

        }
        return true;
    }

    public static void checkWin(char symbol) {
        int sumDiagonal = 0;
        int sumReverseDiagonal = 0;
        int sumVertical = 0;
        int sumHorizontal = 0;
        for (int i = 0; i < map.length; i++) {
            for (int j = 0; j < map[i].length; j++) {
                if (i == j & map[i][j] == symbol) {
                    sumDiagonal++;
                    if (sumDiagonal == DOTS_TO_WIN) {
                        System.out.println(11);
                    }
                }
                if (i + j == map.length - 1 & map[i][j] == symbol) {
                    sumReverseDiagonal++;
                    if (sumReverseDiagonal == DOTS_TO_WIN) {
                        System.out.println(12);
                    }
                }
                if (map[i][j] == symbol) {
                    sumHorizontal++;
                    if (sumHorizontal == DOTS_TO_WIN) {
                        System.out.println(13);
                    }
                }
                if (map[j][i] == symbol) {
                    sumVertical++;
                    if (sumVertical == DOTS_TO_WIN) {
                        System.out.println(14);
                    }
                }

            }
            sumHorizontal = 0;
            sumVertical = 0;


        }
    }


    public static void main(String[] args) {
        initMap();
        printMap();
        humanTurn();
        printMap();
        humanTurn();
        printMap();
        humanTurn();
        printMap();
//        humanTurn();
//        printMap();
//        humanTurn();
//        printMap();
//        humanTurn();
//        printMap();
//        humanTurn();
//        printMap();
        checkWin(DOT_X);

    }

}