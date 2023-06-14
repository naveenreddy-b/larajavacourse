
import java.util.Scanner;

public class Main17 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter a character:");
        char character = scanner.next().charAt(0);
        if (Character.isLetter(character)) {
            System.out.println("You entered an alphabet.");
        } else {
            System.out.println("You did not enter an alphabet.");
        }
    }
}