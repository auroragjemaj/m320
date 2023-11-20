public class Main {
    public static void main(String[] args) {
        Goalie g = new Goalie("aurora", 1.58);
        Angreifer a = new Angreifer("yan");
        Verteidiger v = new Verteidiger("ruben");


        Mannschaft m = new Mannschaft();
        m.spielerListe.add(g);
        m.spielerListe.add(a);
        m.spielerListe.add(v);

        m.zeigeMannschaft();
    }
}