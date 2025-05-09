public class GoalKeeper extends FootballPlayer {
    private int countOfSaves;

    public GoalKeeper(String name, int number, String team,
                      int redCard, int yellowCard, int goals, int saves) {
        super(name, number, team, redCard, yellowCard, goals);
        this.countOfSaves = saves;
    }

    @Override
    public void getInfo() {
        super.getInfo();
        System.out.println("Saves: " + countOfSaves);
    }
}