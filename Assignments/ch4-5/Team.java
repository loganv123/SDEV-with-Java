// Logan Vanhuffel
// p.157

public class Team 
{
    private String teamName;
    private String schoolName;
    private String sportType;
    public final static String MOTTO = "Sportsmanship!";

    public Team()
    {
        teamName = "No name";
        schoolName = "No school";
        sportType = "No sport";
    }
    public Team(String name, String school, String sport)
    {
        teamName = name;
        schoolName = school;
        sportType = sport;
    }

    public String getTeamName()
    {
        return teamName;
    }
    public String getSchoolName()
    {
        return schoolName;
    }
    public String getSportType()
    {
        return sportType;
    }
}
