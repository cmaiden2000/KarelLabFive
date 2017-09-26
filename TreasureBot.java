
import kareltherobot.*; 


/**
 * @author :  D. Appel
 */
public class TreasureBot extends Robot
{
    int clue;
    public TreasureBot(int st, int av, Direction dir, int numBeepers) {
        super(st, av, dir, numBeepers);
    }
    
    public void findTreasure() {
        
        findClues();
    }
    public boolean findClues(){
        while (frontIsClear()){
            clue = 0;
            move();
            if (nextToABeeper()){
                pickBeeper();
                clue ++;
                if (clue == 1){
                    faceNorth();
                }
                else if(clue == 2){
                    faceEast();
                }
                else if(clue == 3){
                    faceSouth();
                }
                else if(clue == 4){
                    faceWest();
                }   
            }
        }
        return true;
    }
    public boolean faceNorth(){
        
        if (facingWest()){
            turnRight();
            findClues();
        }
        else if (facingSouth()){
            turnLeft();
            turnLeft();
            findClues();
        }
        else if (facingEast()){
            turnLeft();
            findClues();
        }
        else{
            findClues();
        }  
        return true;
        }
    public boolean faceEast(){
        if (facingWest()){
            turnLeft();
            turnLeft();
            findClues();
        }
        else if (facingSouth()){
            turnLeft();
            findClues();
        }
        else if (facingNorth()){
            turnRight();
            findClues();
        }
        else{
            findClues();
        }  
        return true;
        }
    public boolean faceSouth(){
        if (facingWest()){
            turnLeft();
            findClues();
        }
        else if (facingEast()){
            turnRight();
            findClues();
        }
        else if (facingNorth()){
            turnLeft();
            turnLeft();
            findClues();
        }
        else{
            findClues();
        }  
        return true;
    }
    public boolean faceWest(){
        if (facingEast()){
            turnLeft();
            turnLeft();
        }
        else if (facingNorth()) {
            turnLeft();
        }
        else if (facingSouth()) {
            turnRight();
        }
        else {
            findClues();
        }
        return true;
    }
    public void turnRight(){
        turnLeft();
        turnLeft();
        turnLeft();
    }
    }
    

