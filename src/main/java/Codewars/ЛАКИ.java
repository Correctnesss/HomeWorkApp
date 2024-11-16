package Codewars;

public class ЛАКИ {
    public static void luck(int start, int end, int price) {
        long sum = 0;
        int sum1 = 0;
        int i = 15;
        while (start <= 105 && start <= end) {
            start += i;
            sum += price;
            sum1 += 1;
        }
        i -= 1;
        while (start <= 109 && start <= end) {
            start += i;
            sum += price;
            sum1 += 1;
        }
        i -= 1;
        while (start <= 116 && start <= end) {
            start += i;
            sum += price;
            sum1 += 1;
        }
        i -= 1;
        while (start <= 121 && start <= end) {
            start += i;
            sum += price;
            sum1 += 1;
        }
        i -= 1;
        while (start <= 129 && start <= end) {
            start += i;
            sum += price;
            sum1 += 1;
        }
        i -= 1;
        while (start <= 139 && start <= end) {
            start += i;
            sum += price;
            sum1 += 1;
        }
        i -= 1;
        while (start <= 151 && start <= end) {
            start += i;
            sum += price;
            sum1 += 1;
        }
        i -= 1;
        while (start <= 164 && start <= end) {
            start += i;
            sum += price;
            sum1 += 1;
        }
        i -= 1;
        while (start <= 183 && start <= end) {
            start += i;
            sum += price;
            sum1 += 1;
        }
        i -= 1;
        while (start <= 198 && start <= end) {
            start += i;
            sum += price;
            sum1 += 1;
        }
        i -= 1;
        while (start <= 218 && start <= end) {
            start += i;
            sum += price;
            sum1 += 1;
        }
        i -= 1;
        while (start <= 249 && start <= end) {
            start += i;
            sum += price;
            sum1 += 1;
        }
        i -= 1;
        while (start <= 279 && start <= end) {
            start += i;
            sum += price;
            sum1 += 1;
        }
        i -= 1;
        while (start <= 298 && start <= end) {
            start += i;
            sum += price;
            sum1 += 1;
        }
        i -= 1;
        while (start <= 299 && start <= end) {
            start += i;
            sum += price;
            sum1 += 1;
        }
        sum = sum + 1000000000;


        System.out.println(sum / 1000000000 + " лярдов");
        System.out.println(sum1 + " Источника темного насыщения" + " или " + sum1 * 4 + " Эссенции насыщения");
        System.out.println(start + " лаков");
    }

    public static void main(String[] args) {
        luck(100, 244, 1120000000);
    }
}
