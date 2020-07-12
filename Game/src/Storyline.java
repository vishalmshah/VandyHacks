
import java.util.*;


public class Storyline {
    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);
        int choice;
        Player mainguy = new Player();

        dayOne(reader, choice);


    }

    //static methods
    public static void dayTwo(Scanner reader, int choice, Player player) {
        //Day 2
        System.out.println("Friday: Noon \033[3m5% " +
                "infected\033[0m \n*****************************\n");
        choicePrompt();
        System.out.println("Do you wake your roommate up to go explore/go explore by yourself?");
        choice = getValidChoice(reader);
        if(choice == 2) {
            player.changeSI(-10);

        }

        System.out.println("\n");
        choicePrompt();
        System.out.println("");
    }

    public static void dayOne(Scanner reader, int choice) {
        //Day 1
        System.out.println("Thursday: 6:00pm Move-In Day\n*****************************\n");
        System.out.println("Welcome to Vanderbelt University! We're thrilled to welcome you to " +
                "our community. Go ahead and get settled in your freshmen residential college.");

        String houseName = Environment.freshmanHouse();
        System.out.println("\nYour assigned residential house is " + houseName + "\nYou walk to " +
                "your dorm room. Your roommate is already there.");

        choicePrompt();
        System.out.println("Do you talk to your roommate/ignore your roommate?");
        choice = getValidChoice(reader);

        if(choice == 1) {
            //FIXME commons location is found, memory map accessed @Environment
        }
        else if(choice == 2) {
            //FIXME -10 HP due to tiredness from wandering @Player, commons location is found,
            // memory map accessed @Environment
        }

        //FIXME Narrator sout statement explaining how to access memory map and what it is?

        System.out.println("\nYou've arrived at Commons Dining Hall. You see groups of people " +
                "milling about.");
        choicePrompt();
        System.out.println("Do you talk/ignore?" );
        choice = getValidChoice(reader);

        if(choice == 1) {
            System.out.println("You introduce yourself. They launch into their introduction.");
            System.out.println("\n\"Hello my name is Brett! I'm so excited to be here at " +
                    "Vandy!! ");
            System.out.print("\nI'm an econ major with a minor in HOD and can't wait to rush " +
                    "KA!!\nI'm from Alabama by the way. Can't wait for the football games and " +
                    "tailgates!\"\n");
            System.out.print("\n You wonder to yourself what is HOD...?");
        }

        System.out.println("A stranger approaches you.");
        choicePrompt();
        System.out.println("Do you talk/ignore?");
        choice = getValidChoice(reader);

        if(choice == 1) {
            System.out.println("They look a little confused.");
            System.out.println("\n\"Hey I'm Kayleigh, I think I might be pre-med and currently " +
                    "double majoring in Biology and Neuroscience, but that might change! \nDid " +
                    "you " +
                    "hear about Chet last night?? Big yikes!\"\n");
            System.out.println("You want to ask her more about Chet but she has walked away " +
                    "around. Rude.");
        }

        System.out.println("Another stranger walks towards you.");
        choicePrompt();
        System.out.println("Do you talk/ignore?");
        choice = getValidChoice(reader);

        if(choice == 1) {
            System.out.println("It's a guy you recognize from earlier.");
            System.out.println("\n\" Hey dude! I'm Caleb from San Fran. Heard the food at Commons" +
                    " was gnarly. Boutta head over to Rand with a few of the dudes. Wanna " +
                    "come?\"\n");
            //FIXME rand location is found, memory map accessed @Environment
            System.out.println("You've arrived at Rand Dining Hall with your new friends. You " +
                    "discover Rand Bowls, one of the more appealing food options.");
        }
        if(choice == 2) {
            System.out.println("The food at Commons seems non-edible so you go to the nearby " +
                    "munchie mart to eat instead. As you exit Commons, you see shadowy figures in" +
                    " the dark.");
            choicePrompt();
            System.out.println("Do you investigate/do not investigate?");
            int choice2 = getValidChoice(reader);

            if(choice2 == 1) {
                System.out.println("You notice two dining hall workers leaving. They look unwell," +
                        " with swollen bruising faces. They groan terribly. You think they " +
                        "must've ate something bad. Hope they're okay.");
            }

        }
        System.out.println("You return to your dorm. You spend the night talking your roommate. " +
                "You are both excited for the next day. You sleep late. ");
        System.out.println("*******End Day One*******");

    }

    /**
     * encode-
     * repeats same output before each choice aspect
     */
    public static void choicePrompt() {
        System.out.println("\n\nCHOICE: ");
        System.out.println("Press 1/2 to make your decision");
    }

    /**
     * encode-
     * prompts the user for a valid int input (incorporates hasNext() methods)
     * Precondition: none
     * @param reader -- used to read in the user's input test score
     * @return -- the int that the user entered
     */
    public static int getValidChoice(Scanner reader) {
        int choice = 0;

        //the next line is a code tidbit provided by Prof. Dan Arena
        String test = reader.nextLine().trim();

        //while loop that runs the program until the user gives a valid input
        while (choice < 1 || choice > 2) {

            //the next line is a code tidbit provided by Prof. Dan Arena
            Scanner reader2 = new Scanner(test);

            //the next line is a code tidbit provided by Prof. Dan Arena
            if(test.length()!=0) { //if statement tests to see if anything was inputted

                //the next line is a code tidbit provided by Prof. Dan Arena
                if (reader2.hasNextInt()) { //tests if it is an int using hasNext(), if true,
                    // stores the input
                    choice = reader2.nextInt();

                    //if statement tests if the int is not within the valid range and prompts again
                    if (choice < 0 || choice > 2) {
                        System.out.println("Input must be either 1 or 2. Please try again");
                        test = reader.nextLine().trim();
                    }
                }
                else { //goes with the second if, tests if the user did not input an int and
                    // prompts again
                    System.out.println("Input must be either 1 or 2. Please try again");
                    test = reader.nextLine().trim();
                }
            }
            //this else goes with the first if and is for if the user doesn't put anything
            else {
                System.out.println("Input must be either 1 or 2. Please try again");
                test = reader.nextLine().trim();
            }
        }
        return choice;
    }

}
