package ashfaque;

public class Cricket extends Sports{
    String matchType;
    int over;
    Player player;
    Cricket(String matchType, int over, Player player)
    {
        this.matchType = matchType;
        this.over = over;
        this.player = player;
    }
    void display()
    {
        System.out.println("Match type is: " + matchType);
        System.out.println("Over of the match is: " + over);
        System.out.println("Name of the player is: " + player.playerName);
        System.out.println("Jersey Number of the player is: " + player.jerseyNumber);
    }

    /*
    Name: Md. Ashfaqur Rahman
    ID: 2012020129
    Section: C
    Email: cse_2012020129@lus.ac.bd
    Date: 06-08-2021
    */
}
