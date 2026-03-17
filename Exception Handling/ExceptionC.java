import java.util.Scanner;

public class ExceptionC {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.print("Enter amount to deposit: ");
        int cb = sc.nextInt();
        System.out.print("Enter amount to withdraw: ");
        int w = sc.nextInt();

        try {

            if (cb < w) {
                throw new ArithmeticException("Insufficient balance");
            }

            cb = cb - w;
            System.out.println("Transcation successful");
            System.out.println("Current balance " + cb);
        } catch (ArithmeticException e1) {

            System.out.println(e1.getMessage());
            System.out.println("Current balance = " + cb);
        }

    }

}
