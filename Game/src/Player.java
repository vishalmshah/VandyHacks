import java.util.*;

public class Player {
    private int HP;
    private int SI;
    private String location;

    //default constructor
    public Player () {
        HP = 100;
        SI = 100;
        location = "Dorm Room";
    }

    public void setHP(int userHP) {
        HP = userHP;
    }

    public void setSI(int userSI) {
        SI = userSI;
    }

    public void setLocation(String userLocation) {
        location = userLocation;
    }

    //If HP reaches 0, the game is over
    public int getHP() {
        if (this.HP == 0) {
            System.out.println("You have died. Better luck next time.");
        } else if (this.HP <= 30) {
            System.out.println("Be careful, your HP has dropped dangerously low");
        }
        return this.HP;
    }

    //If SI reaches 0, the game is over
    public int getSI() {
        if (this.SI == 0) {
            System.out.println("You have died.  Better luck next time.");
        } else if (this.SI <= 30){
            System.out.println("Be careful, your SI has dropped dangerously low");
        }
        return this.SI;
    }

    public String getLocation() {
        return this.location;
    }

    public int changeHP(int lossOfHP) {
        HP = HP - lossOfHP;
        System.out.println("You lose " + lossOfHP + "HP");
        System.out.println("HP: " + HP);
        if(HP <= 0) {
            System.out.println("You have died. Better luck next time.");
            System.exit(0);
        }
        return HP;
    }

    public int changeSI(int lossOfSI) {
        SI = SI - lossOfSI;
        System.out.println("You lose " + lossOfSI + "HP");
        System.out.println("HP: " + SI);
        if(SI <= 0) {
            System.out.println("You have died. Better luck next time.");
            System.exit(0);
        }
        return SI;
    }

}
