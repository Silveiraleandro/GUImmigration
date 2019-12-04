package modelnova;

public enum Priority
{
    HIGH(3),
    MEDIUM(2),
    LOW(1);

    private int intValue;

    private Priority( int intValue ){
        this.intValue = intValue;
    }

    public int getPriority(){
        return intValue;
    }
}
