public class Setter extends VolleyballPlayer {
    private int countOfSets;

    public Setter(String name, int number, String team, int points, int sets) {
        super(name, number, team, points);
        this.countOfSets = sets;
    }

    @Override
    public void getInfo() {
        super.getInfo();
        System.out.println("Sets: " + countOfSets);
    }
}