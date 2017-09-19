


import kareltherobot.*;

/**
 * Write a description of class Template here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class DoubleBot extends Robot
{
    // instance variables - replace the example below with your own
    public int beepers;
    public int doubleBeepers;

    /**
     * Constructor for objects of class Template
     */
     public DoubleBot(int st, int av, Direction dir, int numBeepers) {
        super(st, av, dir, numBeepers);
    }

    public void doubleBeepers()
    {
        // put your code here
        findBeeperPile();
        collectAndCount();
        putAllBeepers();
    }
    public boolean findBeeperPile(){
        while (!nextToABeeper()){
            move();
        }
        return true;
    }
    public boolean collectAndCount(){
        //int beepers = 0;
        while (nextToABeeper()){
            pickBeeper();
            beepers ++;
        }
        return true;
    }
    public boolean putAllBeepers(){
        move();
        doubleBeepers = beepers;
        for (int beepers = doubleBeepers * 2;beepers > 0; beepers --){
            putBeeper();
        }
        turnLeft();
        move();
        return true;
    }
}
