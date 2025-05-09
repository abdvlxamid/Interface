public class Main {
    public static void main(String[] args) {
        FootballPlayer fp = new FootballPlayer("Cristiano Ronaldo", 7, "Al-Nassr", 1, 3, 25);
        GoalKeeper gk = new GoalKeeper("Manuel Neuer", 1, "Bayern Munich", 0, 1, 0, 100);
        VolleyballPlayer vp = new VolleyballPlayer("Ivan Zaytsev", 9, "Italy", 45);
        Setter setter = new Setter("Bruno Rezende", 6, "Brazil", 40, 20);
        BasketballPlayer bp = new BasketballPlayer("LeBron James", 23, "Lakers", 35);
        PointGuard pg = new PointGuard("Stephen Curry", 30, "Warriors", 33, 15);

        System.out.println("=== Football Player ===");
        fp.getInfo();
        System.out.println("\n=== Goal Keeper ===");
        gk.getInfo();
        System.out.println("\n=== Volleyball Player ===");
        vp.getInfo();
        System.out.println("\n=== Setter ===");
        setter.getInfo();
        System.out.println("\n=== Basketball Player ===");
        bp.getInfo();
        System.out.println("\n=== Point Guard ===");
        pg.getInfo();
    }
}
