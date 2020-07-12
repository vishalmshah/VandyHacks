
import java.util.*;


public class Storyline {
    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);
        int choice = 0;
        Player mainguy = new Player();
        String memoryMap[] = new String[10];

        //FIXME while HP is above certain level if not then end game??
        dayOne(reader, choice, mainguy, memoryMap);
        dayTwo(reader, choice, mainguy, memoryMap);
        dayThree(reader, choice, mainguy, memoryMap);
        dayFour(reader, choice, mainguy, memoryMap);
        dayFive(reader, choice, mainguy, memoryMap);
        daySix(reader, choice, mainguy, memoryMap);
        daySeven(reader, choice, mainguy, memoryMap);
        dayEnd(reader);

        /*Format for days
        make separate method dayFive, daySix, etc. should have the same parameters.
        System.out.println("Saturday: 9:00am \033[3m10% " +
                "infected\033[0m \n*****************************\n");
         insert this print statement at beginnging, replace saturday and time. After [3m is 10%
         infected. That is the text that is italicized. Replace 10% infected with the infected
         percentage for your day. the text that is italicized is in [3m to \033.

         reference google doc and begin print statements
         when reaching a choice

         first
         choicePrompt();
         then type print statement of choice with a / between the options in the text
         choice = getValidChoice(reader); this makes sure their int input is a valid choice
         begin if statements for the results of each choice
         if(count == 1) {
            ......code...
         }
         else {
            .....code....
         }

         continue to do until end of day
         put this printout statement at end, replace three with whatever day number you have
         System.out.println("*******End Day Three*******");

         don't forget to put your day method in main in the while loop. scroll up to see what I
         have done so far
         */

    }

    //static methods
    public static void dayEnd(Scanner reader) {
        System.out.println("You wake up in your bed at home. You breathe a sigh of relief.");
        System.out.println("Your phone dings. You got an email from Vanderbelt University. What " +
                "does it say?");
        System.out.println("\"Please return to campus to retrieve your belongings.\"");
        System.out.println("\n\t\t\t\tEND");
    }

    public static void daySeven(Scanner reader, int choice, Player player, String[] memoryMap) {
        System.out.println("Wednesday: 9:00am \033[3m100% " +
                "infected\033[0m \n*****************************\n");
        System.out.println("You wake up to an email and 15 missed calls from your parents"+
                " and new friends");
        System.out.println("Dear Vanderbelt student, all classes are cancelled for the" +
                " remainder of the semester. Please go home");
        System.out.println("You look over at your roommate. They are sitting in their chair" +
                " staring at you");
        System.out.println("You ask: Hey, how are you getting home?");
        System.out.println("Your roommate jumps at you and starts to attack");
        // FIXME: Zombie fight sequence

        System.out.println("You need to get out. You anxiously stuff whatever you" +
                " can into a backpack");

        choicePrompt();
        System.out.println("Go out the door/go out the window");
        choice = getValidChoice(reader);
        if(choice == 1) {
            System.out.println("You open the door and 20 zombies turn at you. You should" +
                    " use the window.");
        }

        System.out.println("Out of breath, you glance behind you to see that the zombies have broken" +
                " through your door. You look over at the window, and decide to make the 3 story jump" +
                " into the construction dirt pile below. You hit the ground and immediately run for" +
                " cover in the bushes to check your email. It reads:");
        System.out.println("\"Students please report to Light Hall for emergency evacuation\"");

        choicePrompt();
        System.out.println("Do you find other survivors and go in a group/head straight to Light Hall");
        choice = getValidChoice(reader);
        if(choice == 1) { // TODO: A short version of what is actually supposed to happen
            System.out.println("You find other survivors and start moving");
        } else {
            System.out.println("You start walking and meet a small group on the way." +
                    " You join them");
        }

        for(int i = 0; i < 3; ++i) {
            System.out.println("You and your group search intently");
            // FIXME: A couple zombie attacks here
        }

        System.out.println("You find Light Hall! You climb the stairs to the roof");
        System.out.println("A helicopter waits. A lone zombie stands in your way");
        // FIXME: ZOmbie fight
        System.out.println("You let out a sigh of relief as you board the helicopter," +
                " escaping the zombies' grasp");

        System.out.println("*******End Day Seven*******");
    }

    public static void daySix(Scanner reader, int choice, Player player, String[] memoryMap) {
        System.out.println("Tuesday: 9:00am \033[3m50% " +
                "infected\033[0m \n*****************************\n");
        System.out.println("You wake up a little stressed. Or maybe you're just hungry. " +
                "You should probably go eat something.");

        choicePrompt();
        System.out.println("Go to the Munchie Mart/Go to Commons");
        choice = getValidChoice(reader);
        if(choice == 1) {
            System.out.println("You pick up some frozen food at Munchie");
            // FIXME: Health +10HP
        }
        else {
            System.out.println("Your Commons food is a little strange tasting. You" +
                    " get a stomachache");
            // FIXME: Health -5HP
        }

        System.out.println("You see a group of people outside of commons as you exit." +
                " You want to make more friends.");

        choicePrompt();
        System.out.println("Do you smile and wave/go talk to them");
        choice = getValidChoice(reader);
        if(choice == 1) {
            System.out.println("They stare at you deadpan, their eyes tracking you as you walk" +
                    " around the corner and pass them. You swear you saw one of them eating a finger");
        }
        else {
            System.out.println("As you walk towards them, you notice an unusual odor." +
                    " Every step you take, you feel the stench heighten in intensity." +
                    " You start to second guess yourself, but commit to the interaction." +
                    " As you're about to introduce yourself, you notice their tattered" +
                    " and blood-stained clothing. They're ZOMBIES!");
            // FIXME: Zombie attack
        }

        System.out.println("You return to your dorm. After that encounter, you need to de-stress");

        choicePrompt();
        System.out.println("Do you find people to hang out with/Play video games in your dorm");
        choice = getValidChoice(reader);
        if(choice == 1) {
            if(51 >= 50) {//FIXME
                System.out.println("As you walk back to your dorm late at night, you hear voices talking.");
                System.out.println("\"Bro! Tonight was so fun\"");
                System.out.println("\"Yeah bro we went wild!\"");
                System.out.println("\"Sig Chi brothers for lyfe!\"");
                System.out.println("You turn your head to see zombies wearing tattered pink polos and" +
                        " khaki shorts walking in your direction. They look at you");
                System.out.println("\"What did you think bro?\"");
                System.out.println("It's the frats. The had a party. \033[3mOh no\033[0m");
                // FIXME: Zombie fight
            } else {
                System.out.println("You try to make friend, but you fail"); // FIXME: This whole frat boi thing
            }
        }
        else {
            System.out.println("You play games and talk to your roommate");
        }

        System.out.println("You go to sleep late");

        System.out.println("*******End Day Six*******");
    }

    public static void dayFive(Scanner reader, int choice, Player player, String[] memoryMap) {
        System.out.println("Monday: 8:00am Classes Start \033[3m35% " +
                "infected\033[0m \n*****************************\n");
        System.out.println("You wake up on your floor clutching one of your roommate's pillows." +
                " As you wipe the drool from your face, you grab your phone to check the time" +
                " You only have 10 minutes to get to class you are still exhausted from last night");

        choicePrompt();
        System.out.println("Skip 8am class/go to class");
        choice = getValidChoice(reader);
        if(choice == 1) {
            System.out.println("You crawl back into the glorious slumber you were previously in.");
            // FIXME: Health +5HP
        }
        else {
            System.out.println("George, the guy sitting next you you starts a conversation with you");
            System.out.println("\"If you want, you can join me in Eskind Library. I" +
                    " reserved a room there");
            System.out.println("You go to Eskind with him but the glass walls in the room make you" +
                    " feel uncomfortable so you leave early to explore");
        }

        System.out.println("You hear your stomach growl. You need to eat something");

        choicePrompt();
        System.out.println("Go to Rand like everyone else/Go to Satay");
        choice = getValidChoice(reader);
        if(choice == 1) {
            System.out.println("You stand in line for an hour waiting for a Rand Bowl, but" +
                    " now it's time for class");
            System.out.println("You skip lunch");
            // FIXME: Health -5HP
        }
        else {
            System.out.println("You eat a wonderful meal");
            // FIXME: Health +5HP
        }

        System.out.println("As you leave your last class, you overhear people talking about"+
                " an email they got that said classes are cancelled for the week. You keep" +
                " refreshing your email to see if they’re right but don’t see anything until" +
                " you realize it was in your spam folder.");

        choicePrompt();
        System.out.println("Continue to study for classes because the email was vague/" +
                "Stop studying and go back to your dorm");
        choice = getValidChoice(reader);
        if(choice == 1) {
            System.out.println("You feel accomplished after a long study session");
        }
        else {
            System.out.println("You see a figure on the bridge attack George from your 8am");
            System.out.println("Maybe you should take this more seriously");
        }

        System.out.println("Later that night in your dorm, you hear people talking about" +
                " another zombie attack that happened outside of Rand earlier that day. \"Someone" +
                " posing as a willskilz instructor took a bite out of the president of the climbing team!");

        choicePrompt();
        System.out.println("Join the conversation/Go to sleep early");
        choice = getValidChoice(reader);
        if(choice == 1) {
            System.out.println("You become closer with this group and they help you feel" +
                    " less nervous about the zombies");
            // FIXME +10SI
        }
        else {
            System.out.println("You go to bed stressed and don't get any sleep");
            // FIXME: -5HP
        }

        System.out.println("*******End Day Five*******");
    }

    public static void dayFour(Scanner reader, int choice, Player player, String[] memoryMap) {
        System.out.println("Sunday: 10:00am \033[3m25% " +
                "infected\033[0m \n*****************************\n");
        System.out.println("Today you have your advisor meeting. You get ready and head over to " +
                "Featheringill.");

        choicePrompt();
        System.out.println("Do you leave 5 minutes early and skip breakfast/leave on time and eat" +
                " breakfast?");
        choice = getValidChoice(reader);

        if(choice == 1) {
            System.out.println("Turns out you had wrongly estimated the time. But thankfully " +
                    "leaving early means you arrived on time. But you are hungry and your stomach" +
                    " grumbles loudly. You know everyone can hear it.");
            player.changeSI(-10);
            player.changeHP(10);
        }
        else {
            System.out.println("Turns out you had wrongly estimated the time. And so leaving on " +
                    "time means you're late to the meeting. Not a great first impression. But at " +
                    "least you're not hungry!");
            player.changeSI(10);
            player.changeHP(-10);
        }

        System.out.println("As you head back to Commons, you notice a man trailing you in the " +
                "distance. He looks like a creepy Saint Nicholas. He has a scraggly white beard " +
                "and wearing fluffy red clothes. He is limping. Isn't he a physics professor " +
                "here?");

        choicePrompt();
        System.out.println("Do you engage with creepy Santa/run away and go back to dorm?");
        choice = getValidChoice(reader);
        if(choice == 1) {
            System.out.println("He's a ZOMBIE!!");
            Environment.zombieEncounter(player);
        }
        else {
            System.out.println("As you walk away, you notice that he's wearing your friend's " +
                    "watch. Weird...");
        }

        System.out.println("Once back in your dorm, your RA pops in.");
        System.out.println("\"Hey, I see you just got back. We have a floor meeting in five. Just" +
                " a reminder. See you there.\" Your RA is kinda awkward but she seems nice enough");
        System.out.println("You arrive at the floor meeting and sit in a couch in the corner. You" +
                " don't see your roommate.");

        choicePrompt();
        System.out.println("You get a call from your roommate in the middle of the meeting. Do " +
                "you answer/decline it?");
        choice = getValidChoice(reader);
        if(choice == 1) {
            System.out.println("You leave the meeting to take the call. You hear muffled noise " +
                    "and panting. \"Help me! There's a dude and he's chasing after me! I'm " +
                    "outside Peabody Library!\"");
            System.out.println("Could it be...that creepy Santa??");

            choicePrompt();
            System.out.println("Do you go to Peabody Library/return to meeting?");
            int choice2 = getValidChoice(reader);
            if(choice2 == 1) {
                System.out.println("They sounded super scared. You're worried so you ditch the " +
                        "floor meeting. Outside Peabody, there is nothing but darkness...");
                System.out.println("\nSuddenly something grabs you!! A ZOMBIE!!!");
                Environment.zombieEncounter(player);
            }
            else {
                System.out.println("You return to meeting.");
            }
        }
        else {
            System.out.println("You return to meeting.");
        }

        System.out.println("What an eventful day!");
        System.out.println("*******End Day Four*******");

    }
    public static void dayThree(Scanner reader, int choice, Player player, String[] memoryMap) {
        System.out.println("Saturday: 9:00am \033[3m10% " +
                "infected\033[0m \n*****************************\n");
        System.out.println("You awake to your roommate's bird alarm that supposed to wake people " +
                "up naturally. It did not feel natural. They continue to sleep...");

        choicePrompt();
        System.out.println("Do you wake your roommate and tell them to turn off alarm/wake up " +
                "yourself and turn it off?");
        choice = getValidChoice(reader);
        if(choice == 1) {
            System.out.println("Your roommate is unhappy and tells you to shut up. You two fight." +
                    " You both end up awake and grumpy.");
            player.changeSI(10);
        }
        else {
            System.out.println("You wake up and fumble around their alarm clock. It's confusing " +
                    "but you figure it out. Your roommate awakes now and you exchange polite " +
                    "\"mornings\". All is well.");
            player.changeSI(-10);
        }

        System.out.println("You walk to Rand for breakfast. But it hasn't opened yet so you grab " +
                "food at Food For A Thought cafe at Central Library. You have a V-squared Mentor " +
                "meeting in half an hour and you leisurely make your way to it. You are excited " +
                "to meet a fellow engineer who is an upperclassman.");
        System.out.println("While you were able to find Featheringill Hall on time, you get " +
                "confused inside.");
        Environment.addLocation("Featheringill Hall", memoryMap);

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
            player.changeHP(-10);
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
            System.out.println("Press R to Run or F to Fight");
            Environment.zombieEncounter(player);
        }
        else {
            System.out.println("You enjoy a peaceful afternoon.");
        }

        System.out.println("It is time for Founders Walk. You gather in front of your house and " +
                "put on your house shirt. It is gray and drab. Free stuff, right?");
        choicePrompt();
        System.out.println("Do you complain out loud about the shirt/keep to yourself and just " +
                "wear the damn shirt?");
        choice = getValidChoice(reader);
        if(choice == 1) {
            System.out.println("Someone nearby hears you complaining and joins in. You make a new" +
                    " friend :). Bonding over the worst.");
            player.changeSI(-10);
        }
        else {
            System.out.println("You keep to yourself and make no new friends at Founders Walk. " +
                    "It's okay, pshaw.");
            player.changeSI(10);
        }

        System.out.println("*******End Day Three*******");

    }

    public static void dayTwo(Scanner reader, int choice, Player player, String[] memoryMap) {
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
            System.out.println("You discover these secret tunnels underneath the building of " +
                    "Stevenson. As you wander, you hear a moan behind and you hide. In the " +
                    "tunnels is a person strapped to a hospital bed!! Their skin is turning " +
                    "greenish and peeling off. Their eyes are pure white. Scared, you flee. What " +
                    "a scary experience!");
            Environment.addLocation("Stevenson Building", memoryMap);
        }
        else {
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
            player.changeSI(10);
            player.changeHP(10);
        }

        System.out.println("Visions is full of awkward icebreakers but the group seems generally " +
                "nice so you are relieved. Yet you still dread the next meeting. As a group, you " +
                "head over to Langford Auditorium to watch a skit. You have realized you're " +
                "soaked in sweat in this 90 degree weather by the time you get there.");
        Environment.addLocation("Langford Auditorium", memoryMap);

        choicePrompt();
        System.out.println("Do you remain in your soaked clothes/quickly run back to your dorm to" +
                " apply deodorant?");
        choice = getValidChoice(reader);

        if(choice == 1) {
            System.out.println("You decide to stick with your group. However, with your soaked " +
                    "clothes and a slight smell coming from you, no one sits besides you. It's " +
                    "okay though because you estimate that by the time the skit is over, your " +
                    "sweat will have dried and no longer have sweat stains. You missed the entire" +
                    " skit thinking about sweating. Later as a group, you explore the roof of " +
                    "Light Hall.");
            player.changeSI(10);
            Environment.addLocation("Light Hall", memoryMap);
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

        System.out.println("Night falls and you get ready for bed. Your roommate confesses to you" +
                " that they must blast white noise in order to fall asleep. You require dead " +
                "silence to sleep.");

        choicePrompt();
        System.out.println("Do you confront them/do not confront them and just try to sleep?");
        choice = getValidChoice(reader);
        if(choice == 1) {
            System.out.println("You come to a civil agreement and decide it is okay to softly " +
                    "play their white noise.");
            player.changeHP(-10);
        }
        else {
            System.out.println("You can't sleep all night long and are exhausted in the morning.");
            player.changeHP(10);
        }

        System.out.println("*******End Day Two*******");
    }

    public static void dayOne(Scanner reader, int choice, Player player, String [] memoryMap) {
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
            Environment.addLocation("Commons Dining Hall", memoryMap);
        }
        else if(choice == 2) {
            player.changeHP(10);
            Environment.addLocation("Commons Dining Hall", memoryMap);
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

            Environment.addLocation("Rand Dining Hall", memoryMap);
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
