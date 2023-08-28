package sim;

public enum AliveState {
    ALIVE, DYING, DEAD, DISAPPEARING;
    public static AliveState init(){return ALIVE;}
}
