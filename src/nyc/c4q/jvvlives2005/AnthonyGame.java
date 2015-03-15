package nyc.c4q.jvvlives2005;

/**
 * Created by c4q-joshelynvivas on 3/14/15.
 */
import java.util.Scanner;
import java.util.Random;

public class AnthonyGame {

    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);
        Random rand = new Random();

        String zombies[] = { "Walker" , "Runner" , "Lurker"};
        String zombie;
        String supplies[] = { "medkit" , "can of beans" , "aerosol can" , "candle lighter" , "can of spam" };
        String supply;
        String playerInput;
        int playerMaxHP = 185;
        int zombieMaxHP = 50;
        int zombieHP;
        int playerATD = 50;
        int zombieATD = 40;
        int damageToZombie;
        int damageToPlayer;
        int supplyChance = 33;
        int encounterChance = 50;

        boolean encounter = true;

        System.out.println("\t******************************");
        System.out.println("\t****** THE DEAD WALKING ******");
        System.out.println("\t******************************");
        System.out.println("                               \n" +
                "         ~N$+7~                         \n" +
                "         .?:M~M8~       N.+ N:          \n" +
                "         .~++~Z       .7=I=M~           \n" +
                "         .7Z7.       ,$~~~=:~           \n" +
                "        ,?~D+            ..I7I          \n" +
                "       .+~~=     8DM       .?~N         \n" +
                "        8:::.  MDM8MON      +~~D        \n" +
                "       .?I:+   ?M?Z7$8M     +::~.       \n" +
                "         O:~  .,8?I+?87     .::=        \n" +
                "         .+:M .8I8Z$+8+    .~::7        \n" +
                "          I+~M ,I+++~O     ~~:D         \n" +
                "          ,~MMM M+DZM.   M~~~?          \n" +
                "          MNNNN.M8N~NM  NN+?7           \n" +
                "           MMNNMN=~~~~NNNNNM.           \n" +
                "           .MNMMI++M=NMNNNN..           \n" +
                "            .MNNMNIMMMNNMN,             \n" +
                "            .NNNN88ODNNND               \n" +
                "             NNNNNONDNDDN               \n" +
                "              NMNNNNDNMN.               \n" +
                "              .NNNONDNNN                \n" +
                "              .NMOOODNDM                \n" +
                "             ..=INNNNDDM                \n" +
                "         .    M~+MNDDDDM                \n" +
                "           .  8$ZNNDDDN8                \n" +
                "              NNNNNDDDNM                \n" +
                "             MNNNNNNNDNM .              \n" +
                "         . ..MNNNNNNMDDN                \n" +
                "            N8O88D88O8OM                \n" +
                "         . DOOON8888OOO8                \n" +
                "       . .DNOOOO8. DOOO8M               \n" +
                "         DZOOO8D   .8OOOO               \n" +
                "        MZOZZMM     8OOZZO              \n" +
                "        ZZZZ8~      N8Z8ZD              \n" +
                "       .~8ZMMI       NZZMN.             \n" +
                "      .MMDZN         NZZZMI             \n" +
                "       MDZZD         ZZDMD              \n" +
                "      .$MZZZM       M$ZZZ~              \n" +
                "       ZZZZDN       DZZZZ          \n\n");

        System.out.println("\t**** SUPPLY RUN ****");
        System.out.println("You are a survivor of Z-pocalypse. Your group of survivors is in desperate need of food and " +
                "\nmedicine after days of harsh traveling. You, being the most able bodied at the time, " +
                "\ndecide to go on a supply run to a nearby abandoned shelter. Upon arriving at the shelter " +
                "\nyou hear the familiar sounds of zombies coming from inside of the shelter. You pause for a " +
                "\nmoment, but urgency trumps your fear and you cling to your bludgeoning weapon and open the " +
                "\ndoor to the shelter...\n");

        FIGHT:
        while (encounter){
            if (playerMaxHP <= 0){
                System.out.println("Remaining HP: 0");
                break;
            }
            System.out.println("Remaining HP: " + playerMaxHP + "\n");
            System.out.println("What would you like to do next? ");
            System.out.println("1. Search for supplies.");
            System.out.println("2. Leave shelter.");

            playerInput = in.nextLine();
            if (playerInput.equals("1")) {
                System.out.println("You move through the shelter carefully while searching for supplies.\n");
                if (rand.nextInt(100) < supplyChance && rand.nextInt(100) > encounterChance){
                    supply = supplies[rand.nextInt(supplies.length)];
                    System.out.println("You find a(n) " + supply + "!\n");
                }
                else if (rand.nextInt(100) < supplyChance && rand.nextInt(100) < encounterChance){
                    supply = supplies[rand.nextInt(supplies.length)];
                    zombieHP = rand.nextInt(zombieMaxHP);
                    zombie = zombies[rand.nextInt(zombies.length)];

                    System.out.println("You find a(n) " + supply + "!\n");
                    System.out.println("\t>>>> You encounter a " + zombie + "! <<<<");


                    while (zombieHP > 0) {
                        System.out.println("\t\t\t" + "Your HP: " + playerMaxHP);
                        System.out.println("\t\t\t" + zombie + "'s HP: " + zombieHP);
                        System.out.println("\nWhat will you do? (Please choose 1 or 2)");
                        System.out.println("1. Attack!");
                        System.out.println("2. Run away!!");

                        playerInput = in.nextLine();

                        if (playerInput.equals("1")) {
                            damageToZombie = rand.nextInt(playerATD);
                            damageToPlayer = rand.nextInt(zombieATD);

                            zombieHP -= damageToZombie;
                            playerMaxHP -= damageToPlayer;

                            System.out.println("\nYou hit the " + zombie + " for " + damageToZombie + " damage!");
                            System.out.println("The " + zombie + " attacks you for " + damageToPlayer + " damage!\n");

                            if (playerMaxHP < 1) {
                                System.out.println("You are rendered incapacitated and succumb to your bloody fate...");
                                break;
                            }

                        } else if (playerInput.equals("2")) {
                            System.out.println("You turn to run away from the " + zombie + "!");
                            if (zombie.equals("Runner")) {
                                damageToPlayer = rand.nextInt(zombieATD);

                                System.out.println("You cannot run from a runner!");
                                playerMaxHP -= damageToPlayer;

                                System.out.println("The " + zombie + " attacks you for " + damageToPlayer + " damage!\n");
                            }
                            else {
                                System.out.println("You have escaped the " + zombie + "!\n");
                                continue FIGHT;
                            }
                        } else {
                            System.out.println("Invalid selection. Please choose 1 or 2.");
                        }
                        if (zombieHP <= 0) {
                            System.out.println("\nYou have defeated the " + zombie + "!\n");
                        }
                    }
                }
                else if (rand.nextInt(100) > supplyChance && rand.nextInt(100) < encounterChance) {

                    zombieHP = rand.nextInt(zombieMaxHP);
                    zombie = zombies[rand.nextInt(zombies.length)];


                    System.out.println("\t>>>> You encounter a " + zombie + "! <<<<");


                    while (zombieHP > 0){
                        System.out.println("\t\t\t" + "Your HP: " + playerMaxHP);
                        System.out.println("\t\t\t" +zombie + "'s HP: " + zombieHP);
                        System.out.println("\nWhat will you do? (Please choose 1 or 2)");
                        System.out.println("1. Attack!");
                        System.out.println("2. Run away!!");

                        playerInput = in.nextLine();

                        if (playerInput.equals("1")){
                            damageToZombie = rand.nextInt(playerATD);
                            damageToPlayer = rand.nextInt(zombieATD);

                            zombieHP -= damageToZombie;
                            playerMaxHP -= damageToPlayer;

                            System.out.println("\nYou hit the " + zombie + " for " + damageToZombie + " damage!");
                            System.out.println("The " + zombie + " attacks you for " + damageToPlayer + " damage!\n");

                            if (playerMaxHP < 1){
                                System.out.println("You are rendered incapacitated and succumb to your bloody fate...");
                                break;
                            }

                        }
                        else if (playerInput.equals("2")){
                            System.out.println("You turn to run away from the " + zombie + "!");
                            if(zombie.equals("Runner")){
                                damageToPlayer = rand.nextInt(zombieATD);

                                System.out.println("You cannot run from a runner!");
                                playerMaxHP -= damageToPlayer;

                                System.out.println("The " + zombie + " attacks you for " + damageToPlayer + " damage!\n");
                            }
                            else {
                                System.out.println("You have escaped the " + zombie + "!\n");
                                continue FIGHT;
                            }
                        }
                        else {
                            System.out.println("Invalid selection. Please choose 1 or 2.");
                        }
                        if (zombieHP <= 0) {
                            System.out.println("\nYou have defeated the " + zombie + "!\n");
                        }
                    }
                }
                else {
                    System.out.println("You find nothing of use in this area...\n");
                }
            }
            else if (playerInput.equals("2")) {
                System.out.println("You take what you have on you and hastily exit the shelter.");
                break;
            }
            else {
                System.out.println("Invalid selection. Please choose 1 or 2.");
            }




        }
        System.out.println("+*******************************+");
        System.out.println("|******                   ******|");
        System.out.println("|***** THANKS FOR PLAYING! *****|");
        System.out.println("|******                   ******|");
        System.out.println("+*******************************+");
    }
}
