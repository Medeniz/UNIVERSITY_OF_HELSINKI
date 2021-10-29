import java.util.Scanner;

public class NumberOfNegativeNumbers {

    public static void main(String[] args) {

        int counter = 0;
        Scanner scan = new Scanner(System.in);
        while (true) {
            System.out.println("Give a number:");
            int num = Integer.valueOf(scan.nextLine());
            if (num > 0) {

            } else if (num < 0) {
                counter++;
            } else {

                System.out.println("Number of negative numbers: " + counter);
                break;
            }
        }
    }
}

