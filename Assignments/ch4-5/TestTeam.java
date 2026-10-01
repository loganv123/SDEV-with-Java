
import java.util.Scanner;
public class TestTeam 
{
    public static void main(String[] args)
    {
        Team team1 = new Team();
        Team team2 = new Team();
        Team team3 = new Team();

        System.out.println("Enter information for Team 1 >> ");
        team1 = setTeamData();
        System.out.println("Enter information for Team 2 >> ");
        team2 = setTeamData();
        System.out.println("Enter information for Team 3 >> ");
        team3 = setTeamData();

        System.out.println("\nTeam 1 information: ");
        displayTeamData(team1);
        System.out.println("\nTeam 2 information: ");
        displayTeamData(team2);
        System.out.println("\nTeam 3 information: ");
        displayTeamData(team3);
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
    public static void displayTeamData(Team team)
    {
        System.out.println("Team name: " + team.getTeamName());
        System.out.println("School name: " + team.getSchoolName());
        System.out.println("Sport type: " + team.getSportType());
        System.out.println("Motto: " + Team.MOTTO);
    }

}
