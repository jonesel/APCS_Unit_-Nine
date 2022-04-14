public class UltimatePlayer extends Player
{
    static int jerseyNumber = 0;
    int jersey;
    String position;

    public UltimatePlayer(String firstName, String lastName, String position)
    {
    super(firstName,lastName);
    if (position == "cutter")
    {
        this.position = "cutter";
    }
    else
    {
        this.position = "handler";
    }
    jerseyNumber++;
    jersey = jerseyNumber;
    }
    public UltimatePlayer()
    {
        super();
        jersey = 0;
        position = "handler";
    }
    public String getPosition()
    {
        return position;
    }
    public String toString()
    {
        return super.toString() + "\n   Jersey #: " + jersey + "\n" + "   Position: " + position;
    }


}
