
import java.util.*;

public class Storyline {
    public static void main(String[] args) {
        Random randy = new Random(11);
        Scanner reader = new Scanner(System.in);

        System.out.println("Welcome to Vanderbelt University! We're thrilled to welcome you to " +
                "our community. Go ahead and get settled in your freshmen residential college.");

        int house = randy.nextInt();
        String houseName;

        if(house == 1)
            houseName = "North";
        if(house == 2)
            houseName = "West";
        if(house == 3)
            houseName = "East";
        if(house == 4)
            houseName = "Gillette";
        if(house == 5)
            houseName = "Hank Ingram";
        if(house == 6)
            houseName = "Memorial";
        if(house == 7)
            houseName = "Murray";
        if(house == 8)
            houseName = "Stambough";
        if(house == 9)
            houseName = "Sutherland";



    }
}
