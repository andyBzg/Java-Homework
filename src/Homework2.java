public class Homework2 {

    public static void main(String[] args) {

        int firstNumber = 179;
        int increased = firstNumber + 1;
        int decreased = firstNumber - 1;

        System.out.println("Число: " + firstNumber);
        System.out.println();
        System.out.println("The next number for the number " + firstNumber + " is " + increased);
        System.out.println("The next number for the number " + firstNumber + " is " + decreased);
        System.out.println();
        System.out.println("/////");
        System.out.println();

        int secondNumber = 78;
        System.out.println("1) Дано двузначное число. Найдите число десятков в нем.");
        System.out.println("Дано: " + secondNumber);

        secondNumber /= 10;
        System.out.println("Ответ: " + secondNumber);
        System.out.println();

        int n = 3;
        int k = 14;
        int answer = k % n; //количество яблок осталось в корзине

        System.out.println("2) N школьников делят K яблок поровну, неделящийся остаток остается в корзинке. Сколько яблок останется в корзинке?");
        System.out.println("Дано:");
        System.out.println("N = " + n);
        System.out.println("K = " + k);
        System.out.println();
        System.out.println("Ответ: " + answer);


    }

}
