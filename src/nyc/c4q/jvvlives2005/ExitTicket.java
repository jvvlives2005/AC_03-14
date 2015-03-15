package nyc.c4q.jvvlives2005;

/**
 * Write a program that gives a user five chances to guess a number between 1-20.
 * If user guesses 1-9 it tells them "Your guess is too low." If user guesses 11-20 it tells them "Your guess is too high."
 * If user guesses 10 it tells them "Congrats! You guessed it." *
 * Created by c4q-joshelynvivas on 3/14/15.
 */

import java.util.Scanner;

public class ExitTicket {
    public static void main(String[] args) {
        System.out.println("Guess a Number from 1-20. You have 5 chances");
        Scanner scanner = new Scanner(System.in);

        System.out.print("Your guess: ");
        int i = scanner.nextInt();
    for (i = 1; i < 5; i++) {
        if (i == 10) {
            System.out.println("Congrats! You guessed it.");
        } else if (i > 10) {
            System.out.println("You guess is too high.");
        } else if (i < 10) {
            System.out.println("You guess is too low.");
        } else {
            System.out.println("It's not within range");
        }
    }

    }
}
