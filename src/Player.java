public class Player implements Information {
    private String nameOfPlayer;
    private String sportType;
    private int numberPosition;
    private String teamName;

    public Player(String nameOfPlayer, String sportType, int numberPosition, String teamName){
        this.nameOfPlayer = nameOfPlayer;
        this.sportType = sportType;
        this.numberPosition = numberPosition;
        this.teamName = teamName;

    }

    @Override
    public void getInfo(){
        System.out.println("Name: " + nameOfPlayer + ", Sport: " + sportType +
                ", Position: " + numberPosition + ", Team: " + teamName);
    }

    @Override
    public String getTeamName() {
        return teamName;
    }

}
