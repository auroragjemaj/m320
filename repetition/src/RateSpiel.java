import java.util.Random;
import java.util.Scanner;

class RateSpiel {
    private int richtigeZahl;
    private int versuche;

    public RateSpiel() {
        Random random = new Random();
        richtigeZahl = random.nextInt(50) + 1;
        versuche = 0;
    }

    public int Eingabe() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Rat mal! (Zahlen sind 1-50): ");
        return scanner.nextInt();
    }

    public boolean Ausgaben(int benutzerZahl) {
        versuche++;
        if (benutzerZahl == richtigeZahl) {
            System.out.println("du hast die Zahl erraten!!");
            System.out.println("versuche: " + versuche);
            return true;
        } else if (benutzerZahl < richtigeZahl) {
            System.out.println("versuche eine grössere Zahl.");
        } else {
            System.out.println("versuche eine kleinere Zahl.");
        }
        return false;
    }

    public void Spiel() {
            System.out.println("Willkommen! Aurora & Yan's Rate-Spiel!");
        boolean gewonnen = false;

        while (!gewonnen) {
            int eingabe = Eingabe();
            gewonnen = Ausgaben(eingabe);
        }
    }
}

