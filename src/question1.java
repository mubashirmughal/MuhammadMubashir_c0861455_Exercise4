import java.util.Scanner;

public class question1 {
    public static void main(String[] args) {
        double a;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter number to check: ");
        a = sc.nextInt();

        if (a % 2 == 0 && a > 0) {
            System.out.println("Number is Even and positive");
        } else if (a % 2 == 0 && a < 0) {
            System.out.println("Number is Even and negative");
        } else if (a % 2 == 0 && a > 0) {

        }


    }
}