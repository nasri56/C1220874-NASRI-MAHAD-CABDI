import java.util.Scanner;
public class Sentinal_value {
    public static void main(String[] args) {
        //sentinal value

        int sum = 0;
        Scanner input = new Scanner(System.in);
        System.out.println("enter nums to add \n press 3 to exit");
        System.out.println("enter number ");
        int number = input.nextInt();
        while (number != 3) {
            sum += number;
            System.out.println("enter number");
            number = input.nextInt();
        }
        System.out.println("The sum :" + sum);

    }
}