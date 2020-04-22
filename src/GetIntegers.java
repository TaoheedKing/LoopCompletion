import java.util.Scanner;

public class GetIntegers {
    public static void main(String[] args) {
        Scanner keyboard = new Scanner(System.in);

        int num, total=0;
        System.out.println("Please enter a number");
        num = keyboard.nextInt();
        // Loop should start here
        for (int index = 1; index <= 10; index++) {
            num = keyboard.nextInt();
            total += num;
        }
        // Loop should end here
        System.out.println("The total of all 10 numbers is " + total);

    }

}