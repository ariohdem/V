import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        int cash = 50;
        System.out.println("Welcome to roulette! At this point you have " + cash + " pt. Try to guess random number from 1 to 3! " +
                "1 bet cost 10 points. You win after achieve 70pt");
        int bet;

        int a = (int) (Math.random() * 3);
        do {

            System.out.println("Enter number:");
            Scanner scan = new Scanner(System.in);
            bet = scan.nextInt();

            System.out.println("Bet " + bet);
            if (bet != a) {
                cash -= 10;
                if (cash == 0) {
                    System.out.println("LOOOOSER");
                }else {
                System.out.println("Try again, you have " + cash + "pt");}
            } else {
                cash += 10;
                System.out.println("Correct " + cash + "pt");
            }
            if (cash >= 70) {
                System.out.println("WINNER");
                break;
            }
        }
        while (cash > 0);
    }
}
