package g2.practice5.subclassing.elevator;

import g1.practice5.elevator.ElevatorV2;

public class ElevatorTest {
    public static void main(String[] args) {
        Elevator ev1 = new Elevator(10, 1, 1);
        Elevator2 ev2 = new Elevator2(10, 1, 1);


        ev1.goUp();
    }
}
