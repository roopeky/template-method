import java.util.Scanner;

public class GuessTheNumber extends Game {

    private int secretNumber;
    private int guessesLeft;
    private int currentPlayer;

    @Override
    void initializeGame() {
        System.out.println("Welcome to Guess the Number game! =D");
        secretNumber = (int) (Math.random() * 100) +1;
        guessesLeft = 10;
        currentPlayer = 0;
    }

    @Override
    void makePlay(int player) {
        int guess = getPlayerGuess(player);
        if (guess == secretNumber) {
            System.out.println("Player " + player + " has guessed the number!");
        } else {
            System.out.println("Player " + player + " has guessed wrong!");
            guessesLeft--;
        }
    }

    @Override
    boolean endOfGame() {
        return (guessesLeft == 0);
    }

    @Override
    void printWinner() {
        System.out.println("The correct number was " + secretNumber);
    }

    private int getPlayerGuess(int player) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Player " + player + ", enter your guess: ");
        return scanner.nextInt();
    }
}
