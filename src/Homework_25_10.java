import java.util.Arrays;

public class Homework_25_10 {
    public static void main(String[] args) {
        //Level 1
        int[] array = new int[100];
        for (int i = 1; i < 99; i++) {
            array[i] = 10;
        }
        System.out.println(Arrays.toString(array));

        //Level 2
        int[] array2 = new int[100];
        int sum = 0;
        for (int i = 0; i < array2.length; i++) {
            array2[i] = 11111 + i * 11111;
            array2[i] = (array2[i] / 100) % 1000;
            sum += array2[i];
        }
        System.out.println(Arrays.toString(array2));
        System.out.println("Sum of all elements in array is " + sum);
    }
}
