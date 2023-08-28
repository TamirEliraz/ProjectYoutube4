package sim;

import helper.Point;

public class States extends Point<MovementState, AliveState> {
    protected States() {
        super(MovementState.init(), AliveState.init());
    }
    public void startMoving(){
        setX(MovementState.MOVING);
    }
    public void stopMoving(){
        setX(MovementState.NOT_MOVING);
    }
}
