
import java.util.Scanner;

public class NumberOfNumbers {

    public static void main(String[] args) {
        //number of numbers
        int counter = 0;
        Scanner scan = new Scanner(System.in);


        while (true) {
            System.out.println("Give a number:");
            int num = Integer.valueOf(scan.nextLine());
            if (num!=0){
                counter++;               
                
            }else{
                System.out.println("Number of numbers: " + counter);
                break;
            }

        }

    }
}
