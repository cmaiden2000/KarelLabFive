
import kareltherobot.*; 


/**
 * @author :  D. Appel
 */
public class DangerousBot extends Robot
{
    int beepers;
    
    DangerousBot(int st, int av, Direction dir, int numBeepers) {
        super(st, av, dir, numBeepers);
        
        
        
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
            if (beepers % 2 == 0){
                turnRight();
                move();
                turnOff();
            }
            else{
                turnLeft();
                move();
                turnOff();
                
            }
            
        }
        return true;
    }
    public void turnRight(){
        turnLeft();
        turnLeft();
        turnLeft();
    }
}

