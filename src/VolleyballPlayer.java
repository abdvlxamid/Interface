public class VolleyballPlayer extends Player {
    private int numberOfPoints;

    public VolleyballPlayer(String name, int number, String team, int points) {
        super(name, "Volleyball", number, team);
        this.numberOfPoints = points;
    }

    @Override
    public void getInfo() {
        super.getInfo();
        System.out.println("Points: " + numberOfPoints);
    }
}