public class BasketballPlayer extends Player {
    private int numberOfGoals;

    public BasketballPlayer(String name, int number, String team, int goals) {
        super(name, "Basketball", number, team);
        this.numberOfGoals = goals;
    }

    @Override
    public void getInfo() {
        super.getInfo();
        System.out.println("Goals: " + numberOfGoals);
    }
}