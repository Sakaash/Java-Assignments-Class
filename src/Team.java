public class Team {
    private String name;
    private int playerCount;
    private int wins;
    private int losses;

    public Team(String name, int playerCount, int wins, int losses) {
        setName(name);
        setPlayerCount(playerCount);
        setWins(wins);
        setLosses(losses);
    }

    public String getName() {
        return name;
    }
    public void setName(String name) {
        if (name == null || name.isEmpty()) {
            throw new IllegalArgumentException("Team name cannot be empty");
        }
        else
            this.name = name;
    }
    public int getPlayerCount() {
        return playerCount;
    }
    public void setPlayerCount(int playerCount) {
        if(playerCount > 0)
            this.playerCount = playerCount;
        else
            throw new IllegalArgumentException("Player count must be greater than 0");
    }
    public int getWins() {
        return wins;
    }
    public void setWins(int wins) {
        if(wins >= 0)
            this.wins = wins;
        else
            throw new IllegalArgumentException("Wins must be positive");
    }
    public int getLosses() {
        return losses;
    }
    public void setLosses(int losses) {
        if(losses >= 0)
            this.losses = losses;
        else
            throw new IllegalArgumentException("Losses must be positive");
    }

}
class Player {
    private String name;
    private String nativeCity;
    private int goals;
    private Team team;

    public Player(String name, String nativeCity, int goals, Team team) {
        setName(name);
        setNativeCity(nativeCity);
        setGoals(goals);
        setTeam(team);
    }

    public String getName() {
        return name;
    }
    public void setName(String name) {
        if(name == null || name.isEmpty())
            this.name = name;
        else
            throw new IllegalArgumentException("Name field cannot be empty");
    }
    public String getNativeCity() {
        return nativeCity;
    }
    public void setNativeCity(String nativeCity) {
        if(nativeCity == null || nativeCity.isEmpty())
            throw new IllegalArgumentException("Native city field cannot be empty");
        else
            this.nativeCity = nativeCity;
    }
    public int getGoals() {
        return goals;
    }
    public void setGoals(int goals) {
        if(goals >= 0)
            this.goals = goals;
        else
            throw new IllegalArgumentException("Goals must be positive");
    }
    public Team getTeam() {
        return team;
    }
    public void setTeam(Team team) {
        if(team != null)
            this.team = team;
        else
            throw new IllegalArgumentException("Team field cannot be empty");
    }

}
