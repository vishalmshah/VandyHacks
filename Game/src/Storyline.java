
import java.util.*;


public class Storyline {
    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);
        int choice;
        Player mainguy = new Player();

        dayOne(reader, choice, mainguy);
        dayTwo(reader, choice, mainguy);




    }

    //static methods
    public static void dayThree(Scanner reader, int choice, Player player) {
        System.out.println("Saturday: 9:00am \033[3m10% " +
                "infected\033[0m \n*****************************\n");
        System.out.println("You awake to your roommate's bird alarm that supposed to wake people " +
                "up naturally. It did not feel natural. They continue to sleep...);

        choicePrompt();
        System.out.println("Do you wake your roommate and tell them to turn off alarm/wake up " +
                "yourself and turn it off?");
        choice = getValidChoice(reader);
        if(choice == 1) {
            System.out.println("Your roommate is unhappy and tells you to shut up. You two fight." +
                    " You both end up awake and grumpy.");
            //FIXME -10SI @Player
        }
        else {
            System.out.println("You wake up and fumble around their alarm clock. It's confusing " +
                    "but you figure it out. Your roommate awakes now and you exchange polite " +
                    "\"mornings\". All is well.");
            //FIXME +10SI @Player
        }

        System.out.println("You walk to Rand for breakfast. But it hasn't opened yet so you grab " +
                "food at Food For A Thought cafe at Central Library. You have a V-squared Mentor " +
                "meeting in half an hour and you leisurely make your way to it. You are excited " +
                "to meet a fellow engineer who is an upperclassman.");
        System.out.println("While you were able to find Featheringill Hall on time, you get " +
                "confused inside.");
        //FIXME add featheringill to memory map @Environment

        choicePrompt();
        System.out.println("Do you ask a nearby person for directions/try to find the meeting " +
                "room by yourself?");
        choice = getValidChoice(reader);
        if(choice == 1) {
            System.out.println("You meet a friendly upperclassmen.");
            System.out.println("\n\" @CAL PUT NPC Conversation here where player finds room " +
                    "ultimately");
        }
        else {
            System.out.println("You're already late to your meeting and so you decide to take " +
                    "your time exploring Featheringill. You discover a munchie mart around the " +
                    "corner and decide to buy three dishes of store-styled stale sushi. Worth it.");
            //FIXME +10HP @Player
        }

        System.out.println("After V-squared Mentor meeting, you are tired. You want to lie on the" +
                " Magnolia lawn outside Commons.");
        choicePrompt();
        System.out.println("Do you choose to lie on Magnolia lawn even if you feel " +
                "self-conscious/sit quietly on a bench like a normal person?");
        choice = getValidChoice(reader);
        if(choice == 1) {
            System.out.println("You are BOLD so you decide to lie on Magnolia Lawn alone. You " +
                    "feel eyes watching you but you don't care. This is part of your VU " +
                    "Experience. Suddenly you hear a loud scream nearby.");
            System.out.println("\n THERE IS A ZOMBIE NEARBY!");
            //FIXME add zombie attack here
        }
        else {
            System.out.println("You enjoy a peaceful afternoon until");
        }

    }
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
        System.out.println("Do you wander around campus/wander around the Hillsboro area?");
        choice = getValidChoice(reader);
        if(choice == 1) {
            //FIXME add campus locations
            System.out.println("You discover these secret tunnels underneath the building of " +
                    "Stevenson. As you wander, you hear a moan behind and you hide. In the " +
                    "tunnels is a person strapped to a hospital bed!! Their skin is turning " +
                    "greenish and peeling off. Their eyes are pure white. Scared, you flee. What " +
                    "a scary experience!");
        }
        else {
            //FIXME add hillsboro taste of nashville locations?/commons locations of each house??
            System.out.println("As you are crossing the busy street to get to the burger place " +
                    "known as Hopdoddy, a car is coming at you full speed. You're in the middle " +
                    "of the road! You run towards the other side but the car slams into your foot" +
                    " and sends you flying. Wow, that's gotta hurt. :( \n In your haze of pain, " +
                    "you notice something off about the driver. His car has stopped but he has " +
                    "not gotten out. Instead he stares blankly past you with clouded over eyes. " +
                    "He smiles revealing rotten teeth. One falls off! Grossed out, you limp away " +
                    "to Jeni's for ice cream to heal your tramautized soul.");
        }

        System.out.println("After resting for a while, you check your watch. You are now late to " +
                "your first Vanderbelt Visions meeting!");

        choicePrompt();
        System.out.println("Do you ask stranger for help finding your group/wander around and " +
                "find them on your own?");
        choice = getValidChoice(reader);
        if(choice == 1) {
            System.out.println("\nThe stranger has glossy eyes and a puffy face. They slur their " +
                    "words a little. You wonder if they are okay.");
            System.out.println("\n\" Hi!!!! My name is Naya and I'm from Chicago, well not " +
                    "really, but you wouldn't know where Naperville is. Anyways...I'm really " +
                    "really REALLY excited to be here. My mommy and daddy told me Vandy was the " +
                    "school for me. And when I came here, I just fell in love with its southern " +
                    "charm. Do you want this Rand cookie? Someone gave it to me but I'm on a keto" +
                    " " +
                    "diet so ya know...\"");
            choicePrompt();
            System.out.println("\nDo you take cookie/refuse cookie?");
            int choice2 = getValidChoice(reader);
            if(choice2 == 1)
                System.out.println("\nYou've heard about the reknown Rand cookies and are eager " +
                        "to " +
                        "try them. However, you feel a little sick afterwards. Weird...");
            else
                System.out.println("\nYou say no and go on your way to Visions.");
        }
        else {
            System.out.println("\nYou're tired by the time you finally find your Visions group.");
            //FIXME -10HP @Player -10SI @Player
        }

        System.out.println("Visions is full of awkward icebreakers but the group seems generally " +
                "nice so you are relieved. Yet you still dread the next meeting. As a group, you " +
                "head over to Langford Auditorium to watch a skit. You have realized you're " +
                "soaked in sweat in this 90 degree weather by the time you get there.");
        //FIXME add Langford Auditorium to memory map @Environment

        choicePrompt();
        System.out.println("Do you remain in your soaked clothes/quickly run back to your dorm to" +
                " apply deodorant?");
        choice = getValidChoice(reader);

        if(choice == 1) {
            System.out.println("You decide to stick with your group. However, with your soaked " +
                    "clothes and a slight smell coming from you, no one sits besides you. It's " +
                    "okay though because you estimate that by the time the skit is over, your " +
                    "sweat will have dried and no longer have sweat stains. You missed the entire" +
                    " skit thinking about sweating.");
            //FIXME -10 SI @Player for sweating
        }
        else {
            System.out.println("You decide to run back to your dorm causing you to sweat even " +
                    "more. You apply your deodorant and change shirts. You meet your Head of " +
                    "House professor on the way out.");
            System.out.println("She starts talking. You are forced to listen.");
            System.out.println("\n\" Hey there kiddo! Hope you're enjoying your first few days " +
                    "here. Before you even say anything, don't worry, I'm not here to monitor " +
                    "your every move LOL. I'm a cool mom, get it? I'm just here to make sure your" +
                    " Vandy experience goes as smoothly as possible! Let me know if there is " +
                    "anything you need and ANCHOR DOWN!!\"\n");
            System.out.println("You run back to the auditorium and watch the skit. It is okay.");
        }

        System.out.println("You grab a quick meal with friends afterwards at Satay, a Thai " +
                "restaurant. They have delicious boba.");
        //FIXME add Satay to memory map @Environment

        System.out.println("Night falls and you get ready for bed. Your roommate confesses to you" +
                " that they must blast white noise in order to fall asleep. You require dead " +
                "silence to sleep.");

        choicePrompt();
        System.out.println("Do you confront them/do not confront them and just try to sleep?");
        choice = getValidChoice(reader);
        if(choice == 1) {
            System.out.println("You come to a civil agreement and decide it is okay to softly " +
                    "play their white noise.");
            //FIXME +10 SI @Player
        }
        else {
            System.out.println("You can't sleep all night long and are exhausted in the morning.");
            //FIXME -10 HP @Player
        }

        System.out.println("*******End Day Two*******");
    }

    public static void dayOne(Scanner reader, int choice, Player player) {
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
