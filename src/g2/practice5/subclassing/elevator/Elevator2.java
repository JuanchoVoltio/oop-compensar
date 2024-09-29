package g2.practice5.subclassing.elevator;

/*
 El cliente nos pide que el ascensor no debe moverse si hay un peso mayor a 700kg.
 */

/**
 * @version 2.0
 */
public class Elevator2 {


    final int MAX_LEVEL;
    final int MIN_LEVEL;
    int currentLevel;

    public Elevator2(int MAX_LEVEL, int MIN_LEVEL, int currentLevel) {
        this.MAX_LEVEL = MAX_LEVEL;
        this.MIN_LEVEL = MIN_LEVEL;
        this.currentLevel = currentLevel;
    }

    public void goUp(){
        System.out.println("Går opp....".toUpperCase());
        if(currentLevel < MAX_LEVEL) {
            currentLevel++;
        }
        System.out.println("Du er på nivå " + currentLevel + ".");
    }

    public void goDown(){
        if(currentLevel < MIN_LEVEL) {
            currentLevel--;
        }
    }

    public void goTo(int level){
        if(level < currentLevel){
            while(currentLevel != level) {
                goDown();
            }
        }else if(level > currentLevel){
            while(currentLevel != level) {
                goUp();
            }
        }
    }
}
