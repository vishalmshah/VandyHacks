// **********************************************************************************************
// Program Name: -----
// Name: Sianna Xu   
// VUnetID: xuss
// Email: sianna.s.xu@vanderbilt.edu
// Class: CS 1101 - Vanderbilt University
// Section: 01 MWF Arena
// Date: --/--/--
// Honor statement: I attest that I understand the honor code for this class and have neither given 
//                  nor received any unauthorized aid on this assignment.
//
// Program Description:
//     user types name and programs prints out a sentence with name
//
// **********************************************************************************************
import java.util.*;

public class Environment {

    public static void main(String[] args) {
        String memoryMap[] = new String[10]; //array with maximum number of locations as 10
    }

    //method that presents you with options when you encounter a zombie
    public static void zombieEncounter(Player character) {
        Scanner scnr = new Scanner(System.in);
        char choice = getValidChar(scnr);

        if ((choice == 'R') || (choice == 'r')) {
            //lose 10 HealthPoints from the energy it takes to run away
            character.changeHP(10);
            System.out.println("You lost 10 HP from running away from the zombie.");
        } else {
            //chose to fight
            boolean winOrLose = fightZombie(character);
            //FIXME: need to call something for consequence of dying
        }
    }

    //determines result of zombie fight
    public static boolean fightZombie (Player character) {
        Random rand = new Random();
        //bounds for random number generator: can produce the value 1, 2, or 3
        int max = 3;
        int min = 1;

        int randomNum = rand.nextInt((max - min) + 1) + min;

        //random number generated determines if you survive zombie attack and HP (health points)
        if (randomNum == 1) {
            //false means become zombie
            return false;
        } else if (randomNum == 2) {
            //fight takes a lot of energy and you lose 40 health points
            character.changeHP(40);
            System.out.println("Zombie fight took a lot of energy and you lost 40 HP.");
            return true;
        } else {
            //fight doesn't take as much energy and you only lose 10 HealthPower points
            character.changeHP(10);
            System.out.println("You did great in the zombie fight and ony lost 10 HP!");
            return true;
        }
    }

    /**
     getValidChar -
     * This method checks if the user entered one of the valid characters to respond to prompt
     * (R or F)
     *
     * @param scnr -- scanner that allows user input to be read
     * @return -- char of the validated letter
     */
    public static char getValidChar (Scanner scnr) {
        //prompt user for initial letter input
        System.out.println("Enter R if you choose to run or F if you choose to fight the zombie:");
        String charStr = scnr.nextLine();

        //create string scanner
        Scanner charStrScanner = new Scanner(charStr);

        //set initial letter variable to an invalid value
        char letter = 'Z';

        //check if the user entered something
        if (charStr.length() != 0) {
            //check if the string has a next value and if it does, get it
            if (charStrScanner.hasNext()) {
                String str = charStrScanner.next();
                //get the character entered
                letter = str.charAt(0);
            }
        }
        /*if character entered is not one of the valid options, continue prompting user for valid
        character (insensitive case so lowercase letters entered are valid) */
        while (!(charStr.equalsIgnoreCase("R")) && !(charStr.equalsIgnoreCase("F"))) {
            //re-prompt user for a valid letter
            System.out.println("Letter entered must be either R or F. Enter your choice: ");
            charStr = scnr.nextLine();
            charStrScanner = new Scanner(charStr);

            if (charStr.length() != 0) {
                //check if the string has a next value, if it does get it
                if (charStrScanner.hasNext()) {
                    String str = charStrScanner.next();
                    letter = str.charAt(0);
                }
            }
        }
        return letter;
    }

    public static String freshmanHouse () {
        Random rand = new Random();
        //bounds for random number generator: can produce any integer from 1-10
        int max = 10;
        int min = 1;
        int randomNum = rand.nextInt((max - min) + 1) + min;
        switch (randomNum) {
            case 1:
                return "North";
            case 2:
                return "West";
            case 3:
                return "East";
            case 4:
                return "Gillette";
            case 5:
                return "Hank Ingram";
            case 6:
                return "Memorial";
            case 7:
                return "Murray";
            case 8:
                return "Stambaugh";
            case 9:
                return "Sutherland";
            case 10:
                return "Crawford";
            default:
                return "Try Again";
        }
    }

    public static void addLocation (String location, String[] memoryMap) {
        int position = 0;
        for (int index = 0; index <= memoryMap.length - 1; index++) {
            if (memoryMap[index] != null) {
                position++;
            }
        }
        memoryMap[position] = location;
    }

    public static void displayMemoryMap (String[] memoryMap) {
        for (int index = 0; index <= memoryMap.length - 1; index++) {
            if (memoryMap[index] != null) {
                if (memoryMap[index].equalsIgnoreCase("Commons")) {
                    System.out.println("Enter the letter C to go to Commons");
                }
                if (memoryMap[index].equalsIgnoreCase("Rand")) {
                    System.out.println("Enter the letter R to go to Rand");
                }
                if (memoryMap[index].equalsIgnoreCase("Satay")) {
                    System.out.println("Enter the letter S to go to Satay");
                }
                if (memoryMap[index].equalsIgnoreCase("Langford Auditorium")) {
                    System.out.println("Enter the letter L to go to Langford Auditorium");
                }
                if (memoryMap[index].equalsIgnoreCase("Featheringill")) {
                    System.out.println("Enter the letter F to go to Featheringill");
                }
            }
        }
    }

    public static char getValidLocation (Scanner scnr, String[] memoryMap) {
        //prompt user for letter corresponding to location input
        displayMemoryMap(memoryMap);
        String charStr = scnr.nextLine();

        //create string scanner
        Scanner charStrScanner = new Scanner(charStr);

        //set initial letter grade variable to an invalid value
        char letter = 'Z';

        //check if the user entered something
        if (charStr.length() != 0) {
            //check if the string has a next value and if it does, get it
            if (charStrScanner.hasNext()) {
                String gradeStr = charStrScanner.next();
                //get the character entered
                letter = gradeStr.charAt(0);
            }
        }
        /*if character entered is not one of the valid options, continue prompting user for valid
        character (insensitive case so lowercase letters entered are valid) */
        while (!(charStr.equalsIgnoreCase("R")) && !(charStr.equalsIgnoreCase("C"))
                && !(charStr.equalsIgnoreCase("S")) && !(charStr.equalsIgnoreCase("L"))
                && !(charStr.equalsIgnoreCase("F"))) {
            //re-prompt user for a valid grade
            System.out.println("Letter entered must be one of: R, C, S, L, F. Enter the letter");
            charStr = scnr.nextLine();
            charStrScanner = new Scanner(charStr);

            if (charStr.length() != 0) {
                //check if the string has a next value, if it does get it
                if (charStrScanner.hasNext()) {
                    String gradeStr = charStrScanner.next();
                    letter = gradeStr.charAt(0);
                }
            }
        }
        return letter;
    }

    public static void changeLocation (String[] memoryMap, Player character) {
        Scanner scnr = new Scanner(System.in);
        char locationLetter = getValidLocation(scnr, memoryMap);
        if (locationLetter == 'R' || locationLetter == 'r') {
            character.setLocation("Rand");
        } else if (locationLetter == 'C' || locationLetter == 'c') {
            character.setLocation("Commons");
        } else if (locationLetter == 'S' || locationLetter == 's') {
            character.setLocation("Satay");
        } else if (locationLetter == 'L' || locationLetter == 'l') {
            character.setLocation("Langford Auditorium");
        } else if (locationLetter == 'F' || locationLetter == 'f') {
            character.setLocation("Featheringill");
        }
    }

}
