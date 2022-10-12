public class Homework3 {

    public static void main(String[] args) {

        //First level

        long secondsFelixLived = 3_011_456_567L;
        long secondsInOneYear = 364 * 24 * 60 * 60;
        long yearsFelixLived = secondsFelixLived / secondsInOneYear;

        System.out.println("Феликс прожил " + secondsFelixLived + " секунд");
        System.out.println("В году " + secondsInOneYear + " секунд");
        System.out.println("Феликс прожил " + yearsFelixLived + " лет");
        System.out.println();

        //Second level

        int boilingTime = 4;
        boolean asterix = true;
        boolean obelix = false;
        boolean potion = boilingTime > 5;
        System.out.println(potion || asterix);
        System.out.println(potion || obelix);


    }

}
