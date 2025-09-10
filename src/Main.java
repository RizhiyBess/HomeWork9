import java.util.Arrays;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        System.out.println("Задание 1 и Задание 2 и Задание 3");
        double[] cost = {35_000, 37_000, 36_000, 40_000, 39_000};
        double sum = 0;
        for (double i : cost) {
            sum += i;
        }
        System.out.println("Сумма трат за месяц составила " + sum + " рублей");

        double maxCost = -1;
        double minCost = 1_000_000;
        for (double i : cost) {
            if (i > maxCost) {
                maxCost = i;
            }
            if (i < minCost) {
                minCost = i;
            }
        }
        System.out.println("Минимальная сумма трат за неделю составила " + minCost + " рублей. Максимальная сумма трат за неделю составила " + maxCost + " рублей");

        double averageCost = sum / cost.length;
        System.out.println("Средняя сумма трат за месяц составила " + averageCost + " рублей");

        System.out.println("Задание 4");
        char[] reverseFullName = {'n', 'a', 'v', 'I', ' ', 'v', 'o', 'n', 'a', 'v', 'I'};
        for (int i = reverseFullName.length - 1; i >= 0; i--) {
            System.out.print(reverseFullName[i]);
        }
    }
}