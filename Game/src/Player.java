import java.util.*;

public class Player {
    private int HP;
    private int SI;
    private int foodCount;
    private String location;

    //default constructor
    public Player () {
        HP = 100;
        SI = 100;
        foodCount = 0;
        location = "Dorm Room";
    }

    public void setHP(int userHP) {
        HP = userHP;
    }

    public void setSI(int userSI) {
        SI = userSI;
    }

    public void setFoodCount(int userFoodCount) {
        foodCount = userFoodCount;
    }

    public void setLocation(String userLocation) {
        location = userLocation;
    }

    //If HP reaches 0, the game is over
    public int getHP() {
        if (this.HP == 0) {
            System.out.println("You have died.  Better luck next time.");
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

    public int getFoodCount() {
        return this.foodCount;
    }

    public String getLocation() {
        return this.location;
    }

    public int changeHP(int lossOfHP) {
        HP = HP - lossOfHP;
        return HP;
    }

    public int changeSI(int lossOfSI) {
        SI = SI - lossOfSI;
        return HP;
    }


    /*
    2D player simple methods

    set up like memory of location coordinates, (if they've been to light hall before, they have
    coordinates saved)
    when you go to location for a first time you store that location

    store inventory of locations....

     */

}
