import java.util.Scanner;

public class Homework_20_10 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        //Level 1
        System.out.println("Найдем сумму такого выражения: 1+1/2+1/3+1/4…..+1/n");
        System.out.print("Введите n: ");
        int firstNumber = scanner.nextInt();
        double sum = 0;
        for (double i = 1; i <= firstNumber; i++) {
            sum += 1 / i;
        }
        System.out.println("Ответ: " + sum);

        //Level 2
        System.out.println("Введите число, которое вмещается в int: ");
        int secondNumber = scanner.nextInt();
        int answer = 0;
        while (secondNumber > 0) {
            answer += secondNumber % 10;
            secondNumber /= 10;
        }
        System.out.println("Сумма всех цифр этого числа = " + answer);
    }
}
