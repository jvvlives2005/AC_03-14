package nyc.c4q.jvvlives2005;

/**
 * Created by c4q-joshelynvivas on 3/14/15.
 */
import java.util.Random;
import java.util.Scanner;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.NoSuchElementException;


public class RomonaGame{
    public static void main(String[] args) throws IOException {

        Scanner input = new Scanner(System.in);
        String startPrompt;

        // title screen
        System.out.println(Screen.title());
        System.out.println(Screen.byline());
        System.out.println("'start' to begin >");

        // game loop
        while(true) {

            startPrompt = input.next();
            if (startPrompt.equalsIgnoreCase("start")) {

                starScroll(250, Screen.firstScene());

                // Waits for user input to continue
                boolean enter = false;
                System.out.println("'y' to continue >");
                while(!enter) {
                    String prompt = input.next();
                    if (prompt.equals("y")) {
                        enter = true;
                    }
                }

                // start of user play
                System.out.println(Screen.clearScreen());
                System.out.println("\n\non the way home from a long interstellar journey, you've crash landed on the planet earth.\n\nyour spaceship appears to be in alright condition, but the landing jostled its circuitry and destroyed the fragile motherboard.\n\nwithout this important system, your spaceship will not fly.\n\nyou look around and see nothing but desert.\n\na desolate highway stretches into the distance towards an old gas station.\n\nin the other direction, a rocky outcrop rises to a vantage point.\n\nhow will you fix your spaceship and return home?\n");
                // location
                String location = "spaceship";

                // inventory
                boolean hasFlowers = false;
                boolean hasArrowhead = false;
                boolean hasScrewdriver = false;
                boolean hasAndroidPhone = false;
                boolean hasMotherboard = false;

                // in scene
                boolean isFlowers = false;
                boolean isArrowhead = false;
                boolean isScrewdriver = false;
                boolean isAndroidPhone = false;


                // once panelFixed is true, you win the game
                boolean panelFixed = false;


                // the following block for dealing with IOExceptions is adapted from Alex's code in the Roman Numeral Calculator.java class
                final BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
                // loop forever
                while (!panelFixed) {
                    // show the prompt
                    System.out.print("> ");
                    // read a line of input
                    final String line = reader.readLine();
                    if (line.equalsIgnoreCase("help")) {
                        System.out.println(Screen.help());
                    } else if (line.equalsIgnoreCase("map")) {
                        System.out.println(Screen.map());
                    } else if (line.equalsIgnoreCase("inventory")) {
                        System.out.println("\n  [inventory]\n");
                        if (hasFlowers) {
                            System.out.println(" ~flowers");
                        }
                        if (hasArrowhead) {
                            System.out.println(" ~arrowhead");
                        }
                        if (hasScrewdriver) {
                            System.out.println(" ~screwdriver");
                        }
                        if (hasAndroidPhone) {
                            System.out.println(" ~android phone");
                        }
                        if (hasMotherboard) {
                            System.out.println(" ~motherboard");
                        }
                        if (!hasArrowhead && !hasFlowers && !hasScrewdriver && !hasAndroidPhone && !hasMotherboard) {
                            System.out.println("~empty~");
                        }
                        System.out.println("\n");
                    } else {
                        // scans user input into three parts: verb, preposition, and noun
                        final Scanner scanner = new Scanner(line);
                        final String verb, preposition, noun;
                        try {
                            verb = scanner.next();
                            preposition = scanner.next();
                            noun = scanner.next();
                        } catch (NoSuchElementException e) {
                            System.out.println("\nsorry, i don't understand... enter 'help' to view commands\n");
                            continue;
                        }


                        // interprets user input
                        // TODO: i wish i could isolate this whole section in its own method, but i'm having a hard time tracking inventory when i try to do it that way
                        if (verb.equalsIgnoreCase("pick")) { // deals with picking up objects

                            if (noun.equalsIgnoreCase("flowers") && isFlowers == true && hasFlowers == false) {
                                hasFlowers = true;
                                isFlowers = false;
                                System.out.println("\nyou pick up the delicate blue flowers. they remind you of home.\n");
                            } else if (noun.equalsIgnoreCase("arrowhead") && isArrowhead == true && hasArrowhead == false) {
                                hasArrowhead = true;
                                isArrowhead = false;
                                System.out.println("\nyou pick up the arrowhead. its edge is very sharp.\n");
                            } else if ((noun.equalsIgnoreCase("screwdriver") || noun.equalsIgnoreCase("nice")) && isScrewdriver == true && hasScrewdriver == false) {
                                hasScrewdriver = true;
                                isScrewdriver = false;
                                System.out.println("\nyou pick up the screwdriver. it's a small phillips head.\n");
                            } else if (noun.equalsIgnoreCase("android") && isAndroidPhone == true && hasAndroidPhone == false) {
                                hasAndroidPhone = true;
                                isAndroidPhone = false;
                                System.out.println("\nyou pick up the android phone. too bad earth hasn't gotten interstellar 4G yet...\n");
                            } else {
                                System.out.println("\nyou can't pick that up.\n");
                            }

                        } else if (verb.equalsIgnoreCase("look")) { // deals with looking at objects

                            if (noun.equalsIgnoreCase("flowers") && hasFlowers) {
                                System.out.println("\nsuch beautiful flowers... they remind you of home.\nyou really must be getting back.\n");

                            } else if (noun.equalsIgnoreCase("arrowhead") && (hasArrowhead || isArrowhead)) {
                                System.out.println("\nwhat a fine tool. its edge is very sharp.\n");

                            } else if (noun.equalsIgnoreCase("screwdriver") && (hasScrewdriver || isScrewdriver)) {
                                System.out.println("\nthis is a very tiny screwdriver. maybe intended for electronics repair?\n");

                            } else if (noun.equalsIgnoreCase("android") && (hasAndroidPhone || isAndroidPhone)) {
                                System.out.println("\na somewhat primitive technology. you wonder if earthling circuit design is similar to your own.\n");

                            } else if (noun.equalsIgnoreCase("motherboard") && (hasMotherboard)) {
                                System.out.println("\na small green motherboard. it's not unlike your spaceship's circuit board.\n");

                            }else {
                                System.out.println("\nyou look at the " + noun + ". maybe it's a mirage?\n");
                            }

                        } else if (verb.equalsIgnoreCase("go")) { // deals with moving between scenes

                            if (noun.equalsIgnoreCase("spaceship")) {
                                location = "spaceship";
                                System.out.println("\nyour spaceship is nestled in the sand among shrubs and cacti.\n");
                                if (!panelFixed) {
                                    System.out.println("light curls of smoke drift from the circuit panel.\n\nyou wish you could figure out how to get it working.\n");
                                }
                            } else if (noun.equalsIgnoreCase("rocky")) {
                                location = "rocky-outcrop";
                                if (!hasFlowers) {
                                    isFlowers = true;
                                }
                                if (!hasArrowhead) {
                                    isArrowhead = true;
                                }
                                System.out.println("\nyou huff and puff to the top of the rocky outcrop.\n\nthe desert stretches off for miles around you.\n\nfar off on the horizon you see the hazy skyline of an earthling city.\n");
                                if (isArrowhead) {
                                    System.out.println("on the ground you notice a beam of sunlight reflecting off a tiny arrowhead.\n");
                                }
                                if (isFlowers) {
                                    System.out.println("lovely blue flowers dot the ground.\n");
                                }
                            } else if (noun.equalsIgnoreCase("gas")) {
                                location = "gas-station";
                                if (!hasScrewdriver) {
                                    isScrewdriver = true;
                                }
                                if (!hasAndroidPhone) {
                                    if (!hasMotherboard) {
                                        isAndroidPhone = true;
                                    }
                                }
                                System.out.println("\nthe gas station is totally deserted.\n\ninside everything is covered with layer of sandy dust.\n");
                                if (isScrewdriver) {
                                    System.out.println("a rusty toolbox sits in the corner. in it, you notice a nice screwdriver.\n");
                                }
                                if (isAndroidPhone) {
                                    System.out.println("on the counter you notice an android phone. what a strange thing for someone to leave behind.\n");
                                }
                            } else if (noun.equalsIgnoreCase("city")) {
                                System.out.println("\nyou can't go there. you'll end up in a museum for sure.\n");
                            } else {
                                System.out.println("\ni don't understand. enter 'map' to see locations you can go to.\n");
                            }

                        } else if (verb.equalsIgnoreCase("use")) { // deals with using objects
                            if (noun.equalsIgnoreCase("arrowhead") || noun.equalsIgnoreCase("screwdriver") || noun.equalsIgnoreCase("motherboard")) {
                                System.out.print("\nuse the " + noun + " on (enter an object) >");
                                final Scanner use = new Scanner(System.in);
                                final String useOn;
                                try {
                                    useOn = use.nextLine();
                                } catch (NoSuchElementException e) {
                                    System.out.println("\nsorry, i don't understand... enter 'help' to view commands\n");
                                    continue;
                                }
                                if (location.equalsIgnoreCase("spaceship") && noun.equalsIgnoreCase("arrowhead") && hasArrowhead && hasMotherboard && (useOn.equalsIgnoreCase("wires") || useOn.equalsIgnoreCase("spaceship") || useOn.equalsIgnoreCase("motherboard"))) {
                                    System.out.println("\nyou use the arrowhead to cut the wires and remove the old motherboard.\n\nthe new motherboard fits snugly into place and you twist the wires to connect it.\n");
                                    panelFixed = true;

                                    // Waits for user input to continue
                                    boolean enter4 = false;
                                    System.out.println("'y' to continue >");
                                    while(!enter4) {
                                        String prompt = input.next();
                                        if (prompt.equals("y")) {
                                            enter4 = true;
                                        }
                                    }

                                    // spaceship scene
                                    System.out.println(Screen.clearScreen());
                                    System.out.println("suddenly your spaceship comes to life!\n");
                                    System.out.println(Screen.spaceShip());
                                    System.out.println("you climb inside and program the coordinates for your home star into the navigation system.\n");
                                    System.out.println("are you ready to go home?\n");

                                    // Waits for user input to continue         // these are repetitive. i should just call a "wait for 'y' method" but... i'm... so... sleepy....
                                    boolean enter2 = false;
                                    System.out.println("'y' to continue >");
                                    while(!enter2) {
                                        String prompt = input.next();
                                        if (prompt.equals("y")) {
                                            enter2 = true;
                                        }
                                    }

                                    starScroll(250, Screen.lastScene());

                                    // Waits for user input to continue
                                    boolean enter3 = false;
                                    System.out.println("'y' to continue >");
                                    while(!enter3) {
                                        String prompt = input.next();
                                        if (prompt.equals("y")) {
                                            enter3 = true;
                                        }
                                    }

                                    // end screen
                                    System.out.println(Screen.clearScreen());
                                    System.out.println(Screen.heart());
                                    System.out.println(Screen.theEnd());
                                    System.out.println("\n\n\n\n\n\n");

                                } else if (noun.equalsIgnoreCase("screwdriver") && hasScrewdriver && hasAndroidPhone && (useOn.equalsIgnoreCase("android phone") || useOn.equalsIgnoreCase("android") || useOn.equalsIgnoreCase("phone"))) {
                                    System.out.println("\nyou use the screwdriver to remove the back cover of the android phone.\n\ninside is a small green motherboard. its not unlike the circuit board in your spaceship!\n\nyou discard the phone case and place the motherboard in your pocket.\n");
                                    hasAndroidPhone = false;
                                    hasMotherboard = true;
                                } else if (location.equalsIgnoreCase("spaceship") && noun.equalsIgnoreCase("motherboard") && hasMotherboard && (useOn.equalsIgnoreCase("wires") || useOn.equalsIgnoreCase("spaceship") || useOn.equalsIgnoreCase("circuits"))) {
                                    System.out.println("\nyou try to use the motherboard on the spaceship but the old circuits are held in place by many wires.\n\nif only you had something sharp to cut them with...\n");
                                } else {
                                    System.out.println("\ni'm not sure how you'd use the " + noun + " on the " + useOn + ".\n");
                                }
                            } else {
                                System.out.println("\ni don't know what you'd use that on!\n");
                            }
                        } else {
                            System.out.println("\nsorry, i don't understand... enter 'help' to view commands\n");
                        }
                    }
                }
            }
        }
    }



    public static void starScroll(int length, String scene) {

        // my favorite part: generates random star scroll

        Random random = new Random();
        String starLine = "";
        int starSpacing = 80;                       // increasing this value decreases the concentration of stars

        for (int i = 0; i < length; i++) {

            for (int j = 0; j < 220; j++) {         // widens the scroll

                int number = random.nextInt(starSpacing);

                if (number < 3) {
                    starLine = starLine + "☆";
                } else if (number == 3) {
                    starLine = starLine + "✧";
                } else if (number == 4) {
                    starLine = starLine + "˳";
                } else if (number == 5) {
                    starLine = starLine + "༚";
                } else {
                    starLine = starLine + " ";
                }
            }

            if (i == (length - 20)) {                   // determines position of scene in scroll
                System.out.println(scene);
            } else {
                System.out.println(starLine);
                starSpacing += 5;                       // thins stars as scroll progresses
                starLine = "";
                try {
                    Thread.sleep(10);                   // increasing this value slows the scrolling
                } catch (InterruptedException ex) {
                    Thread.currentThread().interrupt();
                }
            }
        }
    }
}
