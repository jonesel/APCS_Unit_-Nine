public class Player
{
    String firstName;
    String lastName;
    public Player (String firstName, String lastName)
    {
        this.firstName = firstName;
        this.lastName = lastName;
    }
    public Player()
    {
        this.firstName = "unknown";
        this.lastName = "unknown";
    }
    public String toString()
    {
        return lastName + ", " + firstName;
    }


}
