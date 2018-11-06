import java.util.Scanner;

public class RockPaperScissors {

    public static void main(String[] args) {

        int rock = 1;
        int paper = 2;
        int scissors = 3;
        int quit = 4;

        int player1 = 0;
        int player2 = 0;
        int player1input;
        int player2input;

        Scanner scan = new Scanner(System.in);
        System.out.println("Player One: Choose your weapon!");
        player1input = scan.nextInt();
        if (player1input == 1) {
            System.out.println("Good choice!");
        }
        else if (player1input == 2) {
            System.out.println("Good choice!");
        }
        else if (player1input == 3) {
            System.out.println("Good choice!");
        }
        while (player1input == 4) {

            if (player1 > player2) {
                System.out.println("The winner is Player One with " + player1 + " points.");
                System.out.println("Quitting");
                break;
            }
            else if (player1 < player2) {
                System.out.println("The winner is Player Two with " + player2 + " points.");
                System.out.println("Quitting");
                break;
            }
            else {
                System.out.println("Player One and Player Two are tied with 0 points.");
                System.out.println("Quitting");
                break;
            }
            //break;
        }


        System.out.println("Player Two: Choose your weapon!");
        player2input = scan.nextInt();
        if (player2input == 1) {
            System.out.println("Good choice!");
        }
        else if (player2input == 2) {
            System.out.println("Good choice!");
        }
        else if (player2input == 3) {
            System.out.println("Good choice!");
        }
        while (player2input == 4) {

            if (player1 > player2) {
                System.out.println("The winner is Player One with " + player1 + " points.");
                System.out.println("Quitting");
                break;
            }
            else if (player1 < player2) {
                System.out.println("The winner is Player Two with " + player2 + " points.");
                System.out.println("Quitting");
                break;
            }
            else {
                System.out.println("Player One and Player Two are tied with 0 points.");
                System.out.println("Quitting");
                break;
            }
            //break;
        }


        while (player1input != 3 && player2input != 3) {

            switch (player1input) {
                case 1:
                    System.out.println("Player One chose: rock");
                    break;
                case 2:
                    System.out.println("Player One chose: paper");
                    break;
                case 3:
                    System.out.println("Player One chose: scissors");
                    break;
                case 4:
                    System.out.println("quit");
                    break;
            }


            switch (player2input) {
                case 1:
                    System.out.println("Player Two chose: rock");
                    break;
                case 2:
                    System.out.println("Player Two chose: paper");
                    break;
                case 3:
                    System.out.println("Playeer Two chose: scissors");
                    break;
                //case 4:
                //  System.out.println("quit");
            }
            if (player1input == 1 && player2input == 2) {
                System.out.println("Player Two Wins!");
                ++player2;
            }
            else if (player1input == 2 && player2input == 3) {
                System.out.println("Player Two Wins!");
                ++player2;
            }
            else if (player1input == 3 && player2input == 1) {
                System.out.println("Player Two Wins!");
                ++player2;
            }
            else if (player2input == 1 && player1input == 2) {
                System.out.println("Player One Wins!");
                ++player1;
            }
            else if (player2input == 2 && player1input == 3) {
                System.out.println("Player One Wins!");
                ++player1;
            }
            else if (player2input == 3 && player1input == 1) {
                System.out.println("Player One Wins!");
                ++player1;
            }
            else if (player1input == player2input) {
                System.out.println("It's a draw!");
            }

            System.out.println("The score is now: " + player1 + " - " + player2);

            System.out.println("Player One: Choose your weapon!");
            player1input = scan.nextInt();
            if (player1input == 1) {
                System.out.println("Good choice!");
            }
            else if (player1input == 2) {
                System.out.println("Good choice!");
            }
            else if (player1input == 3) {
                System.out.println("Good choice!");
            }

            while (player1input == 4) {

                if (player1 > player2) {
                    System.out.println("The winner is Player One with " + player1 + " points.");
                    System.out.println("Quitting");
                    break;
                }
                else if (player1 < player2) {
                    System.out.println("The winner is Player Two with " + player2 + " points.");
                    System.out.println("Quitting");
                    break;
                }
                else {
                    System.out.println("Player One and Player Two are tied with 0 points.");
                    System.out.println("Quitting");
                    break;
                }
            }
           //break;

            System.out.println("Player Two: Choose your weapon!");
            player2input = scan.nextInt();
            if (player2input == 1) {
                System.out.println("Good choice!");
            }
            else if (player2input == 2) {
                System.out.println("Good choice!");
            }
            else if (player1 == 3) {
                System.out.println("Good choice!");
            }

            while (player2input == 4) {

                if (player1 > player2) {
                    System.out.println("The winner is Player One with " + player1 + " points.");
                    System.out.println("Quitting");
                    break;
                }
                else if (player1 < player2) {
                    System.out.println("The winner is Player Two with " + player2 + " points.");
                    System.out.println("Quitting");
                    break;
                }
                else {
                    System.out.println("Player One and Player Two are tied with 0 points.");
                    System.out.println("Quitting");
                    break;
                }
                //break;
            }
        }
    }
}