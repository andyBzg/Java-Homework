import java.util.Scanner;

public class Homework_11_10 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        //Level 1
        int number = scanner.nextInt();
        if (number % 2 == 0) {
            System.out.println(number + 2);
        }
        else {
            System.out.println(number + 1);
        }

        //Level 2
        int time = scanner.nextInt();
        int trainSpeed = scanner.nextInt();
        int roadLength = scanner.nextInt();
        int howFarIsJohn = time * trainSpeed;

        if (howFarIsJohn > roadLength / 2) {
            System.out.println("Мери");
        }
        if (howFarIsJohn == roadLength / 2) {
            System.out.println("одинаково");
        }
        else {
            System.out.println("Шерлок");
        }
    }
}
