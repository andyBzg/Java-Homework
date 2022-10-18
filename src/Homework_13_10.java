import java.util.Scanner;

public class Homework_13_10 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        //Level 1
        int number = scanner.nextInt();
        while (number > 0) {
            number--;
            System.out.println("Я начинаю разбираться с циклами");
        }

        //Level 2
        int anyNumber = scanner.nextInt();
        int factorial = 1; //формула факториала n! = 1 * … * (n-2) * (n-1) * n

        while (anyNumber > 1) {
            factorial *= anyNumber;
            anyNumber--;
        }
        System.out.println(factorial);
    }
}
