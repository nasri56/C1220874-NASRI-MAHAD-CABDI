import java.util.Scanner;

public class prim {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int user;
        int i;
        int prime = 1;
        System.out.print("Enter the number ");
        user = input.nextInt();
        for (i = 2; i < user; i++) {
            System.out.println(i);
            if (user % i == 0) {
                prime = 0;
                break;
            }
        }
        if (prime == 1) {
            System.out.println(" the number is  prime number");
        } else {
            System.out.println(" the number is not prime number");
        }
    }
}