package g2.practice5.subclassing.elevator;

/**
 * @version 1.0
 */
public class Elevator {


    final int MAX_LEVEL;
    final int MIN_LEVEL;
    int currentLevel;

    public Elevator(int MAX_LEVEL, int MIN_LEVEL, int currentLevel) {
        this.MAX_LEVEL = MAX_LEVEL;
        this.MIN_LEVEL = MIN_LEVEL;
        this.currentLevel = currentLevel;
    }

    public void goUp(){
        System.out.println("Subiendo....".toUpperCase());
        if(currentLevel < MAX_LEVEL) {
            currentLevel++;
        }
        System.out.println("Ud. está en el piso " + currentLevel + ".");
    }

    public void goDown(){
        if(currentLevel < MIN_LEVEL) {
            currentLevel--;
        }
    }
}
