public class Angreifer extends Spieler {
    public Angreifer(String name) {
        super(name);
    }

    public void jobTraining() {
        System.out.println("Ich erziele Tore.");
    }

    @Override
    public void spielen() {
        System.out.println("Ich habe angegriffen!");
    }
}