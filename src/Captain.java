public class Captain extends UltimatePlayer
{
    boolean type;
    public Captain(String firstName, String lastName, String position, boolean type)
    {
        super(firstName, lastName, position);
        this.type = type;
    }
    public Captain()
    {
        super();
        type = false;
    }
    public String toString()
    {
        String captain;
        if (type)
        {
            captain = "offense";
        }
        else
        {
            captain = "defense";
        }
        return super.toString()  + "\n   Captain: " + captain;
    }
}
