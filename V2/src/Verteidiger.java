public class Verteidiger extends Spieler {
    Verteidiger(String name) {
        super(name);
    }

    public void verteidigen() {
        System.out.println("ich blocke Angriffe");
    }

    @Override
    public void spielen() {
        System.out.println("Ich habe einen Ball geblockt");
    }
}