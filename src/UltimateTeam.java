import java.util.ArrayList;

public class UltimateTeam
{
    ArrayList<UltimatePlayer> players;
    ArrayList<Coach> coaches;
    public UltimateTeam(ArrayList<UltimatePlayer> players, ArrayList<Coach> coaches)
    {
        this.players = players;
        this.coaches = coaches;
    }
    public String getCutters()
    {
        String c = "";
        for (int ii = 0; ii < players.size(); ii++)
        {
            if (players.get(ii).getPosition() == "cutter")
            {
                c += players.get(ii).toString() + "\n\n";
            }
        }
        return c;
    }
    public String getHandlers()
    {
        String c = "";
        for (int ii = 0; ii < players.size(); ii++)
        {
            if (players.get(ii).getPosition() == "handler")
            {
                c += players.get(ii).toString() + "\n\n";
            }
        }
        return c;
    }
    public String toString()
    {
        String c = "COACHES\n";
        for (int ii = 0; ii< coaches.size();ii++)
        {
            c += coaches.get(ii).toString() + "\n\n";

        }

        c+= "PLAYERS\n";
        for (int ii = 0; ii< players.size();ii++)
        {
            c += players.get(ii).toString() + "\n\n";
        }
        return c;
    }


}
