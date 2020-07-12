
import java.util.*;

public class Storyline {
    public static void main(String[] args) {
        Random randy = new Random(11);
        Scanner reader = new Scanner(System.in);

        //Day 1
        System.out.println("Thursday: 6:00pm Move-In Day\n*****************************\n");
        System.out.println("Welcome to Vanderbelt University! We're thrilled to welcome you to " +
                "our community. Go ahead and get settled in your freshmen residential college.");

        int house = randy.nextInt();
        String houseName;
        //FIXME method to call houseName from @Environment
        System.out.println("\nYour assigned residential house is " + houseName + "\nYou walk to " +
                "your dorm room. Your roommate is already there.");

        choicePrompt();
        System.out.println("Do you talk to your roommate/ignore your roommate?");
        int choice = reader.nextInt();

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
        choice = reader.nextInt();

        if(choice == 1) {
            System.out.println("You introduce yourself");
            System.out.println("\n \" Hello my name is Brett! I'm so excited to be here at " +
                    "Vandy!!\" ");
            System.out.println("I'm an econ major with a minor in HOD and can't wait to rush " +
                    "KA!!\nI'm from Alabama by the way. Can't wait for the football games and " +
                    "tailgates!");
            System.out.println("\n You wonder to yourself what is HOD...");
        }








    }

    public static void choicePrompt() {
        System.out.println("\nCHOICE: ");
        System.out.println("Press 1/2 to make your decision");
    }

    /**
     * encode-
     * this method prompts the user for a valid int input (incorporates hasNext() methods)
     * Precondition: none
     * @param reader -- used to read in the user's input test score
     * @return -- the int that the user entered
     */
    public static int getValidIntScore(Scanner reader) {
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
