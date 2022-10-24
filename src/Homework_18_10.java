import java.util.Scanner;

public class Homework_18_10 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        //Level 1
        System.out.println("Дай мне целое число, но не меньше 2");
        int number = scanner.nextInt();
        int divider = 1;
        if (number >= 2) {
            do {
                divider++;
            } while (number % divider != 0);
            System.out.println("Наименьший делитель: " + divider);
        } else System.out.println("Число меньше 2. Отмена!");

        //Level 2
        System.out.print("Начальный вклад: ");
        int deposit = scanner.nextInt();
        System.out.print("Процент по вкладу: ");
        double percent = scanner.nextInt();
        percent /= 100;
        System.out.print("Срок вклада (лет): ");
        int years = scanner.nextInt();
        while (years >= 1) {
            deposit += percent * deposit;
            years--;
        }
        System.out.println("В конце срока ваш вклад составит " + deposit);
    }
}
