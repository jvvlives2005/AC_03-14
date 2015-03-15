package nyc.c4q.jvvlives2005;

/**
 * Created by c4q-joshelynvivas on 3/14/15.
 */
import java.util.Scanner;
import java.util.Random;
public class HoshikoGame {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        int userWon=0;
        int myWon=0;
        System.out.print("Let's play Rock Paper Scissors!  We will try 5 times.  Please type your choice!");
        for (int i = 0; i<5; i=i+1){

            String userChoice = input.next();

            boolean rock = userChoice.equalsIgnoreCase("rock");
            boolean paper = userChoice.equalsIgnoreCase("paper");
            boolean scissors = userChoice.equalsIgnoreCase("scissors");

            if (rock){
                System.out.println("  _______ ");
                System.out.println(" (____   '——-");
                System.out.println("(_____)");
                System.out.println("(_____)");
                System.out.println("(____)");
                System.out.println(" (____)__.——-");
                System.out.println();
            }else if(paper){
                System.out.println("       _______");
                System.out.println("  ____(____   '---");
                System.out.println(" (______");
                System.out.println("(_______");
                System.out.println(" (_______");
                System.out.println("   (__________.---");
                System.out.println();

            }else if (scissors){
                System.out.println("       _______");
                System.out.println("  ____(____   '---");
                System.out.println(" (______");
                System.out.println("(__________");
                System.out.println("      (____)");
                System.out.println("       (___)__.---");
                System.out.println();

            }

            String myChoice = null;

            if (rock || paper  || scissors){
                int number = new Random().nextInt(3);

                if (number == 0){
                    myChoice = "Rock";
                    System.out.println("    _______");
                    System.out.println("---'   ____)");
                    System.out.println("      (_____)");
                    System.out.println("      (_____)");
                    System.out.println("      (____) ");
                    System.out.println("---.__(___)");
                    System.out.println();

                }else if (number == 1){
                    myChoice = "Paper";
                    System.out.println("    _______");
                    System.out.println("---'   ____)____");
                    System.out.println("          ______)");
                    System.out.println("          _______)");
                    System.out.println("         _______)");
                    System.out.println("---.__________)");
                    System.out.println();


                }else if (number == 2){
                    myChoice = "Scissors";
                    System.out.println("    _______");
                    System.out.println("---'   ____)____");
                    System.out.println("          ______)");
                    System.out.println("       __________)");
                    System.out.println("      (____)");
                    System.out.println("---.__(___)");
                    System.out.println();
                }

                System.out.println("My choice is: "+myChoice);

                boolean myRock = myChoice.equalsIgnoreCase("rock");
                boolean myPaper = myChoice.equalsIgnoreCase("paper");
                boolean myScissors = myChoice.equalsIgnoreCase("scissors");
                //calcurate the total of wins
                //calculate which is the winner
                if ((rock&&myRock)||(paper&&myPaper)||(scissors&&myScissors)){
                    System.out.println("We are even");

                }
                else if((rock&&myScissors)||(scissors&&myPaper)||(paper&&myRock)){
                    System.out.println("***You won!***");
                    userWon++;
                }
                else if((rock&&myPaper)||(scissors&&myRock)||(paper&&myScissors)){
                    System.out.println("***You lost!***");
                    myWon++;
                }

                System.out.println("we have "+ (4-i )+ " more times.  Please type your choice!");

            }else{
                System.out.println("Your choice is wrong.  Please try again");
            }


        }
        String winner;
        if (userWon>myWon){
            winner = "You";
        }else{
            winner ="Me";
        }
        System.out.print("You won "+userWon+" times and I won "+myWon+" times.  The winner is..."+ winner);
    }
}