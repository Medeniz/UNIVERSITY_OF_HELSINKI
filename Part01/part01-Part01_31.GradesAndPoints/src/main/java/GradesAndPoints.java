
import java.util.Scanner;

public class GradesAndPoints {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Give points [0-100]:");
        int num = Integer.valueOf(scan.nextLine());

        if (num > 100) {
            System.out.println("Grade:incredible!");
        } else if (num >= 90) {
            System.out.println("Grade:i5");
        } else if (num >= 80) {
            System.out.println("Grade:i4");
        } else if (num >= 70) {
            System.out.println("Grade:i3");
        } else if (num >= 60) {
            System.out.println("Grade:i2");
        } else if (num >= 50) {
            System.out.println("Grade:i1");
        } else if (num >= 0) {
            System.out.println("Grade:ifailed");
        }else {
            System.out.println("Grade:iimpossible!");
        }
    }
}
