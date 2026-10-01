
import java.util.Scanner;
public class TestGame 
{
    public static void main(String[] args)
    {
        System.out.println("Enter information for Team 1 >> ");
        Team team1 = setTeamData();
        System.out.println("Enter information for Team 2 >> ");
        Team team2 = setTeamData();
        System.out.print("Enter game time: ");
        Scanner keyboard = new Scanner(System.in);
        String gameTime = keyboard.nextLine();

        Game game = new Game(team1, team2, gameTime);
        displayGameData(game);

        
    }
    public static Team setTeamData()
    {
        Scanner keyboard = new Scanner(System.in);

        System.out.print("Enter team name: ");
        String name = keyboard.nextLine();
        System.out.print("Enter school name: ");
        String school = keyboard.nextLine();
        System.out.print("Enter sport type: ");
        String sport = keyboard.nextLine();

        Team team = new Team(name, school, sport);
        return team;
    }
    public static void displayGameData(Game game)
    {
        System.out.println("\nGame time: " + game.getGameTime());
        System.out.println("Team 1: " + game.getTeam1().getTeamName());
        System.out.println("School name: " + game.getTeam1().getSchoolName());
        System.out.println("Sport type: " + game.getTeam1().getSportType());
        System.out.println("Motto: " + Team.MOTTO);
        System.out.println("Team 2: " + game.getTeam2().getTeamName());
        System.out.println("School name: " + game.getTeam2().getSchoolName());
        System.out.println("Sport type: " + game.getTeam2().getSportType());
        System.out.println("Motto: " + Team.MOTTO);
    }
}
