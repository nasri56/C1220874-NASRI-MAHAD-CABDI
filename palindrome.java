import java.util.Scanner;
public class palindrome {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String word, reverse = "";

        System.out.print("\nEnter  or word: ");
        word = input.nextLine();

        for (int i = word.length() - 1; i >= 0; i--) {
            reverse = reverse + word.charAt(i);
        }

        if (word.equals(reverse)) {
            System.out.println(word + " is Palindrom.");
        } else {
            System.out.println(word + " it`s not palindrome.");
        }

        input.close();
}
}