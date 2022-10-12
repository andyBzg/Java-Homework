import java.util.Scanner;

public class Homework4 {

    public static void main(String[] args) {

        //First level

        Scanner scn = new Scanner(System.in);
        System.out.print("Введите первую оценку: ");
        int first = scn.nextInt();
        System.out.print("Введите вторую оценку: ");
        int second = scn.nextInt();
        System.out.print("Введите третюю оценку: ");
        int third = scn.nextInt();
        int average = (first + second + third) / 3;

        System.out.print("Ваша средняя оценка: " + average);
        System.out.println();

        //Second level

        Scanner temperature = new Scanner(System.in);

        System.out.print("Температура воздуха: ");
        int airTemp = temperature.nextInt();
        System.out.print("Температура воды: ");
        int waterTemp = temperature.nextInt();

        boolean warmAir = airTemp > 28;
        boolean warmWater = waterTemp > 26;
        boolean vacation = warmAir && warmWater;

        System.out.println("Петя поедет на море: " + vacation);


    }
}
