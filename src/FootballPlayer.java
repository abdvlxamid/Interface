public class FootballPlayer extends Player{
    private int countOfRedCard;
    private int countOfYellowCard;
    private int countOfGoals;

    public FootballPlayer(String name, int number, String team,
                          int redCard, int yellowCard, int goals) {
        super(name, "Football", number, team);
        this.countOfRedCard = redCard;
        this.countOfYellowCard = yellowCard;
        this.countOfGoals = goals;
    }
    @Override
    public void getInfo() {
        super.getInfo();
        System.out.println("Red Cards: " + countOfRedCard + ", Yellow Cards: " +
                countOfYellowCard + ", Goals: " + countOfGoals);
    }
}
