import java.util.Scanner;

public class task1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int count = 0;
        while (true) {
            int x = (int) ((Math.random()) * 100);
            if (x == 0) {
                x = (int) ((Math.random()) * 100);
            }
            System.out.println("You have 5 chances to guess the correct number");
            for (int i = 0; i < 5; i++) {
                System.out.println("chance " + (i + 1) + ": ");
                System.out.println("Guess for the generated number");
                int ans = sc.nextInt();
                if (ans == x) {
                    System.out.println("Congratulations you won the game");
                    count++;
                    break;
                } else if (ans < x) {
                    System.out.println("Your Guess is too low");
                } else {
                    System.out.println("Your Guess is too high");
                }
                if (i == 4 && ans != x) {
                    System.out.println("correct answer is : "+x);
                }
            }
            System.out.println("Press 1 to play again or other key to exit ");
            if (sc.nextInt() != 1) {
                System.out.println("Your total Score is " + count * 100);
                System.out.println("Thank you for playing");
                System.exit(0);
            }
        }
    }
}