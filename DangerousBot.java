
import kareltherobot.*; 


/**
 * @author :  D. Appel
 */
public class DangerousBot extends Robot
{
    public DangerousBot(int st, int av, Direction dir, int numBeepers) {
        super(st, av, dir, numBeepers);
        int beepers;
        
    }
    
    public void choosePile() {
        checkPile();
    }
    public boolean checkPile(){
        if (nextToABeeper()){
            while (nextToABeeper()){
                pickBeeper();
                beepers ++;
            }
            if (beepers % 2 = 0){
                turnRight();
            }
            else{
                turnLeft();
            }
        }
    }
    public void turnRight(){
        turnLeft();
        turnLeft();
        turnLeft();
    }
}

