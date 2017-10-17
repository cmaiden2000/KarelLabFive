
import kareltherobot.*; 


/**
 * @author :  D. Appel
 */
public class DemocracyBot extends Robot
{
    public DemocracyBot(int st, int av, Direction dir, int numBeepers) {
        super(st, av, dir, numBeepers);
    }
    
    public void fixBallots() {
        move();
        checkThirdStreet();
    }
    public boolean checkThirdStreet() {
        move();
        if (!nextToABeeper()) {
            clearRooms();
            move();
            move();
            checkThirdStreet();
        }
        else {
            turnLeft();
            move();
            if (nextToABeeper()) {
                turnLeft();
                turnLeft();
                move();
                turnLeft();
            }
            else {
                putBeeper();
                turnLeft();
                turnLeft();
                move();
                turnLeft();
            }
        }
        move();
        checkThirdStreet();
        return true;
    }
    public boolean clearRooms() {
        turnLeft();
        move();
        if (nextToABeeper()) {
            pickBeeper();
            turnLeft();
            turnLeft();
            move();
            move();
            pickBeeper();
            turnLeft();
            turnLeft();
            move();
            turnRight();
        }
        else if (!nextToABeeper()) {
            turnLeft();
            turnLeft();
            move();
            move();
            pickBeeper();
            turnLeft();
            turnLeft();
            move();
            turnRight();
        }
        return true;
    }
    public void turnRight(){
        turnLeft();
        turnLeft();
        turnLeft();
    }
}

