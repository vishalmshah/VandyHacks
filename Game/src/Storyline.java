
import java.util.*;

public class Storyline {
    public static void main(String[] args) {
        Random randy = new Random(11);
        Scanner reader = new Scanner(System.in);

        System.out.println("Welcome to Vanderbelt University! We're thrilled to welcome you to " +
                "our community. Go ahead and get settled in your freshmen residential college.");

        int house = randy.nextInt();
        String houseName;
        //method to call houseName from @Environment
        System.out.println("Your assigned residential house is " + houseName);

        choicePrompt();
        System.out.println("Do you talk to your roommate/ignore your roommate?");
        int choice = reader.nextInt();

        if(choice == 1) {
            //FIXME commons location is found, memory map accessed
        }
        else if(choice == 2) {
            //FIXME -10 HP due to tiredness from wandering, commons location is found, memory map
            // accessed
        }

        //FIXME sout statement explaining how to access memory map and what it is?

        System.out.println("You've arrived at Commons Dining Hall. You see groups of people " +
                "milling about. ");
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
        System.out.println("CHOICE: ");
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
        int score = -1;

        //the next line is a code tidbit provided by Prof. Dan Arena
        String test = reader.nextLine().trim();

        //while loop that runs the program until the user gives a valid input
        while (score < 0 || score > 100) {

            //the next line is a code tidbit provided by Prof. Dan Arena
            Scanner reader2 = new Scanner(test);

            //the next line is a code tidbit provided by Prof. Dan Arena
            if(test.length()!=0) { //if statement tests to see if anything was inputted

                //the next line is a code tidbit provided by Prof. Dan Arena
                if (reader2.hasNextInt()) { //tests if it is an int using hasNext(), if true,
                    // stores the input
                    score = reader2.nextInt();

                    //if statement tests if the int is not within the valid range and prompts again
                    if (score < 0 || score > 100) {
                        System.out.println("Test score must be a value between 0-100 inclusive. Enter the" +
                                " test score:");
                        test = reader.nextLine().trim();
                    }
                }
                else { //goes with the second if, tests if the user did not input an int and
                    // prompts again
                    System.out.println("Test score must be a value between 0-100 inclusive. Enter" +
                            " the test score:");
                    test = reader.nextLine().trim();
                }
            }
            //this else goes with the first if and is for if the user doesn't put anything
            else {
                System.out.println("Test score must be a value between 0-100 inclusive. Enter the test score:");
                test = reader.nextLine().trim();
            }
        }
        return score;
    }

}
