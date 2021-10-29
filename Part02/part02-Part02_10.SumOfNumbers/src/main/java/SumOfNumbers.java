import java.util.Scanner;

public class SumOfNumbers {

    public static void main(String[] args) {

        int number = 0;
        Scanner scan = new Scanner(System.in);
        while (true) {

            System.out.println("Give a number:");
            int num = Integer.valueOf(scan.nextLine());
            if (num != 0) {
                number = number + num;

            } else {
                System.out.println("Sum of the numbers: " + number);
                break;
            }
        }
    }
}
