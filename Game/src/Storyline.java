
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


    }

    public static void choicePrompt() {
        System.out.println("CHOICE: ");
        System.out.println("Press 1/2 to make your decision");
    }
}
