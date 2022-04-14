public class Coach extends Player
{
    String role;
    public Coach(String firstName, String lastName, String role)
    {
        super(firstName,lastName);
        this.role = role;
    }
    public Coach()
    {
        super();
        this.role ="coach";
    }
    public String toString()
    {
        return super.toString() + "\n   Role: " + role;
    }
}
