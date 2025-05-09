public class PointGuard extends BasketballPlayer {
    private int countOfGuard;

    public PointGuard(String name, int number, String team, int goals, int guard) {
        super(name, number, team, goals);
        this.countOfGuard = guard;
    }

    @Override
    public void getInfo() {
        super.getInfo();
        System.out.println("Guard count: " + countOfGuard);
    }
}